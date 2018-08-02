/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.account.messaging.event;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

public class UserDto {
    private String ssn;
    private String firstname;
    private String secondname;
    private Date dob;
    private AddressDto address;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UserDto userDto = (UserDto) o;

        return new EqualsBuilder()
            .append(ssn, userDto.ssn)
            .append(firstname, userDto.firstname)
            .append(secondname, userDto.secondname)
            .append(dob, userDto.dob)
            .append(address, userDto.address)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(ssn)
            .append(firstname)
            .append(secondname)
            .append(dob)
            .append(address)
            .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("ssn", ssn)
            .append("firstname", firstname)
            .append("secondname", secondname)
            .append("dob", dob)
            .append("address", address)
            .toString();
    }
}
