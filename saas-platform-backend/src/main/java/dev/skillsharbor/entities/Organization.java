package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "organization")

public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int orgId;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "plan_type")
    private String planType;

    @Column(name = "org_created_date")
    private long orgCreatedDate;

    @Column(name = "org_updated_date")
    private long orgUpdatedDate;

    public Organization() {
    }

    public Organization(int orgId, String orgName, String planType, long orgCreatedDate, long orgUpdatedDate) {
        this.orgId = orgId,
        this.orgName = orgName;
        this.planType = planType;
        this.orgCreatedDate = orgCreatedDate;
        this.orgUpdatedDate = orgUpdatedDate;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public long getOrgCreatedDate() {
        return orgCreatedDate;
    }
    
    public void setOrgCreatedDate(long orgCreatedDate) {
        this.orgCreatedDate = orgCreatedDate;
    }

    public long getOrgUpdatedDate() {
        return orgUpdatedDate;
    }
            
    public void setOrgUpdatedDate(long orgUpdatedDate) {
        this.orgUpdatedDate = orgUpdatedDate;            
    }

    @Override
    public String toString() {
        return "Organization{" +
                "orgId=" + orgId +
                ", orgName=" + orgName +
                ", planType=" + planType +
                ", orgCreatedDate=" + orgCreatedDate +
                ", orgUpdatedDate=" + orgUpdatedDate +
                '}';
    }
}
