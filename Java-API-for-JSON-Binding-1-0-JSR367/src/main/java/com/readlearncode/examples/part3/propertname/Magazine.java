package com.readlearncode.examples.part3.propertname;


import java.util.Objects;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Magazine {


    private String title;

    private Author authorName;

    private String internalAuditCode;

    private String alternativetitle;

    public Magazine() {
    }

    public Magazine(String title, Author authorName, String internalAuditCode, String alternativetitle) {
        this.title = title;
        this.authorName = authorName;
        this.internalAuditCode = internalAuditCode;
        this.alternativetitle = alternativetitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public void setInternalAuditCode(String internalAuditCode) {
        this.internalAuditCode = internalAuditCode;
    }


    public String getAlternativetitle() {
        return alternativetitle;
    }

    public void setAlternativetitle(String alternativetitle) {
        this.alternativetitle = alternativetitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return
                Objects.equals(title, magazine.title) &&
                        Objects.equals(authorName, magazine.authorName) &&
                        Objects.equals(internalAuditCode, magazine.internalAuditCode) &&
                        Objects.equals(alternativetitle, magazine.alternativetitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, internalAuditCode, alternativetitle);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", authorName=" + authorName +
                ", internalAuditCode='" + internalAuditCode + '\'' +
                ", alternativetitle='" + alternativetitle + '\'' +
                '}';
    }
}