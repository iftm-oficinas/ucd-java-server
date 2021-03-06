package domain.controllers;

import domain.entities.User;
import domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankingController {

    private UserService userService;

    @Autowired
    public RankingController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/ranking")
    public Iterable<User> index() {
        return userService.ranking();
    }
}
