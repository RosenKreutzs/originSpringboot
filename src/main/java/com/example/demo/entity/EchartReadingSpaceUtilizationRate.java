package com.example.demo.entity;

import java.io.Serializable;

/**
 * echart阅读场所使用率
 * @TableName echart_reading_space_utilization_rate
 */
public class EchartReadingSpaceUtilizationRate implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 阅读场所
     */
    private String readingPlace;

    /**
     * 用该阅读场所的人的使用率
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
     * 阅读场所
     */
    public String getReadingPlace() {
        return readingPlace;
    }

    /**
     * 阅读场所
     */
    public void setReadingPlace(String readingPlace) {
        this.readingPlace = readingPlace;
    }

    /**
     * 用该阅读场所的人的使用率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 用该阅读场所的人的使用率
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
        EchartReadingSpaceUtilizationRate other = (EchartReadingSpaceUtilizationRate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReadingPlace() == null ? other.getReadingPlace() == null : this.getReadingPlace().equals(other.getReadingPlace()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReadingPlace() == null) ? 0 : getReadingPlace().hashCode());
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
        sb.append(", readingPlace=").append(readingPlace);
        sb.append(", rate=").append(rate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}