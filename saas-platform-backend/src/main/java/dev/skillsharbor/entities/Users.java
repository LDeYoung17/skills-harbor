package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "users")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "role_id")
    private int roleId;

    @Column(name = "team_id")
    private int teamId;

    @Column(name = "user_status")
    private long userStatus;

    @Column(name = "created_date")
    private long userCreatedDate;

    @Column(name = "login_timestamp")
    private long userLoginTimestamp;

    public Users() {
    }

    public Users(int userId, String firstName, String lastName, String email, int roleId, int teamId, long userStatus, long userCreatedDate, long userLoginTimestamp) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roleId = roleId;
        this.teamId = teamId;
        this.userStatus = userStatus;
        this.userCreatedDate = userCreatedDate;
        this.userLoginTimestamp = userLoginTimestamp;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(long userStatus) {
        this.userStatus = userStatus;

    public long getUserCreatedDate() {
        return userCreatedDate;
    }
    
    public void setUserCreatedDate(long userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }

    public long getUserLoginTimestamp() {
        return userLoginTimestamp;
    }
            
    public void setUserLoginTimestamp(long userLoginTimestamp) {
        this.userLoginTimestamp = userLoginTimestamp;            
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", teamId=" + teamId +
                ", userStatus=" + userStatus +
                ", userCreatedDate=" + userCreatedDate +
                ", userLoginTimestamp=" + userLoginTimestamp +
                '}';
    }
}