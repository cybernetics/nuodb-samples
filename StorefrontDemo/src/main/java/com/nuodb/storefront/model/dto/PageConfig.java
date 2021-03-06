/* Copyright (c) 2013 NuoDB, Inc. */

package com.nuodb.storefront.model.dto;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.nuodb.storefront.StorefrontApp;
import com.nuodb.storefront.model.entity.AppInstance;
import com.nuodb.storefront.model.entity.Customer;
import com.nuodb.storefront.model.type.Currency;

public class PageConfig {
    private String pageTitle;
    private String pageName;
    private Object pageData;
    private Customer customer;
    private List<Message> messages;
    private List<AppInstance> appInstances;

    public PageConfig() {
    }

    public PageConfig(String pageTitle, String pageName, Object pageData, Customer customer, List<Message> messages, List<AppInstance> appInstances) {
        this.pageTitle = pageTitle;
        this.pageName = pageName;
        this.pageData = pageData;
        this.customer = customer;
        this.messages = messages;
        this.appInstances = appInstances;
    }

    public String getAppInstanceUuid() {
        return StorefrontApp.APP_INSTANCE.getUuid();
    }

    public Currency getCurrency() {
        return StorefrontApp.APP_INSTANCE.getCurrency();
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public Object getPageData() {
        return pageData;
    }

    public void setPageData(Object pageData) {
        this.pageData = pageData;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<AppInstance> getAppInstances() {
        return appInstances;
    }

    public void setAppInstances(List<AppInstance> appInstances) {
        this.appInstances = appInstances;
    }

    public String toJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
