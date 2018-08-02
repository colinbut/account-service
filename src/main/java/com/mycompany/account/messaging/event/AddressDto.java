/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.messaging.event;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class AddressDto {
    private String firstlineAddress;
    private String secondlineAddress;
    private String postcode;
    private String city;
    private String country;

    public String getFirstlineAddress() {
        return firstlineAddress;
    }

    public void setFirstlineAddress(String firstlineAddress) {
        this.firstlineAddress = firstlineAddress;
    }

    public String getSecondlineAddress() {
        return secondlineAddress;
    }

    public void setSecondlineAddress(String secondlineAddress) {
        this.secondlineAddress = secondlineAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AddressDto that = (AddressDto) o;

        return new EqualsBuilder()
            .append(firstlineAddress, that.firstlineAddress)
            .append(secondlineAddress, that.secondlineAddress)
            .append(postcode, that.postcode)
            .append(city, that.city)
            .append(country, that.country)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(firstlineAddress)
            .append(secondlineAddress)
            .append(postcode)
            .append(city)
            .append(country)
            .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("firstlineAddress", firstlineAddress)
            .append("secondlineAddress", secondlineAddress)
            .append("postcode", postcode)
            .append("city", city)
            .append("country", country)
            .toString();
    }
}
