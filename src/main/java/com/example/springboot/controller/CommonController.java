package com.example.springboot.controller;

import com.example.springboot.service.CustomerService;
import com.example.springboot.service.ProductService;
import com.example.springboot.service.SaleRecordService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 通用操作控制类
 */
@Controller
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@MapperScan(basePackages = "com/example/springboot/mapper")
public class CommonController {

    @Autowired
    ProductService productService;

    @Autowired
    SaleRecordService saleRecordService;

    @Autowired
    CustomerService customerService;


    /**
     * 查询所有商品
     * @return
     */
    @PostMapping(value = "/product/all")
    @ResponseBody
    public Object selectAllProducts(@RequestParam("currPage") Integer currPage,
                                    @RequestParam("pageSize") Integer pageSize) {
        return productService.selectAllProduct(currPage, pageSize);
    }

    /**
     * 按类别分页查找商品
     * @param currPage
     * @param pageSize
     * @param type
     * @return
     */
    @PostMapping(value = "/product/type")
    @ResponseBody
    public Object selectDigitalProduct(@RequestParam("currPage") Integer currPage,
                                       @RequestParam("pageSize") Integer pageSize,
                                       @RequestParam("type") String type) {
        return productService.selectProductByType(currPage, pageSize, type);
    }

    /**
     * 按照id查询商品
     * @param id
     * @return
     */
    @PostMapping(value = "/product/id")
    @ResponseBody
    public Object selectProductInfoByProductId(@RequestParam("id") Integer id){
        return productService.selectById(id);
    }

    /**
     * 按照商品名查询商品,支持模糊查询
     * @param name
     * @return
     */
    @PostMapping(value = "/product/name")
    @ResponseBody
    public Object selectProductInfoByProductName(@RequestParam("name") String name){
        return productService.selectByName(name);
    }

    /**
     * 按商品id查询销售记录
     * @param id
     * @return
     */
    @PostMapping(value = "/salerecord/product")
    @ResponseBody
    public Object selectSaleRecordByProductId(@RequestParam("id") Integer id){
        return saleRecordService.selectSaleRecordByProductId(id);
    }

    /**
     * 按商家账号查询销售记录
     * @param merchantAccount
     * @return
     */
    @PostMapping(value = "/salerecord/merchant")
    @ResponseBody
    public Object selectSaleRecordByMerchantAccount(@RequestParam("merchantAccount") String merchantAccount){
        return saleRecordService.selectSaleRecordByMerchantAccount(merchantAccount);
    }

    /**
     * 根据商品id查看历史评论
     * @param currPage
     * @param pageSize
     * @param productId
     * @return
     */
    @PostMapping(value = "/product/comment")
    @ResponseBody
    public Object selectCommentByProductId(@RequestParam("currPage") int currPage,
                                           @RequestParam("pageSize") int pageSize,
                                           @RequestParam("productId") int productId){
        return productService.selectComment(currPage, pageSize, productId);
    }



}
