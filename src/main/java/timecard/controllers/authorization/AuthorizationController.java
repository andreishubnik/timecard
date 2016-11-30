package timecard.controllers.authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import timecard.entities.Employee;
import timecard.repositories.EmployeeRepository;

/**
 * Authorization controller
 *
 * Created by Shubnik on 28.11.2016.
 */

@RestController
public class AuthorizationController {

    @Autowired
    private final EmployeeRepository repository;

    public AuthorizationController(EmployeeRepository repository) {
        this.repository = repository;
    }

    /**
     * Login employee in system with login and password in web (no security)
     * @param login employee login
     * @param password employee password
     * @return employee information
     */
    @RequestMapping("/login")
    public Employee login(
            @RequestParam(value="login", required=true) String login,
            @RequestParam(value="password", required=true) String password
    ) {
        return repository.findEmployeeByLogin(login)
                .orElseThrow(() -> new RuntimeException("could not find the employee '" + login + "'"));
    }

    /**
     * Logout employee from system in web
     */
    @RequestMapping("/logout")
    public void logout() {
        System.out.println("User logout");
    }

}
