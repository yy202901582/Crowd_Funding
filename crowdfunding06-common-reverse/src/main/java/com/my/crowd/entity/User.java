package com.my.crowd.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String code;

    private String account;

    private String encryptionState;

    private String password;

    private String name;

    private String nickname;

    private String headPortrait;

    private String phone;

    private String secondPhone;

    private String email;

    private String state;

    private Integer channelType;

    private String merchantNumber;

    private String supplierNumber;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String data1;

    private String data2;

    private String data3;

    private String delFlag;

    private String sex;

    private String cardNumber;

    private String unit;

    private Integer unitId;

    private String post;

    private String department;

    private Integer departmentId;

    private String description;

    private Integer sort;

    private String secondDepartmentId;

    private Integer firstAreaId;

    private Integer secondAreaId;

    private Integer thirdAreaId;

    private Integer fourthAreaId;

    private String age;

    private String birthday;

    private String authorizeFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getEncryptionState() {
        return encryptionState;
    }

    public void setEncryptionState(String encryptionState) {
        this.encryptionState = encryptionState == null ? null : encryptionState.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone == null ? null : secondPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber == null ? null : merchantNumber.trim();
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber == null ? null : supplierNumber.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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
        this.updateBy = updateBy == null ? null : updateBy.trim();
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
        this.data1 = data1 == null ? null : data1.trim();
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2 == null ? null : data2.trim();
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3 == null ? null : data3.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSecondDepartmentId() {
        return secondDepartmentId;
    }

    public void setSecondDepartmentId(String secondDepartmentId) {
        this.secondDepartmentId = secondDepartmentId == null ? null : secondDepartmentId.trim();
    }

    public Integer getFirstAreaId() {
        return firstAreaId;
    }

    public void setFirstAreaId(Integer firstAreaId) {
        this.firstAreaId = firstAreaId;
    }

    public Integer getSecondAreaId() {
        return secondAreaId;
    }

    public void setSecondAreaId(Integer secondAreaId) {
        this.secondAreaId = secondAreaId;
    }

    public Integer getThirdAreaId() {
        return thirdAreaId;
    }

    public void setThirdAreaId(Integer thirdAreaId) {
        this.thirdAreaId = thirdAreaId;
    }

    public Integer getFourthAreaId() {
        return fourthAreaId;
    }

    public void setFourthAreaId(Integer fourthAreaId) {
        this.fourthAreaId = fourthAreaId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getAuthorizeFlag() {
        return authorizeFlag;
    }

    public void setAuthorizeFlag(String authorizeFlag) {
        this.authorizeFlag = authorizeFlag == null ? null : authorizeFlag.trim();
    }
}