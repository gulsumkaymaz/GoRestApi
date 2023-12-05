Feature: Api testing for CRUD operators

  Background: User given api url "https://gorest.co.in/"

  Scenario Outline: POST-Create a new user
    Given set api endpoint "public/v2/users"
    And User creates new user with request body "<Name>","<Gender>","<Email>","<Status>"
    Then validate the status code 201
    And validate the userId is not null
    And validate the user name is "<Name>"
    And validate the user gender is "<Gender>"
    And validate the user email is "<Email>"
    And validate the user status is "<Status>"


    Examples:
      | Name     | Gender | Email               | Status |
      | John Boe | Male   | johnboe23@gmail.com | Active |
