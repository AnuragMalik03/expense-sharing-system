package com.scaler.splitwise.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "GROUP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Group extends Auditable{
    private String name;
    private String description;

    @ManyToMany
    private Set<User> members = new HashSet<>();

    @OneToMany(mappedBy = "group")
    private Set<Expense> expenses = new HashSet<>();
}
