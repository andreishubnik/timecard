package timecard.services;

import org.junit.Test;
import timecard.entities.Employee;
import timecard.services.impl.EmployeeAuthorizationServiceImpl;

/**
 * Test EmployeeAuthorizationService
 *
 * Created by Shubnik on 08.12.2016.
 */
public class EmployeeAuthorizationServiceTest {

    @Test
    public void testSuccessAuthorization() throws Exception {
        EmployeeAuthorizationService service = new EmployeeAuthorizationServiceImpl();

        service.loginByPassword("login", "password")
                .map(Employee::getId)
                .orElseThrow(() -> new Exception("Can not find Employee by login"));
    }

    @Test
    public void testNullLoginAuthorization() throws Exception {
        EmployeeAuthorizationService service = new EmployeeAuthorizationServiceImpl();

        if (service.loginByPassword(null, "password").isPresent()) {
            throw new Exception("This is impossible!");
        }
    }

    @Test
    public void testNullPasswordAuthorization() throws Exception {
        EmployeeAuthorizationService service = new EmployeeAuthorizationServiceImpl();

        if (service.loginByPassword("login", null).isPresent()) {
            throw new Exception("This is impossible!");
        }
    }

}
