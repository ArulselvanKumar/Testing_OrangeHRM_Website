Feature: adding a new Employee in orange HRM

  Scenario: user adding a new employee by using pim
    Given user launches the Application URL
    When user in on login page
    And user should navigate to pim and click the pim
    And user click the add employee
    And user enters the valid credentials in Employee First Name
    And user enters the valid credentials in Employee Middle Name
    And user enters the valid credentials in Employee Last Name
    Then user click the save button new employee should be successfully created

  Scenario: user find the newly created employee name in Employee list by using search option
    When user click the employee list
    And user enters the newly created employee name in Employee name field
    Then user click the search button newly created employee name should be displayed in record found section
