package cn.douzy.remainder.entity;

import java.io.Serializable;
import java.util.Date;

public class ConType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_type.id
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_type.name
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_type.desc
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_type.is_top
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Byte isTop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_type.order
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Integer order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_type.create_time
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table con_type
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_type.id
     *
     * @return the value of con_type.id
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_type.id
     *
     * @param id the value for con_type.id
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_type.name
     *
     * @return the value of con_type.name
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_type.name
     *
     * @param name the value for con_type.name
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_type.desc
     *
     * @return the value of con_type.desc
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_type.desc
     *
     * @param desc the value for con_type.desc
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_type.is_top
     *
     * @return the value of con_type.is_top
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Byte getIsTop() {
        return isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_type.is_top
     *
     * @param isTop the value for con_type.is_top
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_type.order
     *
     * @return the value of con_type.order
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_type.order
     *
     * @param order the value for con_type.order
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_type.create_time
     *
     * @return the value of con_type.create_time
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_type.create_time
     *
     * @param createTime the value for con_type.create_time
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}