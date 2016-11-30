package timecard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import timecard.entities.Employee;

import java.util.Optional;

/**
 * Repository for {@link Employee}
 *
 * Created by Shubnik on 29.11.2016.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeByLogin(@Param("login") String login);

}
