package org.shineyourhobbies.shineyourhobbies.service.Impl;


import org.shineyourhobbies.shineyourhobbies.Exceptions.NotFoundException;
import org.shineyourhobbies.shineyourhobbies.model.entities.AppClient;
import org.shineyourhobbies.shineyourhobbies.model.entities.Hobby;
import org.shineyourhobbies.shineyourhobbies.repository.HobbyRepository;
import org.shineyourhobbies.shineyourhobbies.service.HobbyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class HobbyServicesImpl implements HobbyServices {

    @Autowired
    private HobbyRepository hobbyRepository;

    @Override
    public Hobby findHobbieById(Long id) {
        Optional<Hobby> hobby = this.hobbyRepository.findById(id);
        if(hobby.isPresent()) {
            return hobby.get();
        } else {
            throw new NotFoundException("This hobby does not exist");
        }
    }

    @Override
    public void saveUpdateHobby(Hobby hobby) throws Exception {
            Optional<Hobby> byId = this.hobbyRepository.findById(hobby.getId());
            if(byId.isEmpty()) {
                hobbyRepository.save(hobby);
            } else {
                hobby.setId(byId.get().getId());
                hobbyRepository.save(hobby);
            }
    }

    @Override
    public boolean deleteHobby(long id) {
        hobbyRepository.deleteById(id);
        return true;
    }

    @Override
    public Set<Hobby> findHobbyMatches(String username) {
        return null;
    }

    @Override
    public boolean saveHobbyForClient(Hobby hobby, String username) {
        return false;
    }

    @Override
    public boolean removeHobbyForClient(Hobby hobby, String username) {
        return false;
    }

    @Override
    public List<Hobby> findSaveHobbies(AppClient appClient) {
        return null;
    }

    @Override
    public Set<Hobby> getAllHobbiesForBusiness(String username) {
        return Set.of();
    }

    @Override
    public Set<Hobby> getAllHobbieMatchesForClient(String username) {
        return Set.of();
    }


    @Override
    public void createHobby(Hobby offer) {

    }
}
