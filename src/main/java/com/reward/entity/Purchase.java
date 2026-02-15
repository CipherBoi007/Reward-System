package com.reward.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchases")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Purchase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;
    
    @Column(nullable = false)
    private Long customerId;
    
    @Column(nullable = false)
    private Double billAmount;
    
    @Column(nullable = false)
    private Integer earnedPoints;
    
    @Column(nullable = false)
    private LocalDateTime purchaseDate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId", insertable = false, updatable = false)
    private Customer customer;
}