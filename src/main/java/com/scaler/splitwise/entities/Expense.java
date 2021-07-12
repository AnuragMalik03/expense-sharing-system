package com.scaler.splitwise.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "EXPENSE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Expense extends Auditable{
    private String name;
    private String description;
    private Double totalAmount;

    @ManyToOne
    private Group group;

    @ManyToMany
    private Set<User> participants = new HashSet<>();

    @ElementCollection
    private Map<User, Double> amountPaid = new HashMap<>();

    @ElementCollection
    private Map<User, Double> amountOwed = new HashMap<>();



}
