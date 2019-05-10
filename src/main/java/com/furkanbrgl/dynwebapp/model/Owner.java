package com.furkanbrgl.dynwebapp.model;

import java.util.HashSet;
import java.util.Set;

public class Owner {
    private Long id;
    private String firstName;
    private String lastName;

    private Set<Machine> machineSet = new HashSet<>();

    public Set<Machine> getMachineSet() {
        return machineSet;
    }

    public void setMachineSet(Set<Machine> machineSet) {
        this.machineSet = machineSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", machineSet=" + machineSet +
                '}';
    }
}
