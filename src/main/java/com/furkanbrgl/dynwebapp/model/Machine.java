package com.furkanbrgl.dynwebapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="t_machine")
public class Machine {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="machineClinicSeqGen")
    @SequenceGenerator(name="machineClinicSeqGen",sequenceName="machineclinic_sequence")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="generation_date")
    private Date generationDate;
    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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

    public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", generationDate=" + generationDate +
                ", owner=" + owner +
                '}';
    }
}
