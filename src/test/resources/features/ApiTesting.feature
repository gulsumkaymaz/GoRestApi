Feature: Api testing for CRUD operators

  Background:
    Given user given api url "https://gorest.co.in/"

  Scenario Outline: POST-Create a new user
    Given set api endpoint "public/v2/users"
    And user creates new user with request body "<Name>","<Gender>","<Email>","<Status>"
    Then validate the status code 201
    And validate the userId is not null
    And validate the user name is "<Name>"
    And validate the user gender is "<Gender>"
    And validate the user email is "<Email>"
    And validate the user status is "<Status>"

    Examples:
      | Name     | Gender | Email               | Status |
      | John Doe | Male   | johndoe23@gmail.com | Active |

    Then sourcetree denemesi
 #  userDetails.json---> bu değeleri feature file dan almamız lazım ve parametre seklinde gonderilmesi lazım
  # onun icin yukarıdakileri parametirize etmek gerekiyor. create request yapmak için burası bizim templatemiz oluyor