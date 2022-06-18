package com.example.springboot.service.impl;

import com.example.springboot.mapper.*;
import com.example.springboot.model.*;
import com.example.springboot.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements ManageService {
    @Autowired
    Putaway_Apply_ListMapper putaway_apply_listMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    StoreMapper storeMapper;

    @Autowired
    Register_Apply_ListMapper register_apply_listMapper;

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    MerchantMapper merchantMapper;

    @Autowired
    Customer_BlackListMapper blackListMapper;

    @Autowired
    Merchant_LimitListMapper merchant_limitListMapper;

    @Autowired
    Sales_RecordMapper sales_recordMapper;

    @Override
    public Object queryPutawayList(int currPage, int pageSize) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", putaway_apply_listMapper.selectAll(map));
        Long recordsCount = putaway_apply_listMapper.countByExample(new Putaway_Apply_ListExample());
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", currPage);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object checkPutawayList(int putawayListId) {
        Map<Object, Object> resultMap = new HashMap<>();

        Putaway_Apply_List putaway_apply_list = putaway_apply_listMapper.selectByPrimaryKey(putawayListId);
        if(!putaway_apply_list.getPutawayStatment().equals("待审核")) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该订单已审核");
            return resultMap;
        }
        putaway_apply_list.setPutawayStatment("审核通过");
        putaway_apply_list.setPutawayFinishDate(new Date(System.currentTimeMillis()));

        //添加商品
        Product product = new Product();
        product.setProductOnSale("yes");
        product.setProductName(putaway_apply_list.getPutawayName());
        product.setProductCount(putaway_apply_list.getPutawayCount());
        product.setProductCategory(putaway_apply_list.getPutawayCatagory());
        product.setProductAddDate(new Date(System.currentTimeMillis()));
        product.setProductConditionDegree(putaway_apply_list.getPutawayConditionDegree());
        product.setProductDescription(putaway_apply_list.getPutawayDescription());
        product.setProductNegotiable(putaway_apply_list.getPutawayNegotiable());
        product.setProductDiscountPrice(putaway_apply_list.getPutawayDiscountPrice());
        product.setProductPictureDir(putaway_apply_list.getPutawayPictureDir());
        product.setProductSize(putaway_apply_list.getPutawaySize());
        product.setProductPrice(putaway_apply_list.getPutawayPrice());

        productMapper.insert(product);
        putaway_apply_listMapper.updateByPrimaryKey(putaway_apply_list);

        //添加商品归属
        Store store = new Store();
        store.setStoreMerchant(putaway_apply_list.getPutawayMerchant());
        store.setStoreProduct(productMapper.selectLastByPrimaryKey().getProductId());
        storeMapper.insert(store);

        resultMap.put("state", "Success");
        resultMap.put("info", "审核成功");
        return resultMap;
    }

    @Override
    public Object denyPutawayList(int putawayListId, String reason) {
        Map<Object, Object> resultMap = new HashMap<>();
        Putaway_Apply_List putaway_apply_list = putaway_apply_listMapper.selectByPrimaryKey(putawayListId);
        if(!putaway_apply_list.getPutawayStatment().equals("待审核")) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该订单已审核");
            return resultMap;
        }
        putaway_apply_list.setPutawayStatment(reason);
        putaway_apply_list.setPutawayFinishDate(new Date(System.currentTimeMillis()));
        putaway_apply_listMapper.updateByPrimaryKey(putaway_apply_list);
        resultMap.put("state", "Success");
        resultMap.put("info", "打回成功");
        return resultMap;
    }

    @Override
    public Object queryCustomerRegister(int currPage, int pageSize) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", register_apply_listMapper.selectAll(map));
        Long recordsCount = register_apply_listMapper.countByExample(new Register_Apply_ListExample());
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", currPage);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object checkCustomerRegister(int registerId) {
        Map<Object, Object> resultMap = new HashMap<>();

        Register_Apply_List register_apply_list = register_apply_listMapper.selectByPrimaryKey(registerId);
        if(!register_apply_list.getRegisterStatment().equals("待审核")) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该申请已审核");
            return resultMap;
        }

        if(register_apply_list.getRegisterType().equals("普通用户")) {
            Customer customer = new Customer();
            customer.setCustomerName(register_apply_list.getRegisterName());
            customer.setCustomerAccount(register_apply_list.getRegisterAccount());
            customer.setCustomerPassword(register_apply_list.getRegisterPassword());
            customer.setCustomerPhone(register_apply_list.getRegisterPhone());
            customer.setCustomerMail(register_apply_list.getRegisterMail());
            customer.setCustomerCity(register_apply_list.getRegisterMail());
            customer.setCustomerSex(register_apply_list.getRegisterSex());
            customer.setCustomerBankAccount(register_apply_list.getRegisterBankAccount());
            customer.setCustomerDegree(4.0);
            customer.setCustomerWalletIntegral(0);
            customer.setCustomerWalletIntegral(0);
            customer.setCustomerRegisterDate(new Date(System.currentTimeMillis()));
            customerMapper.insert(customer);
        } else {
            Merchant merchant = new Merchant();
            merchant.setMerchantName(register_apply_list.getRegisterName());
            merchant.setMerchantAccount(register_apply_list.getRegisterAccount());
            merchant.setMerchantPassword(register_apply_list.getRegisterPassword());
            merchant.setMerchantPhone(register_apply_list.getRegisterPhone());
            merchant.setMerchantIdcard(register_apply_list.getRegisterIdCard());
            merchant.setMerchantIdcardDir(register_apply_list.getRegisterIdCardDir());
            merchant.setMerchantSex(register_apply_list.getRegisterSex());
            merchant.setMerchantLicense(register_apply_list.getRegisterLicense());
            merchant.setMerchantLicenseDir(register_apply_list.getRegisterLicenseDir());
            merchant.setMerchantServicePriceRate(0.01);
            merchant.setMerchantSatisfactionDegree(4.0);
            merchant.setMerchantTotalSaleAmount(0.0);
            merchant.setMerchantRegisterDate(new Date(System.currentTimeMillis()));
            merchantMapper.insert(merchant);
        }

        register_apply_list.setRegisterStatment("通过审核");
        register_apply_list.setRegisterFinishDate(new Date(System.currentTimeMillis()));
        register_apply_listMapper.updateByPrimaryKey(register_apply_list);

        resultMap.put("state", "Success");
        resultMap.put("info", "审核通过!");

        return resultMap;
    }

    @Override
    public Object denyCustomerRegister(int registerId, String reason) {
        Map<Object, Object> resultMap = new HashMap<>();

        Register_Apply_List register_apply_list = register_apply_listMapper.selectByPrimaryKey(registerId);
        if(!register_apply_list.getRegisterStatment().equals("待审核")) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该申请已审核");
            return resultMap;
        }

        register_apply_list.setRegisterStatment(reason);
        register_apply_list.setRegisterFinishDate(new Date(System.currentTimeMillis()));
        register_apply_listMapper.updateByPrimaryKey(register_apply_list);

        resultMap.put("state", "Success");
        resultMap.put("info", "打回成功");
        return resultMap;
    }

    @Override
    public Object queryMerchantRegister(int currPage, int pageSize) {
        return null;
    }

    @Override
    public Object checkMerchantRegister(int registerId) {
        return null;
    }

    @Override
    public Object queryUncheckList(int currPage, int pageSize) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", register_apply_listMapper.selectUnchecked(map));
        Long recordsCount = register_apply_listMapper.countByUnchecked();
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object queryCustomer(int currPage, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", customerMapper.selectAll(map));
        Long recordsCount = customerMapper.countByExample(new CustomerExample());
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object queryMerchant(int currPage, int pageSize) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", merchantMapper.selectAll(map));
        Long recordsCount = merchantMapper.countByExample(new MerchantExample());
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object updateUserInfo() {
        return null;
    }

    @Override
    public Object disableCustomer(String customerAccount, int days) {
        Map<Object, Object> resultMap = new HashMap<>();
        Customer customer = customerMapper.selectByAccount(customerAccount);
        if(customer == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该用户不存在!");
            return resultMap;
        }
        Customer_BlackList customer_blackList = new Customer_BlackList();
        customer_blackList.setBlacklistFrom("merchant");
        customer_blackList.setBlacklistTo(customerAccount);
        customer_blackList.setBlacklistType("platform");
        java.sql.Date currDate = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date endDate = new java.sql.Date(currDate.getTime() + (1000 * 3600 * 24)*days);
        customer_blackList.setBlacklistStartDate(currDate);
        customer_blackList.setBlacklistEndDate(endDate);
        blackListMapper.insert(customer_blackList);
        resultMap.put("state", "Success");
        resultMap.put("info", "封禁成功!");
        return resultMap;
    }

    @Override
    public Object disableMerchant(String merchantAccount, int days) {
        Map<Object, Object> resultMap = new HashMap<>();
        Merchant_LimitList merchant_limitList = new Merchant_LimitList();
        Merchant merchant = merchantMapper.selectByAccount(merchantAccount);
        if(merchant == null) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "该商家不存在!");
            return resultMap;
        }
        merchant_limitList.setLimitMerchant(merchantAccount);
        merchant_limitList.setLimitType("platform");
        java.sql.Date currDate = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date endDate = new java.sql.Date(currDate.getTime() + (1000 * 3600 * 24)*days);
        merchant_limitList.setLimitStartDate(currDate);
        merchant_limitList.setLimitEndDate(endDate);
        merchant_limitListMapper.insert(merchant_limitList);
        resultMap.put("state", "Success");
        resultMap.put("info", "封禁成功!");
        return resultMap;
    }

    @Override
    public Object updateMerchantLevel(String merchantAccount, int level) {
        Map<Object, Object> resultMap = new HashMap<>();
        Merchant merchant = merchantMapper.selectByAccount(merchantAccount);
        if(level > 5 || level < 1) {
            resultMap.put("state", "Failed");
            resultMap.put("info", "等级应在1~5");
            return resultMap;
        }

        double rate;
        switch (level) {
            case 1: rate = 0.0100;break;
            case 2: rate = 0.0075;break;
            case 3: rate = 0.0050;break;
            case 4: rate = 0.0025;break;
            case 5: rate = 0.0;break;
            default: rate = -1;
        }

        merchant.setMerchantServicePriceRate(rate);
        merchantMapper.updateByPrimaryKey(merchant);
        resultMap.put("state", "Success");
        resultMap.put("info", "更新费率成功!");
        return resultMap;
    }

    @Override
    public Object queryCustomerBlackList(int currPage, int pageSize) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", blackListMapper.selectAll(map));
        Long recordsCount = blackListMapper.countByExample(new Customer_BlackListExample());
        Long pageCount = recordsCount / pageSize;;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object queryMerchantBlackList(int currPage, int pageSize) {
        Map<Object, Object> map = new HashMap<>();
        map.put("currPage", (currPage-1)*pageSize);
        map.put("pageSize", pageSize);
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("data", merchant_limitListMapper.selectAll(map));
        Long recordsCount = merchant_limitListMapper.countByExample(new Merchant_LimitListExample());
        Long pageCount = recordsCount / pageSize;
        if(recordsCount % pageSize != 0) {
            pageCount += 1;
        }
        resultMap.put("currPage", pageCount);
        resultMap.put("pageCount", pageCount);
        return resultMap;
    }

    @Override
    public Object removeCustomerFromBlackList(int blackListId) {
        Map<Object, Object> resultMap = new HashMap<>();
        blackListMapper.deleteByPrimaryKey(blackListId);
        resultMap.put("state", "Success");
        resultMap.put("info", "取消封禁成功!");
        return resultMap;
    }

    @Override
    public Object removeMerchantFromBlackList(int blackListId) {
        Map<Object, Object> resultMap = new HashMap<>();
        merchant_limitListMapper.deleteByPrimaryKey(blackListId);
        resultMap.put("state", "Success");
        resultMap.put("info", "取消封禁成功!");
        return resultMap;
    }

    @Override
    public Object queryTotalAmount() {
        List<Merchant> merchantList = merchantMapper.selectAllMerchant();
        double totalSaleAmount = 0;
        for(Merchant merchant : merchantList) {
            totalSaleAmount += merchant.getMerchantTotalSaleAmount();
        }
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("state", "Success");
        resultMap.put("info", totalSaleAmount);
        return resultMap;
    }

    @Override
    public Object queryTotalServiceCharge() {
        List<Sales_Record> sales_records = sales_recordMapper.selectAll();
        double totalServiceCharge = 0;
        for(Sales_Record record : sales_records) {
            totalServiceCharge += record.getSalesRecordServiceCharge();
        }
        Map<Object, Object> resultMap = new HashMap<>();
        resultMap.put("state", "Success");
        resultMap.put("info", totalServiceCharge);
        return resultMap;
    }
}
