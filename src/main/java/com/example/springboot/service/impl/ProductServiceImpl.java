package com.example.springboot.service.impl;

import com.example.springboot.mapper.ProductMapper;
import com.example.springboot.mapper.Sales_RecordMapper;
import com.example.springboot.model.Comment;
import com.example.springboot.model.Product;
import com.example.springboot.model.ProductExample;
import com.example.springboot.model.Sales_Record;
import com.example.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    Sales_RecordMapper sales_recordMapper;

    @Override
    public Object selectAllProduct(int currPage, int pageSize) {
        Map<String, Integer> data = new HashMap<>();
        data.put("currPage", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", productMapper.selectAll(data));
        Long recordsCount = productMapper.countByExample(new ProductExample());
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object selectProductByType(int currPage, int pageSize, String type) {
        Map<String, Object> data = new HashMap<>();
        data.put("currPage", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("type", type);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", productMapper.selectType(data));
        Long recordsCount = productMapper.countByType(type);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Product selectById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> selectByName(String name) {
        return productMapper.selectByName(name);
    }

    @Override
    public Object selectComment(int currPage, int pageSize, Integer productId) {
        Map<Object, Object> data = new HashMap<>();
        data.put("currPage", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("productId", productId);
        Map<Object, Object> resultMap = new HashMap<>();
        List<Sales_Record> list = sales_recordMapper.selectCommentByProductId(data);
        List<Comment> comments = new LinkedList<>();
        for(Sales_Record record : list) {
            Comment comment = new Comment();
            comment.setCommentDate(record.getCommentDate());
            comment.setCommentAddInfo(record.getCommentAddtextInfo());
            comment.setCommentAsDescription(record.getAsDescription());
            comment.setCommentPicInfo(record.getCommentPicInfo());
            comment.setCommentId(record.getSaleRecordId());
            comment.setCommentTextInfo(record.getCommentTextInfo());
            comment.setCommentResponseSpeed(record.getResponseSpeed());
            comment.setCommentServeAtitude(record.getServeAttitude());
            comment.setCommentCustomer(record.getSalesRecordCustomer());
            comment.setCommentMerchant(record.getSalesRecordMerchant());
            comment.setCommentProduct(record.getSalesRecordProduct());
            comments.add(comment);
        }
        resultMap.put("data", comments);
        Long recordsCount = sales_recordMapper.countByProductId(productId);
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }
}
