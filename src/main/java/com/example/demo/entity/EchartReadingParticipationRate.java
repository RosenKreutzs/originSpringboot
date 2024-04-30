package com.example.demo.entity;

import java.io.Serializable;

/**
 * echarts的阅读活动参与率
 * @TableName echart_reading_participation_rate
 */
public class EchartReadingParticipationRate implements Serializable {
    /**
     * 唯一标识
     */
    private Integer id;

    /**
     * 活动名
     */
    private String moveName;

    /**
     * 用阅读活动的参与率
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
     * 活动名
     */
    public String getMoveName() {
        return moveName;
    }

    /**
     * 活动名
     */
    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    /**
     * 用阅读活动的参与率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 用阅读活动的参与率
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
        EchartReadingParticipationRate other = (EchartReadingParticipationRate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMoveName() == null ? other.getMoveName() == null : this.getMoveName().equals(other.getMoveName()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMoveName() == null) ? 0 : getMoveName().hashCode());
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
        sb.append(", moveName=").append(moveName);
        sb.append(", rate=").append(rate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}