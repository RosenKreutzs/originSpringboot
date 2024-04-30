package com.example.demo.entity;

import java.io.Serializable;

/**
 * echarts的数字方式阅读不同年龄段的比率
 * @TableName echart_digital_reading_age_rating
 */
public class EchartDigitalReadingAgeRating implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 用该阅读方式的人的阅读率
     */
    private Double rate;

    /**
     * 读者年龄段
     */
    private String ageRange;

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
     * 用该阅读方式的人的阅读率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 用该阅读方式的人的阅读率
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * 读者年龄段
     */
    public String getAgeRange() {
        return ageRange;
    }

    /**
     * 读者年龄段
     */
    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
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
        EchartDigitalReadingAgeRating other = (EchartDigitalReadingAgeRating) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getAgeRange() == null ? other.getAgeRange() == null : this.getAgeRange().equals(other.getAgeRange()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getAgeRange() == null) ? 0 : getAgeRange().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rate=").append(rate);
        sb.append(", ageRange=").append(ageRange);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}