package com.example.demo.entity;

import java.io.Serializable;

/**
 * 
 * @TableName books_year_rating
 */
public class BooksYearRating implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Double bookRatingYear;

    /**
     * 
     */
    private Integer originalPublicationYear;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public Double getBookRatingYear() {
        return bookRatingYear;
    }

    /**
     * 
     */
    public void setBookRatingYear(Double bookRatingYear) {
        this.bookRatingYear = bookRatingYear;
    }

    /**
     * 
     */
    public Integer getOriginalPublicationYear() {
        return originalPublicationYear;
    }

    /**
     * 
     */
    public void setOriginalPublicationYear(Integer originalPublicationYear) {
        this.originalPublicationYear = originalPublicationYear;
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
        BooksYearRating other = (BooksYearRating) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookRatingYear() == null ? other.getBookRatingYear() == null : this.getBookRatingYear().equals(other.getBookRatingYear()))
            && (this.getOriginalPublicationYear() == null ? other.getOriginalPublicationYear() == null : this.getOriginalPublicationYear().equals(other.getOriginalPublicationYear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookRatingYear() == null) ? 0 : getBookRatingYear().hashCode());
        result = prime * result + ((getOriginalPublicationYear() == null) ? 0 : getOriginalPublicationYear().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookRatingYear=").append(bookRatingYear);
        sb.append(", originalPublicationYear=").append(originalPublicationYear);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}