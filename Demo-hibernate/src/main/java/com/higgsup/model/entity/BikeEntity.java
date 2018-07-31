package com.higgsup.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class BikeEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(nullable = false)
    private String bikeId;

    @Column(nullable = false,unique = true)
    private String bikeName;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brandEntity;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private BikeTypeEntity bikeTypeEntity;

    @Column(nullable = false)
    private Float bikeCC;

    @Column(columnDefinition = "TEXT")
    private String bikeDescription;

    @Column(nullable = false)
    private Float bikePrice;
}
