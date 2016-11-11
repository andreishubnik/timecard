
# Timecard

Standalone service for employee time management in organization.

## Main capabilities
Provides functionality for:
* CRUD of an employee profile;
* Reporting about different types of time periods (at work, hospital, vacations, business trips, etc.) by employees during the day;
* Accounting working time for employees;
* Creating and exporting reports for a specified period (day, week, month, year);
* REST API for integration.
Supports:
* Employees' groups for assigning special working time regulations;
* Setting the working time regulations for each date (holidays, shortened days).

## Domain entities

### Employee
Employee in the organization. Use system to report about activity during the day.

### Employee profile
Contains information about employee: employee id, name, etc.

### Employee group

### Time period
Defines continues period of time between two time stamps from `start`(include) to `end` (exclude) in a day and having a certain type.
* Two time periods can't intersect.
* Being recorded from untrusted sources - requires additional confirmation by privileged person in the organization.
* Being persisted cannot be deleted. But can be marked as `deleted` for exclude from accounting.
* Being persisted cannot be edited. But can be marked as `modifyed` and be set as a parent for new time period.

### Types of time period
* Used for indicate type of activity of an employee during this time period (for example: at work, hospital, vacations, business trips, etc.).

### User
* Represents authorized account of the employee in the system.

### Role of user
* Defines available actions for the user in the system.

#### Administrator role
A user with administrator rights.
Its capabilities include:
* View list of all employees;
* CRUD of employee's profiles;
* CRUD and confirmation of any time periods of any employee.

#### Employee role
A user with the rights of employees.
Its capabilities include:
* View list of all employees;
* View and edit his own profile;
* CRUD of his own time periods.

## API

### Login employee

### Logout employee

### Create user for the employee

### Get the employee profile

### Update profile of the employee

### Add time period for the employee

### Edit time period for the employee

### Remove time period for the employee

### Get report of time periods for employee

### List employees
