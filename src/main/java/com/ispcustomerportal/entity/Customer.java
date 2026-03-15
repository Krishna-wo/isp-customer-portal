package com.ispcustomerportal.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Customer entity class representing customers within the application.
 *
 * JPA annotations are used to define database table and column mappings.
 * Each instance of this class corresponds to a record in the "customers" table.
 */
@Entity
@Table(name = "customers")
public class Customer implements Serializable {

    /**
     * The unique identifier for each customer.
     * This field is the primary key of the table and is auto-generated.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    /**
     * The first name of the customer.
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * The last name of the customer.
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * The email address of the customer.
     * This field should be unique for each customer.
     */
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    /**
     * The phone number of the customer.
     */
    @Column(name = "phone")
    private String phone;

    /**
     * The address of the customer.
     */
    @Column(name = "address")
    private String address;

    /**
     * The city of the customer.
     */
    @Column(name = "city")
    private String city;

    /**
     * The state of the customer.
     */
    @Column(name = "state")
    private String state;

    /**
     * The pincode for the customer’s address.
     */
    @Column(name = "pincode")
    private String pincode;

    /**
     * The status of the customer (e.g., active, inactive).
     */
    @Column(name = "status")
    private String status;

    /**
     * The user relationship to associate the customer with a user in another entity.
     * Consider using a ManyToOne relationship if a user can have multiple customers.
     * Revealing this relationship requires defining the User entity class as well.
     */
    /* @ManyToOne
     * @JoinColumn(name = "user_id")
     * private User user;
     */

    // Getters and Setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    } */
}