package com.slw.my_user.model;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.name
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.price
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.description
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.create_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.expire_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Long expireTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.delete_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Long deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.valid
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods.operator
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer operator;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user.t_goods
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Goods(Integer id, String name, Integer price, String description, Long createTime, Long expireTime, Long deleteTime, Integer valid, Integer operator) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.deleteTime = deleteTime;
        this.valid = valid;
        this.operator = operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user.t_goods
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Goods() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.id
     *
     * @return the value of s_user.t_goods.id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.id
     *
     * @param id the value for s_user.t_goods.id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.name
     *
     * @return the value of s_user.t_goods.name
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.name
     *
     * @param name the value for s_user.t_goods.name
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.price
     *
     * @return the value of s_user.t_goods.price
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.price
     *
     * @param price the value for s_user.t_goods.price
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.description
     *
     * @return the value of s_user.t_goods.description
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.description
     *
     * @param description the value for s_user.t_goods.description
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.create_time
     *
     * @return the value of s_user.t_goods.create_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.create_time
     *
     * @param createTime the value for s_user.t_goods.create_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.expire_time
     *
     * @return the value of s_user.t_goods.expire_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Long getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.expire_time
     *
     * @param expireTime the value for s_user.t_goods.expire_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.delete_time
     *
     * @return the value of s_user.t_goods.delete_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.delete_time
     *
     * @param deleteTime the value for s_user.t_goods.delete_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.valid
     *
     * @return the value of s_user.t_goods.valid
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.valid
     *
     * @param valid the value for s_user.t_goods.valid
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods.operator
     *
     * @return the value of s_user.t_goods.operator
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods.operator
     *
     * @param operator the value for s_user.t_goods.operator
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setOperator(Integer operator) {
        this.operator = operator;
    }
}