#Feature: Test login functionality
#
#  @smoke
##  Scenario: Check login is successful with valid credentials          #without multiple username and password
#  Scenario Outline: Check login is successful with valid credentials   #with multiple username and password
#    Given site is open
#    And user is on login page
#   # with multiple username and password
##    When user enters username and password
#    # with multiple username and password
#    When user enters <username> and <password>
#    And clicks to login button
#    Then the user is navigated to the product page
#
#    Examples:
#      | username      | password     |
#      | standard_user | secret_sauce |
#      | problem_user  | secret_sauce |
#      | error_user    | secret_sauce |
