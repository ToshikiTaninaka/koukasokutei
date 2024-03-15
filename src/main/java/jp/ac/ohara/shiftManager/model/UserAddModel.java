package jp.ac.ohara.shiftManager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserAddModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long userId;

    @Column(length = 64, nullable = false, unique = true)
    private String username;

    @Column(length = 64, nullable = false)
    private String password;

    @Column(length = 32, nullable = false)
    private String name;
    
    @Column(length = 32, nullable = false)
    private String jobName;
    
    @Column(nullable = false, unique = true)
    private Integer age;

    @Column(length = 32, nullable = false, unique = true)
    private String telephoneNumber;

    @Column(length = 32, nullable = false, unique = true)
    private String mailAddress;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getJobName() {
    	return jobName;
    }
    
    public void setJobName(String jobName) {
    	this.jobName = jobName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
}
