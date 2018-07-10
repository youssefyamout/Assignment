package Controller;

import Service.UserService;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Collection;

@RestController
@RequestMapping("/")
public class UserController {

    private final
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/demo/{firstName}", produces = "application/json")
    public Greetings getUser(@PathVariable String firstName) {
        return new Greetings("Hello " + userService.getUser(firstName).getFirstName());
    }

    @PostMapping("/demo/user")
    public HttpStatus register(User user) {

        Instant instant = Instant.now();
        Long timeStamp = instant.getEpochSecond();
        user = new User("Adam", "Ghani", timeStamp);
        if (user.getFirstName().isEmpty() || user.getLastName().isEmpty())
            return HttpStatus.FORBIDDEN;
        else
            userService.saveUser(user);
        return HttpStatus.ACCEPTED;
    }

    @GetMapping("/demo/user")
    public Collection<User> getAllUsers() {
        return userService.getAllUsers();
    }

    static class Greetings {

        private String greetings;

        Greetings(String firstName) {
            this.greetings = firstName;
        }
    }

}
