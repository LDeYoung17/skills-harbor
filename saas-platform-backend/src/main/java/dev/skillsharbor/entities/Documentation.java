package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "documentation")

public class Documentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int docId;

    @Column(name = "doc_title")
    private String docTitle;

    @Column(name = "slug")
    private String slug;

    @Column(name = "body")
    private String body;

    @Column(name = "tags")
    private JSON tags;

    @Column(name = "org_id")
    private int orgId;

    @Column(name = "created_by_id")
    private int createdById;

    @Column(name = "doc_created_date")
    private long docCreatedDate;

    @Column(name = "doc_updated_date")
    private long docUpdatedDate;

    public Documentation() {
    }

    public Documentation(int docId, String docTitle, String slug, String body, JSON tags, int orgId, int createdById, long docCreatedDate, long docUpdatedDate) {
        this.docId = docId,
        this.docTitle = docTitle;
        this.slug = slug;
        this.body = body;
        this.tags = tags;
        this.orgId = orgId;
        this.createdById = createdById;
        this.docCreatedDate = docCreatedDate;
        this.docUpdatedDate = docUpdatedDate;
    }

    public int geDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    public String getSlug{} {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBody{} {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public JSON getTags{} {
        return tags;
    }

    public void setTags(JSON tags) {
        this.tags = tags;
    }

    public int getOrgId{} {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public int getCreatedById{} {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public long getDocCreatedDate() {
        return docCreatedDate;
    }
    
    public void setDocCreatedDate(long docCreatedDate) {
        this.docCreatedDate = docCreatedDate;
    }

    public long getOrgUpdatedDate() {
        return orgUpdatedDate;
    }
            
    public void setOrgUpdatedDate(long orgUpdatedDate) {
        this.orgUpdatedDate = orgUpdatedDate;            
    }

    @Override
    public String toString() {
        return "Documentation{" +
                "docId=" + docId +
                ", docTitle=" + docTitle +
                ", slug=" + slug +
                ", body=" + body +
                ", tags=" + tags +
                ", orgId=" + orgId +
                ", createdById=" + createdById +
                ", docCreatedDate=" + docCreatedDate +
                ", docUpdatedDate=" + docUpdatedDate +
                '}';
    }
}
