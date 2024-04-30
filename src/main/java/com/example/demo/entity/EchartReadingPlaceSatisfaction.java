package com.example.demo.entity;

import java.io.Serializable;

/**
 * echart阅读场所满意度
 * @TableName echart_reading_place_satisfaction
 */
public class EchartReadingPlaceSatisfaction implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 阅读场所
     */
    private String readingPlace;

    /**
     * 用该阅读场所的人的满意率
     */
    private Double satisfactionRate;

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
     * 用该阅读场所的人的满意率
     */
    public Double getSatisfactionRate() {
        return satisfactionRate;
    }

    /**
     * 用该阅读场所的人的满意率
     */
    public void setSatisfactionRate(Double satisfactionRate) {
        this.satisfactionRate = satisfactionRate;
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
        EchartReadingPlaceSatisfaction other = (EchartReadingPlaceSatisfaction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReadingPlace() == null ? other.getReadingPlace() == null : this.getReadingPlace().equals(other.getReadingPlace()))
            && (this.getSatisfactionRate() == null ? other.getSatisfactionRate() == null : this.getSatisfactionRate().equals(other.getSatisfactionRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReadingPlace() == null) ? 0 : getReadingPlace().hashCode());
        result = prime * result + ((getSatisfactionRate() == null) ? 0 : getSatisfactionRate().hashCode());
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
        sb.append(", satisfactionRate=").append(satisfactionRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}