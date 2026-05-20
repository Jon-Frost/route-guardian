package com.routegreenlight.route_guardian.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "WayPoints")

public class RouteWayPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //L uses null over 0's

    @Column(nullable = false)
    private String locationName;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(nullable = false)
    private Integer sequenceOrder; // Knowing the order of each way point is used for route direction

    @ManyToOne
    @JoinColumn(name = "rider_id", nullable = false)
    private Rider rider;

    public RouteWayPoint() {

    }

    public RouteWayPoint(Long id, String locationName, Double latitude, Double longitude, Integer sequenceOrder) {

        this.id = id;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.sequenceOrder = sequenceOrder;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getlocationName() {
        return locationName;
    }
    public void setlocationName(String locationName) {
        this.locationName = locationName;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setlongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getSequenceOrder() {
        return sequenceOrder;
    }
    public void setSequenceOrder(Integer sequenceOrder) {
        this.sequenceOrder = sequenceOrder;
    }

    public Rider getRider() {
        return rider;
    }
    public void setRider(Rider rider) {
        this.rider = rider;
    }







}

