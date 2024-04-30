package com.example.demo.entity;

import java.io.Serializable;

/**
 * echarts的综合阅读率(2020-2021年)
 * @TableName echart_comprehensivr_reading_rating
 */
public class EchartComprehensivrReadingRating implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 阅读方式
     */
    private String readStyle;

    /**
     * 用该阅读方式的人的阅读率
     */
    private Double rate;

    /**
     * 年份
     */
    private Integer year;

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
     * 阅读方式
     */
    public String getReadStyle() {
        return readStyle;
    }

    /**
     * 阅读方式
     */
    public void setReadStyle(String readStyle) {
        this.readStyle = readStyle;
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
        EchartComprehensivrReadingRating other = (EchartComprehensivrReadingRating) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReadStyle() == null ? other.getReadStyle() == null : this.getReadStyle().equals(other.getReadStyle()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReadStyle() == null) ? 0 : getReadStyle().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", readStyle=").append(readStyle);
        sb.append(", rate=").append(rate);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}