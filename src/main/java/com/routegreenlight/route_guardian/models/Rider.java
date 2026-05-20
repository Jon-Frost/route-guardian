package com.routegreenlight.route_guardian.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "riders")

public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "rider", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RouteWayPoint> waypoints;

    //constructor
    public Rider() {
    }

    public Rider(Long id, String name, String email, List<RouteWayPoint> waypoints) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.waypoints = waypoints;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RouteWayPoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<RouteWayPoint> waypoints) {
        this.waypoints = waypoints;
    }


}
