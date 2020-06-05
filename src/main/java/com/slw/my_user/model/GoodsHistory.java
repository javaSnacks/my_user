package com.slw.my_user.model;

public class GoodsHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.goods_id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.name
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.price
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.description
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.create_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.expire_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Long expireTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.delete_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Long deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.valid
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.operator
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.t_goods_history.operator_history
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    private Integer operatorHistory;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user.t_goods_history
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public GoodsHistory(Integer id, Integer goodsId, String name, Integer price, String description, Long createTime, Long expireTime, Long deleteTime, Integer valid, Integer operator, Integer operatorHistory) {
        this.id = id;
        this.goodsId = goodsId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.deleteTime = deleteTime;
        this.valid = valid;
        this.operator = operator;
        this.operatorHistory = operatorHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user.t_goods_history
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public GoodsHistory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.id
     *
     * @return the value of s_user.t_goods_history.id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.id
     *
     * @param id the value for s_user.t_goods_history.id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.goods_id
     *
     * @return the value of s_user.t_goods_history.goods_id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.goods_id
     *
     * @param goodsId the value for s_user.t_goods_history.goods_id
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.name
     *
     * @return the value of s_user.t_goods_history.name
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.name
     *
     * @param name the value for s_user.t_goods_history.name
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.price
     *
     * @return the value of s_user.t_goods_history.price
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.price
     *
     * @param price the value for s_user.t_goods_history.price
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.description
     *
     * @return the value of s_user.t_goods_history.description
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.description
     *
     * @param description the value for s_user.t_goods_history.description
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.create_time
     *
     * @return the value of s_user.t_goods_history.create_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.create_time
     *
     * @param createTime the value for s_user.t_goods_history.create_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.expire_time
     *
     * @return the value of s_user.t_goods_history.expire_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Long getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.expire_time
     *
     * @param expireTime the value for s_user.t_goods_history.expire_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.delete_time
     *
     * @return the value of s_user.t_goods_history.delete_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.delete_time
     *
     * @param deleteTime the value for s_user.t_goods_history.delete_time
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.valid
     *
     * @return the value of s_user.t_goods_history.valid
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.valid
     *
     * @param valid the value for s_user.t_goods_history.valid
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.operator
     *
     * @return the value of s_user.t_goods_history.operator
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.operator
     *
     * @param operator the value for s_user.t_goods_history.operator
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.t_goods_history.operator_history
     *
     * @return the value of s_user.t_goods_history.operator_history
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public Integer getOperatorHistory() {
        return operatorHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.t_goods_history.operator_history
     *
     * @param operatorHistory the value for s_user.t_goods_history.operator_history
     *
     * @mbg.generated Wed Jun 03 16:42:51 CST 2020
     */
    public void setOperatorHistory(Integer operatorHistory) {
        this.operatorHistory = operatorHistory;
    }
}