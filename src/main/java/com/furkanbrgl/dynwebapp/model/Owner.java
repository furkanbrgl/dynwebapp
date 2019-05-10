package com.furkanbrgl.dynwebapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;

@Entity
@Table(name = "t_owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "machineClinicSeqGen")
    @SequenceGenerator(name = "machineClinicSeqGen", sequenceName = "machineclinic_sequence")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(mappedBy = "owner")
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
