package com.alibaba.test.steed.model;

import java.util.Date;

public class Rule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.id
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.name
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.tags
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private String tags;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.category
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.level
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.enable
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private Byte enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.retry
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private Byte retry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.owner
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.modify
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private Date modify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.application
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private String application;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.debug
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    private Byte debug;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Rule(Integer id, String name, String tags, String category, Integer level, Byte enable, Byte retry, String owner, Date modify, String application, Byte debug) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.category = category;
        this.level = level;
        this.enable = enable;
        this.retry = retry;
        this.owner = owner;
        this.modify = modify;
        this.application = application;
        this.debug = debug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Rule() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.id
     *
     * @return the value of rule.id
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.id
     *
     * @param id the value for rule.id
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.name
     *
     * @return the value of rule.name
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.name
     *
     * @param name the value for rule.name
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.tags
     *
     * @return the value of rule.tags
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.tags
     *
     * @param tags the value for rule.tags
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.category
     *
     * @return the value of rule.category
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.category
     *
     * @param category the value for rule.category
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.level
     *
     * @return the value of rule.level
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.level
     *
     * @param level the value for rule.level
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.enable
     *
     * @return the value of rule.enable
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.enable
     *
     * @param enable the value for rule.enable
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.retry
     *
     * @return the value of rule.retry
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Byte getRetry() {
        return retry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.retry
     *
     * @param retry the value for rule.retry
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setRetry(Byte retry) {
        this.retry = retry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.owner
     *
     * @return the value of rule.owner
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.owner
     *
     * @param owner the value for rule.owner
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.modify
     *
     * @return the value of rule.modify
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Date getModify() {
        return modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.modify
     *
     * @param modify the value for rule.modify
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setModify(Date modify) {
        this.modify = modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.application
     *
     * @return the value of rule.application
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public String getApplication() {
        return application;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.application
     *
     * @param application the value for rule.application
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.debug
     *
     * @return the value of rule.debug
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public Byte getDebug() {
        return debug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.debug
     *
     * @param debug the value for rule.debug
     *
     * @mbggenerated Mon Sep 02 16:57:20 CST 2019
     */
    public void setDebug(Byte debug) {
        this.debug = debug;
    }
}