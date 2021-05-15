package com.parleagro.backend.entity;

import javax.persistence.*;

@Table(name = "quality_transaction")
@Entity
public class QualityTransaction {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "plant_machine_mapping_id")
    @OneToOne
    private PlantMachineMapping plantMachineMapping;

    @JoinColumn(name = "time_id")
    @OneToOne
    private Time time;

    @JoinColumn(name = "quality_id")
    @OneToOne
    private Quality quality;

    @Column(name = "data")
    private String data;

    @Override
    public String toString() {
        return "QualityTransaction{" +
                "id=" + id +
                ", plantMachineMapping=" + plantMachineMapping +
                ", time=" + time +
                ", quality=" + quality +
                ", data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlantMachineMapping getPlantMachineMapping() {
        return plantMachineMapping;
    }

    public void setPlantMachineMapping(PlantMachineMapping plantMachineMapping) {
        this.plantMachineMapping = plantMachineMapping;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

}
