/*
 * This file is generated by jOOQ.
 */
package com.fbecloud.provider.db.identity.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -1726363992;

    private String  id;
    private String  email;
    private String  emailConstraint;
    private Boolean emailVerified;
    private Boolean enabled;
    private String  federationLink;
    private String  firstName;
    private String  lastName;
    private String  realmId;
    private String  username;
    private Long    createdTimestamp;
    private String  serviceAccountClientLink;
    private Integer notBefore;

    public UserEntity() {}

    public UserEntity(UserEntity value) {
        this.id = value.id;
        this.email = value.email;
        this.emailConstraint = value.emailConstraint;
        this.emailVerified = value.emailVerified;
        this.enabled = value.enabled;
        this.federationLink = value.federationLink;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.realmId = value.realmId;
        this.username = value.username;
        this.createdTimestamp = value.createdTimestamp;
        this.serviceAccountClientLink = value.serviceAccountClientLink;
        this.notBefore = value.notBefore;
    }

    public UserEntity(
        String  id,
        String  email,
        String  emailConstraint,
        Boolean emailVerified,
        Boolean enabled,
        String  federationLink,
        String  firstName,
        String  lastName,
        String  realmId,
        String  username,
        Long    createdTimestamp,
        String  serviceAccountClientLink,
        Integer notBefore
    ) {
        this.id = id;
        this.email = email;
        this.emailConstraint = emailConstraint;
        this.emailVerified = emailVerified;
        this.enabled = enabled;
        this.federationLink = federationLink;
        this.firstName = firstName;
        this.lastName = lastName;
        this.realmId = realmId;
        this.username = username;
        this.createdTimestamp = createdTimestamp;
        this.serviceAccountClientLink = serviceAccountClientLink;
        this.notBefore = notBefore;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailConstraint() {
        return this.emailConstraint;
    }

    public void setEmailConstraint(String emailConstraint) {
        this.emailConstraint = emailConstraint;
    }

    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFederationLink() {
        return this.federationLink;
    }

    public void setFederationLink(String federationLink) {
        this.federationLink = federationLink;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRealmId() {
        return this.realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public void setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getServiceAccountClientLink() {
        return this.serviceAccountClientLink;
    }

    public void setServiceAccountClientLink(String serviceAccountClientLink) {
        this.serviceAccountClientLink = serviceAccountClientLink;
    }

    public Integer getNotBefore() {
        return this.notBefore;
    }

    public void setNotBefore(Integer notBefore) {
        this.notBefore = notBefore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserEntity (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(emailConstraint);
        sb.append(", ").append(emailVerified);
        sb.append(", ").append(enabled);
        sb.append(", ").append(federationLink);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(realmId);
        sb.append(", ").append(username);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(serviceAccountClientLink);
        sb.append(", ").append(notBefore);

        sb.append(")");
        return sb.toString();
    }
}
