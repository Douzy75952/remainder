package cn.douzy.remainder.entity;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.id
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.title
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.desc
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.create_time
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.is_top
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Boolean isTop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.order
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Integer order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.type
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.id
     *
     * @return the value of record.id
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.id
     *
     * @param id the value for record.id
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.title
     *
     * @return the value of record.title
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.title
     *
     * @param title the value for record.title
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.desc
     *
     * @return the value of record.desc
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.desc
     *
     * @param desc the value for record.desc
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.create_time
     *
     * @return the value of record.create_time
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.create_time
     *
     * @param createTime the value for record.create_time
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.is_top
     *
     * @return the value of record.is_top
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.is_top
     *
     * @param isTop the value for record.is_top
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.order
     *
     * @return the value of record.order
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.order
     *
     * @param order the value for record.order
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.type
     *
     * @return the value of record.type
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.type
     *
     * @param type the value for record.type
     *
     * @mbggenerated Wed Jul 12 14:40:34 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }
}