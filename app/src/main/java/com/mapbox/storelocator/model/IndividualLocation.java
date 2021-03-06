package com.mapbox.storelocator.model;

import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * POJO class for an individual location
 */
public class IndividualLocation {

  private String name;
  private String address;
  private String hours;
  private String description;
  private String distance;
  private LatLng location;

  public IndividualLocation(String name, String description, String hours, String address, LatLng location) {
    this.name = name;
    this.description = description;
    this.hours = hours;
    this.address = address;
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public String getHours() {
    return hours;
  }

  public String getDescription() {
    return description;
  }

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public LatLng getLocation() {
    return location;
  }
}
