package com.ispcustomerportal.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * The Invoice entity represents an invoice record in the system.
 * It contains details about the billing, including the customer and subscription related to the invoice.
 */
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for the invoice

    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber; // The unique number assigned to the invoice

    @Column(name = "billing_period_start", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date billingPeriodStart; // Start date of the billing period

    @Column(name = "billing_period_end", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date billingPeriodEnd; // End date of the billing period

    @Column(name = "amount", nullable = false)
    private double amount; // Amount to be billed

    @Column(name = "due_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dueDate; // Due date for the invoice payment

    @Column(name = "paid_date")
    @Temporal(TemporalType.DATE)
    private Date paidDate; // The date when the invoice was paid, if applicable

    @Column(name = "status", nullable = false)
    private String status; // Current status of the invoice (e.g., PENDING, PAID)

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt; // Timestamp when the invoice was created

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer; // The customer associated with this invoice

    @ManyToOne
    @JoinColumn(name = "subscription_id", nullable = false)
    private Subscription subscription; // The subscription associated with this invoice

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getBillingPeriodStart() {
        return billingPeriodStart;
    }

    public void setBillingPeriodStart(Date billingPeriodStart) {
        this.billingPeriodStart = billingPeriodStart;
    }

    public Date getBillingPeriodEnd() {
        return billingPeriodEnd;
    }

    public void setBillingPeriodEnd(Date billingPeriodEnd) {
        this.billingPeriodEnd = billingPeriodEnd;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}