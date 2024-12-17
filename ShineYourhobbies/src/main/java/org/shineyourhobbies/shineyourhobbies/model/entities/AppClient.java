package org.shineyourhobbies.shineyourhobbies.model.entities;

import org.shineyourhobbies.shineyourhobbies.model.entities.enums.GenderEnum;

import java.util.List;
import java.util.Set;

public class AppClient {

    private String fullName;
    private GenderEnum gender;
    private Test testResults;
    private Set<Hobby> hobby_matches;
    private List<Hobby> saved_hobbies;

}
