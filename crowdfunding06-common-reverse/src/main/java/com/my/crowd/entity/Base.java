package com.my.crowd.entity;

import java.util.Date;

public class Base {
    private Integer id;

    private String title;

    private String subTitle;

    private String code;

    private String typeName;

    private String typeCode;

    private String keyWords;

    private String context;

    private String state;

    private Integer sort;

    private Integer channelType;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String data1;

    private String data2;

    private String data3;

    private String delFlag;

    public Base() {
    }

    public Base(Integer id, String title, String subTitle, String code, String typeName, String typeCode, String keyWords, String context, String state, Integer sort, Integer channelType, String createBy, Date createTime, String updateBy, Date updateTime, String data1, String data2, String data3, String delFlag) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.code = code;
        this.typeName = typeName;
        this.typeCode = typeCode;
        this.keyWords = keyWords;
        this.context = context;
        this.state = state;
        this.sort = sort;
        this.channelType = channelType;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", code='" + code + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typeCode='" + typeCode + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", context='" + context + '\'' +
                ", state='" + state + '\'' +
                ", sort=" + sort +
                ", channelType=" + channelType +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                ", data1='" + data1 + '\'' +
                ", data2='" + data2 + '\'' +
                ", data3='" + data3 + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}