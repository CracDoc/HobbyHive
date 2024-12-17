package org.shineyourhobbies.shineyourhobbies.model.entities;

import org.shineyourhobbies.shineyourhobbies.model.entities.enums.LocationEnum;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    private LocationEnum name ;

    public Location(LocationEnum name) {
        this.name = name;
    }

    public Location() {}

    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    public LocationEnum getName() {
        return name;
    }

    public void setName(LocationEnum name){
        this.name = name;
    }

}
