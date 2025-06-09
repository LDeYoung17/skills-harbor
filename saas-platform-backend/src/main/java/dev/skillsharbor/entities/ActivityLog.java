package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "activity_log")

public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int activityLogId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "metadata")
    private JSON metadata;

    @Column(name = "activity_created_date")
    private long activityCreatedDate;

    @Column(name = "activity_updated_date")
    private long activityUpdatedDate;

    public ActivityLog() {
    }

    public ActivityLog(int activityLogId, int userId, String eventType, JSON metadata, long activityCreatedDate, long activityUpdatedDate) {
        this.activityLogId = activityLogId,
        this.userId = userId;
        this.eventType = eventType;
        this.metadata = metadata;
        this.activityCreatedDate = activityCreatedDate;
        this.activityUpdatedDate = activityUpdatedDate;
    }

    public int getActivityLogId() {
        return activityLogId;
    }

    public void setActivityLogId(int activityLogId) {
        this.activityLogId = activityLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public JSON getMetadata{} {
        return metadata;
    }

    public void setMetadata(JSON metadata) {
        this.metadata = metadata;
    }

    public long getActivityCreatedDate() {
        return activityCreatedDate;
    }
    
    public void setActivityCreatedDate(long activityCreatedDate) {
        this.activityCreatedDate = activityCreatedDate;
    }

    public long getActivityUpdatedDate() {
        return activityUpdatedDate;
    }
            
    public void setActivityUpdatedDate(long activityUpdatedDate) {
        this.activityUpdatedDate = activityUpdatedDate;            
    }

    @Override
    public String toString() {
        return "ActivityLog{" +
                "activityLogId=" + activityLogId +
                ", userId=" + userId +
                ", eventType=" + eventType +
                ", metadata=" + metadata +
                ", activityCreatedDate=" + activityCreatedDate +
                ", activityUpdatedDate=" + activityUpdatedDate +
                '}';
    }
}
