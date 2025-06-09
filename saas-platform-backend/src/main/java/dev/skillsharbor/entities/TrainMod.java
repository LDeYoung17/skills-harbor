package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "user_progress")

public class TrainMod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int modId;

    @Column(name = "mod_title")
    private String modTitle;

    @Column(name = "description")
    private String description;

    @Column(name = "org_id")
    private int orgId;

    @Column(name = "created_by_id")
    private int createdById;

    @Column(name = "mod_created_date")
    private long modCreatedDate;

    @Column(name = "mod_updated_da")
    private long modUpdatedDate;

    public TrainMod() {
    }

    public TrainMod(int modId, String modTitle, String description, int orgId, int createdById, long modCreatedDate, long modUpdatedDate) {
        this.modId = modId,
        this.modTitle = modTitle;
        this.description = description;
        this.orgId = orgId;
        this.createdById = createdById;
        this.modCreatedDate = modCreatedDate;
        this.modUpdatedDate = modUpdatedDate;
    }

    public int getModId() {
        return modId;
    }

    public void setModId(int modId) {
        this.modId = modId;
    }

    public String getModTitle() {
        return modTitle;
    }

    public void setModTitle(String modTitle) {
        this.modTitle = modTitle;
    }

    public String getDescription) {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public long getModCreatedDate() {
        return modCreatedDate;
    }
    
    public void setModCreatedDate(long modCreatedDate) {
        this.modCreatedDate = modCreatedDate;
    }

    public long getModUpdatedDate() {
        return modUpdatedDate;
    }
            
    public void setModUpdatedDate(long modUpdatedDate) {
        this.modUpdatedDate = modUpdatedDate;            
    }

    @Override
    public String toString() {
        return "TrainMod{" +
                "modId=" + modId +
                ", modTitle=" + modTitle +
                ", description=" + description +
                ", orgId=" + orgId +
                ", createdById=" + createdById +
                ", modUpdatedDate=" + modUpdatedDate +
                ", modUpdatedDate=" + modUpdatedDate +
                '}';
    }
}
