package com.scaler.splitwise.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Auditable implements Serializable{
    @Id
    @SequenceGenerator(name = "splitwiseSequence")
    @GeneratedValue(generator = "splitwiseSequence",strategy = GenerationType.SEQUENCE)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdOn = new Date();
    
}
