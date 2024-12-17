package org.shineyourhobbies.shineyourhobbies.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.shineyourhobbies.shineyourhobbies.model.entities.Hobby;
import org.shineyourhobbies.shineyourhobbies.service.HobbyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

    private final HobbyServices hobbyServices;

    @Autowired
    public HomeController(HobbyServices hobbyServices) {
        this.hobbyServices = hobbyServices;
    }

    @GetMapping("/home")
    @Operation(summary = "show homepage to client", security = @SecurityRequirement(name = "bearerAuth"))
    public Set<Hobby> hobbiesShow (@RequestParam String username, @RequestParam String role){
        if(role.equals("user")){
            return this.hobbyServices.getAllHobbieMatchesForClient(username);

        }
        return this.hobbyServices.getAllHobbiesForBusiness(username);
    }

}
