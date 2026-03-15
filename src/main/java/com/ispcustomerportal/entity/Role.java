package com.ispcustomerportal.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Role is an entity class that represents a user role in the system.
 * It is mapped to the database table 'roles'.
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    /**
     * Default constructor.
     */
    public Role() {
    }

    /**
     * Constructor with parameters.
     * @param name the name of the role
     */
    public Role(String name) {
        this.name = name;
    }

    /**
     * Gets the ID of the role.
     * @return the ID of the role
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the role.
     * @param id the ID of the role to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the role.
     * @return the name of the role
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the role.
     * @param name the name of the role to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the role.
     * @return string representation of the role
     */
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '" +
                '}';
    }
}