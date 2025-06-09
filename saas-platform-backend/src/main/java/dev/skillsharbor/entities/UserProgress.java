package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "user_progress")

public class UserProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "mod_id")
    private int modId;

    @Column(name = "lesson_id")
    private int lessonId;

    @Column(name = "progress_status")
    private String progressStatus;

    @Column(name = "status_created_date")
    private long statusCreatedDate;

    @Column(name = "status_updated_da")
    private long statusUpdatedDate;

    public UserProgress() {
    }

    public UserProgress(int id, int userId, int modId, int lessonId, String progressStatus, long statusCreatedDate, long statusUpdatedDate) {
        this.id = id,
        this.userId = userId;
        this.modId = modId;
        this.lessonId = lessonId;
        this.progressStatus = progressStatus;
        this.statusCreatedDate = statusCreatedDate;
        this.userLoginTimestamp = statusUpdatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getModId() {
        return modId;
    }

    public void setModIdl(int modId) {
        this.modId = modId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    public long getStatusCreatedDate() {
        return statusCreatedDate;
    }
    
    public void setStatusCreatedDate(long statusCreatedDate) {
        this.statusCreatedDate = statusCreatedDate;
    }

    public long getStatusUpdatedDate() {
        return statusUpdatedDate;
    }
            
    public void setStatusUpdatedDate(long statusUpdatedDate) {
        this.statusUpdatedDate = statusUpdatedDate;            
    }

    @Override
    public String toString() {
        return "UserProgress{" +
                "id=" + id +
                ", userId=" + userId +
                ", modId=" + modId +
                ", lessonId=" + lessonId +
                ", progressStatus=" + progressStatus +
                ", statusCreatedDate=" + statusCreatedDate +
                ", statusUpdatedDate=" + statusUpdatedDate +
                '}';
    }
}