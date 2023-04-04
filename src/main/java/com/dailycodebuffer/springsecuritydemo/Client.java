package com.dailycodebuffer.springsecuritydemo;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SpringSecurity")
public class Client {

    private Long id;
//    @SerializedName("name")
    private String username;
//    @SerializedName("pswd")
    private String password;
//    @SerializedName("designation")
    private String role;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
