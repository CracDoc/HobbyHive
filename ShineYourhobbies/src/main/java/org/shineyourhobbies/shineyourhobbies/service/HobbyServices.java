package org.shineyourhobbies.shineyourhobbies.service;

import org.shineyourhobbies.shineyourhobbies.model.entities.AppClient;
import org.shineyourhobbies.shineyourhobbies.model.entities.Hobby;

import java.util.List;
import java.util.Set;

public interface HobbyServices {

    Hobby findHobbieById(Long id);

    void saveUpdateHobby(Hobby hobby) throws Exception;

    boolean deleteHobby(long id) throws Exception;

    Set<Hobby> findHobbyMatches(String username);

    boolean saveHobbyForClient(Hobby hobby, String username);

    boolean removeHobbyForClient(Hobby hobby, String username);

    List<Hobby> findSaveHobbies(AppClient appClient);

    Set<Hobby> getAllHobbiesForBusiness(String username);

    Set<Hobby> getAllHobbieMatchesForClient(String username);

    void createHobby (Hobby offer);
}
