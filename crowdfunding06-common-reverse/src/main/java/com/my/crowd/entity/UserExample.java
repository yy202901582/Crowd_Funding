package com.my.crowd.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateIsNull() {
            addCriterion("encryption_state is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateIsNotNull() {
            addCriterion("encryption_state is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateEqualTo(String value) {
            addCriterion("encryption_state =", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateNotEqualTo(String value) {
            addCriterion("encryption_state <>", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateGreaterThan(String value) {
            addCriterion("encryption_state >", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateGreaterThanOrEqualTo(String value) {
            addCriterion("encryption_state >=", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateLessThan(String value) {
            addCriterion("encryption_state <", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateLessThanOrEqualTo(String value) {
            addCriterion("encryption_state <=", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateLike(String value) {
            addCriterion("encryption_state like", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateNotLike(String value) {
            addCriterion("encryption_state not like", value, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateIn(List<String> values) {
            addCriterion("encryption_state in", values, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateNotIn(List<String> values) {
            addCriterion("encryption_state not in", values, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateBetween(String value1, String value2) {
            addCriterion("encryption_state between", value1, value2, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andEncryptionStateNotBetween(String value1, String value2) {
            addCriterion("encryption_state not between", value1, value2, "encryptionState");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitIsNull() {
            addCriterion("head_portrait is null");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitIsNotNull() {
            addCriterion("head_portrait is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitEqualTo(String value) {
            addCriterion("head_portrait =", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitNotEqualTo(String value) {
            addCriterion("head_portrait <>", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitGreaterThan(String value) {
            addCriterion("head_portrait >", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("head_portrait >=", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitLessThan(String value) {
            addCriterion("head_portrait <", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitLessThanOrEqualTo(String value) {
            addCriterion("head_portrait <=", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitLike(String value) {
            addCriterion("head_portrait like", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitNotLike(String value) {
            addCriterion("head_portrait not like", value, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitIn(List<String> values) {
            addCriterion("head_portrait in", values, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitNotIn(List<String> values) {
            addCriterion("head_portrait not in", values, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitBetween(String value1, String value2) {
            addCriterion("head_portrait between", value1, value2, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitNotBetween(String value1, String value2) {
            addCriterion("head_portrait not between", value1, value2, "headPortrait");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIsNull() {
            addCriterion("second_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIsNotNull() {
            addCriterion("second_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneEqualTo(String value) {
            addCriterion("second_phone =", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotEqualTo(String value) {
            addCriterion("second_phone <>", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneGreaterThan(String value) {
            addCriterion("second_phone >", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("second_phone >=", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLessThan(String value) {
            addCriterion("second_phone <", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLessThanOrEqualTo(String value) {
            addCriterion("second_phone <=", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLike(String value) {
            addCriterion("second_phone like", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotLike(String value) {
            addCriterion("second_phone not like", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIn(List<String> values) {
            addCriterion("second_phone in", values, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotIn(List<String> values) {
            addCriterion("second_phone not in", values, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneBetween(String value1, String value2) {
            addCriterion("second_phone between", value1, value2, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotBetween(String value1, String value2) {
            addCriterion("second_phone not between", value1, value2, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("channel_type is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("channel_type is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(Integer value) {
            addCriterion("channel_type =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(Integer value) {
            addCriterion("channel_type <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(Integer value) {
            addCriterion("channel_type >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_type >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(Integer value) {
            addCriterion("channel_type <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("channel_type <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<Integer> values) {
            addCriterion("channel_type in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<Integer> values) {
            addCriterion("channel_type not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(Integer value1, Integer value2) {
            addCriterion("channel_type between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_type not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberIsNull() {
            addCriterion("merchant_number is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberIsNotNull() {
            addCriterion("merchant_number is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberEqualTo(String value) {
            addCriterion("merchant_number =", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberNotEqualTo(String value) {
            addCriterion("merchant_number <>", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberGreaterThan(String value) {
            addCriterion("merchant_number >", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_number >=", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberLessThan(String value) {
            addCriterion("merchant_number <", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberLessThanOrEqualTo(String value) {
            addCriterion("merchant_number <=", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberLike(String value) {
            addCriterion("merchant_number like", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberNotLike(String value) {
            addCriterion("merchant_number not like", value, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberIn(List<String> values) {
            addCriterion("merchant_number in", values, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberNotIn(List<String> values) {
            addCriterion("merchant_number not in", values, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberBetween(String value1, String value2) {
            addCriterion("merchant_number between", value1, value2, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andMerchantNumberNotBetween(String value1, String value2) {
            addCriterion("merchant_number not between", value1, value2, "merchantNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNull() {
            addCriterion("supplier_number is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNotNull() {
            addCriterion("supplier_number is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberEqualTo(String value) {
            addCriterion("supplier_number =", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotEqualTo(String value) {
            addCriterion("supplier_number <>", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThan(String value) {
            addCriterion("supplier_number >", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_number >=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThan(String value) {
            addCriterion("supplier_number <", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThanOrEqualTo(String value) {
            addCriterion("supplier_number <=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLike(String value) {
            addCriterion("supplier_number like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotLike(String value) {
            addCriterion("supplier_number not like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIn(List<String> values) {
            addCriterion("supplier_number in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotIn(List<String> values) {
            addCriterion("supplier_number not in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberBetween(String value1, String value2) {
            addCriterion("supplier_number between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotBetween(String value1, String value2) {
            addCriterion("supplier_number not between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andData1IsNull() {
            addCriterion("data1 is null");
            return (Criteria) this;
        }

        public Criteria andData1IsNotNull() {
            addCriterion("data1 is not null");
            return (Criteria) this;
        }

        public Criteria andData1EqualTo(String value) {
            addCriterion("data1 =", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotEqualTo(String value) {
            addCriterion("data1 <>", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1GreaterThan(String value) {
            addCriterion("data1 >", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1GreaterThanOrEqualTo(String value) {
            addCriterion("data1 >=", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1LessThan(String value) {
            addCriterion("data1 <", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1LessThanOrEqualTo(String value) {
            addCriterion("data1 <=", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1Like(String value) {
            addCriterion("data1 like", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotLike(String value) {
            addCriterion("data1 not like", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1In(List<String> values) {
            addCriterion("data1 in", values, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotIn(List<String> values) {
            addCriterion("data1 not in", values, "data1");
            return (Criteria) this;
        }

        public Criteria andData1Between(String value1, String value2) {
            addCriterion("data1 between", value1, value2, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotBetween(String value1, String value2) {
            addCriterion("data1 not between", value1, value2, "data1");
            return (Criteria) this;
        }

        public Criteria andData2IsNull() {
            addCriterion("data2 is null");
            return (Criteria) this;
        }

        public Criteria andData2IsNotNull() {
            addCriterion("data2 is not null");
            return (Criteria) this;
        }

        public Criteria andData2EqualTo(String value) {
            addCriterion("data2 =", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotEqualTo(String value) {
            addCriterion("data2 <>", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2GreaterThan(String value) {
            addCriterion("data2 >", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2GreaterThanOrEqualTo(String value) {
            addCriterion("data2 >=", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2LessThan(String value) {
            addCriterion("data2 <", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2LessThanOrEqualTo(String value) {
            addCriterion("data2 <=", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2Like(String value) {
            addCriterion("data2 like", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotLike(String value) {
            addCriterion("data2 not like", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2In(List<String> values) {
            addCriterion("data2 in", values, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotIn(List<String> values) {
            addCriterion("data2 not in", values, "data2");
            return (Criteria) this;
        }

        public Criteria andData2Between(String value1, String value2) {
            addCriterion("data2 between", value1, value2, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotBetween(String value1, String value2) {
            addCriterion("data2 not between", value1, value2, "data2");
            return (Criteria) this;
        }

        public Criteria andData3IsNull() {
            addCriterion("data3 is null");
            return (Criteria) this;
        }

        public Criteria andData3IsNotNull() {
            addCriterion("data3 is not null");
            return (Criteria) this;
        }

        public Criteria andData3EqualTo(String value) {
            addCriterion("data3 =", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotEqualTo(String value) {
            addCriterion("data3 <>", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3GreaterThan(String value) {
            addCriterion("data3 >", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3GreaterThanOrEqualTo(String value) {
            addCriterion("data3 >=", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3LessThan(String value) {
            addCriterion("data3 <", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3LessThanOrEqualTo(String value) {
            addCriterion("data3 <=", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3Like(String value) {
            addCriterion("data3 like", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotLike(String value) {
            addCriterion("data3 not like", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3In(List<String> values) {
            addCriterion("data3 in", values, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotIn(List<String> values) {
            addCriterion("data3 not in", values, "data3");
            return (Criteria) this;
        }

        public Criteria andData3Between(String value1, String value2) {
            addCriterion("data3 between", value1, value2, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotBetween(String value1, String value2) {
            addCriterion("data3 not between", value1, value2, "data3");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdIsNull() {
            addCriterion("second_department_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdIsNotNull() {
            addCriterion("second_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdEqualTo(String value) {
            addCriterion("second_department_id =", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdNotEqualTo(String value) {
            addCriterion("second_department_id <>", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdGreaterThan(String value) {
            addCriterion("second_department_id >", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_department_id >=", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdLessThan(String value) {
            addCriterion("second_department_id <", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("second_department_id <=", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdLike(String value) {
            addCriterion("second_department_id like", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdNotLike(String value) {
            addCriterion("second_department_id not like", value, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdIn(List<String> values) {
            addCriterion("second_department_id in", values, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdNotIn(List<String> values) {
            addCriterion("second_department_id not in", values, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdBetween(String value1, String value2) {
            addCriterion("second_department_id between", value1, value2, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andSecondDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("second_department_id not between", value1, value2, "secondDepartmentId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdIsNull() {
            addCriterion("first_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdIsNotNull() {
            addCriterion("first_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdEqualTo(Integer value) {
            addCriterion("first_area_id =", value, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdNotEqualTo(Integer value) {
            addCriterion("first_area_id <>", value, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdGreaterThan(Integer value) {
            addCriterion("first_area_id >", value, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_area_id >=", value, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdLessThan(Integer value) {
            addCriterion("first_area_id <", value, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_area_id <=", value, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdIn(List<Integer> values) {
            addCriterion("first_area_id in", values, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdNotIn(List<Integer> values) {
            addCriterion("first_area_id not in", values, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("first_area_id between", value1, value2, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andFirstAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_area_id not between", value1, value2, "firstAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdIsNull() {
            addCriterion("second_area_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdIsNotNull() {
            addCriterion("second_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdEqualTo(Integer value) {
            addCriterion("second_area_id =", value, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdNotEqualTo(Integer value) {
            addCriterion("second_area_id <>", value, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdGreaterThan(Integer value) {
            addCriterion("second_area_id >", value, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_area_id >=", value, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdLessThan(Integer value) {
            addCriterion("second_area_id <", value, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("second_area_id <=", value, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdIn(List<Integer> values) {
            addCriterion("second_area_id in", values, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdNotIn(List<Integer> values) {
            addCriterion("second_area_id not in", values, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("second_area_id between", value1, value2, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andSecondAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("second_area_id not between", value1, value2, "secondAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdIsNull() {
            addCriterion("third_area_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdIsNotNull() {
            addCriterion("third_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdEqualTo(Integer value) {
            addCriterion("third_area_id =", value, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdNotEqualTo(Integer value) {
            addCriterion("third_area_id <>", value, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdGreaterThan(Integer value) {
            addCriterion("third_area_id >", value, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_area_id >=", value, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdLessThan(Integer value) {
            addCriterion("third_area_id <", value, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_area_id <=", value, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdIn(List<Integer> values) {
            addCriterion("third_area_id in", values, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdNotIn(List<Integer> values) {
            addCriterion("third_area_id not in", values, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("third_area_id between", value1, value2, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andThirdAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_area_id not between", value1, value2, "thirdAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdIsNull() {
            addCriterion("fourth_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdIsNotNull() {
            addCriterion("fourth_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdEqualTo(Integer value) {
            addCriterion("fourth_area_id =", value, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdNotEqualTo(Integer value) {
            addCriterion("fourth_area_id <>", value, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdGreaterThan(Integer value) {
            addCriterion("fourth_area_id >", value, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourth_area_id >=", value, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdLessThan(Integer value) {
            addCriterion("fourth_area_id <", value, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("fourth_area_id <=", value, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdIn(List<Integer> values) {
            addCriterion("fourth_area_id in", values, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdNotIn(List<Integer> values) {
            addCriterion("fourth_area_id not in", values, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("fourth_area_id between", value1, value2, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andFourthAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fourth_area_id not between", value1, value2, "fourthAreaId");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagIsNull() {
            addCriterion("authorize_flag is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagIsNotNull() {
            addCriterion("authorize_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagEqualTo(String value) {
            addCriterion("authorize_flag =", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagNotEqualTo(String value) {
            addCriterion("authorize_flag <>", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagGreaterThan(String value) {
            addCriterion("authorize_flag >", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("authorize_flag >=", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagLessThan(String value) {
            addCriterion("authorize_flag <", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagLessThanOrEqualTo(String value) {
            addCriterion("authorize_flag <=", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagLike(String value) {
            addCriterion("authorize_flag like", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagNotLike(String value) {
            addCriterion("authorize_flag not like", value, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagIn(List<String> values) {
            addCriterion("authorize_flag in", values, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagNotIn(List<String> values) {
            addCriterion("authorize_flag not in", values, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagBetween(String value1, String value2) {
            addCriterion("authorize_flag between", value1, value2, "authorizeFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFlagNotBetween(String value1, String value2) {
            addCriterion("authorize_flag not between", value1, value2, "authorizeFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}