package com.example.demo.entity;

import java.io.Serializable;

/**
 * echart阅读活动满意度
 * @TableName echart_reading_activity_satisfaction
 */
public class EchartReadingActivitySatisfaction implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 满意度类型
     */
    private String satisfactionStyle;

    /**
     * 用阅读活动的满意率
     */
    private Double rate;

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    public Integer getId() {
        return id;
    }

    /**
     * 唯一标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 满意度类型
     */
    public String getSatisfactionStyle() {
        return satisfactionStyle;
    }

    /**
     * 满意度类型
     */
    public void setSatisfactionStyle(String satisfactionStyle) {
        this.satisfactionStyle = satisfactionStyle;
    }

    /**
     * 用阅读活动的满意率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 用阅读活动的满意率
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EchartReadingActivitySatisfaction other = (EchartReadingActivitySatisfaction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSatisfactionStyle() == null ? other.getSatisfactionStyle() == null : this.getSatisfactionStyle().equals(other.getSatisfactionStyle()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSatisfactionStyle() == null) ? 0 : getSatisfactionStyle().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", satisfactionStyle=").append(satisfactionStyle);
        sb.append(", rate=").append(rate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}