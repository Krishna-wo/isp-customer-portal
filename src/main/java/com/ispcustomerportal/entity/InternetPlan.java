package com.ispcustomerportal.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Entity class for Internet Plan.
 * This class represents the Internet Plan entity in the database.
 */
@Entity
@Table(name = "internet_plans")
public class InternetPlan {

    /**
     * Unique identifier for the Internet Plan.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the Internet Plan.
     */
    @Column(name = "plan_name", nullable = false)
    private String planName;

    /**
     * Speed of the Internet Plan in Mbps.
     */
    @Column(name = "speed", nullable = false)
    private int speed;

    /**
     * Price of the Internet Plan.
     */
    @Column(name = "price", nullable = false)
    private double price;

    /**
     * Duration of the Internet Plan in months.
     */
    @Column(name = "duration", nullable = false)
    private int duration;

    /**
     * Description of the Internet Plan.
     */
    @Column(name = "description")
    private String description;

    /**
     * Indicates whether the Internet Plan is active.
     */
    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    /**
     * Timestamp for when the Internet Plan was created.
     */
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    // Getters and Setters 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}