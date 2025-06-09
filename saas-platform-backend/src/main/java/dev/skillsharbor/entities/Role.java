package dev.skillsharbor.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;

@SpringBootApplication
@Entity
@Table(name = "role")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "permissions")
    private JSON permissions;

    @Column(name = "role_created_date")
    private long roleCreatedDate;

    @Column(name = "role_updated_date")
    private long roleUpdatedDate;

    public Role() {
    }

    public Role(int roleId, String roleName, JSON permissions, long roleCreatedDate, long roleUpdatedDate) {
        this.roleId = roleId,
        this.roleName = roleName;
        this.permissions = permissions;
        this.roleCreatedDate = roleCreatedDate;
        this.roleUpdatedDate = roleUpdatedDate;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public JSON getPermissions) {
        return permissions;
    }

    public void setPermissions(JSON permissions) {
        this.permissions = permissions;
    }

    public long getRoleCreatedDate() {
        return roleCreatedDate;
    }
    
    public void setRoleCreatedDate(long roleCreatedDate) {
        this.roleCreatedDate = roleCreatedDate;
    }

    public long getRoleUpdatedDate() {
        return roleUpdatedDate;
    }
            
    public void setRoleUpdatedDate(long roleUpdatedDate) {
        this.roleUpdatedDate = roleUpdatedDate;            
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName=" + roleName +
                ", permissions=" + permissions +
                ", roleCreatedDate=" + roleCreatedDate +
                ", roleUpdatedDate=" + roleUpdatedDate +
                '}';
    }
}
