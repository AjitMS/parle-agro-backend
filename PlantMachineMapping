package com.parleagro.backend.entity;

import javax.persistence.*;

@Table(name = "plant_machine_mapping")
@Entity
public class PlantMachineMapping {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "plant_id")
    @OneToOne
    private Plant plant;

    @JoinColumn(name = "machine_id")
    @OneToOne
    private Machine machine;


    @Override
    public String toString() {
        return "PlantMachineMapping{" +
                "id=" + id +
                ", plant=" + plant +
                ", machine=" + machine +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
}
