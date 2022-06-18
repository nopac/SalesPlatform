package com.example.springboot.service;

public interface ManageService {
    Object queryPutawayList(int currPage, int pageSize);
    Object checkPutawayList(int putawayListId);
    Object denyPutawayList(int putawayListId, String reason);
    Object queryCustomerRegister(int currPage, int pageSize);
    Object checkCustomerRegister(int registerId);
    Object denyCustomerRegister(int registerId, String reason);
    Object queryMerchantRegister(int currPage, int pageSize);
    Object checkMerchantRegister(int registerId);
    Object queryUncheckList(int currPage, int pageSize);
    Object queryCustomer(int currPage, int pageSize);
    Object queryMerchant(int currPage, int pageSize);
    Object updateUserInfo();
    Object disableCustomer(String customerAccount, int days);
    Object disableMerchant(String merchantAccount, int days);
    Object updateMerchantLevel(String merchantAccount, int priceRate);
    Object queryCustomerBlackList(int currPage, int pageSize);
    Object queryMerchantBlackList(int currPage, int pageSize);
    Object removeCustomerFromBlackList(int blackListId);
    Object removeMerchantFromBlackList(int blackListId);
    Object queryTotalAmount();
    Object queryTotalServiceCharge();
}
