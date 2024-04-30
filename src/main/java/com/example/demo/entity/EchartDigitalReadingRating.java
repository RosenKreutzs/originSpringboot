package com.example.demo.entity;

import java.io.Serializable;

/**
 * echarts的数字方式阅读率(2020-2021年)
 * @TableName echart_digital_reading_rating
 */
public class EchartDigitalReadingRating implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 用该阅读方式的人的阅读率
     */
    private Double rate;

    /**
     * 数字阅读方式的类型
     */
    private String digitalReadStyle;

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
     * 年份
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 年份
     */
    public void setYear(Integer year) {
        this.year = year;
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
     * 数字阅读方式的类型
     */
    public String getDigitalReadStyle() {
        return digitalReadStyle;
    }

    /**
     * 数字阅读方式的类型
     */
    public void setDigitalReadStyle(String digitalReadStyle) {
        this.digitalReadStyle = digitalReadStyle;
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
        EchartDigitalReadingRating other = (EchartDigitalReadingRating) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getDigitalReadStyle() == null ? other.getDigitalReadStyle() == null : this.getDigitalReadStyle().equals(other.getDigitalReadStyle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getDigitalReadStyle() == null) ? 0 : getDigitalReadStyle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", year=").append(year);
        sb.append(", rate=").append(rate);
        sb.append(", digitalReadStyle=").append(digitalReadStyle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}