package timecard.controllers.authorization;

import org.springframework.web.bind.annotation.*;
import timecard.entities.Employee;
import timecard.requests.AuthorizationDataByLogin;
import timecard.services.EmployeeAuthorizationService;
import timecard.services.impl.EmployeeAuthorizationServiceImpl;

/**
 * Authorization controller
 *
 * Created by Shubnik on 28.11.2016.
 */
@RestController
public class AuthorizationController {

    private static final EmployeeAuthorizationService service = new EmployeeAuthorizationServiceImpl();

    /**
     * Login employee in system with login and password in web (no security)
     * @param data employee login and password
     * @return employee information
     */
    @RequestMapping(name="/login", method=RequestMethod.POST)
    public Employee login(
            @RequestBody(required=true) AuthorizationDataByLogin data
    ) {
        return service.loginByPassword(data.getLogin(), data.getPassword())
                .orElseThrow(() -> new RuntimeException("could not find the employee '" + data.getLogin() + "'"));
    }

    /**
     * Logout employee from system in web
     */
    @RequestMapping("/logout")
    public void logout() {
        System.out.println("User logout");
    }

}
