Feature: Search and Place the order of Products

  
  Scenario: Search Experience for product search in both home and offers page. 
    Given User is on Greencart landing page
    When when user search with a short name like "tom"
    Then same result should be displayed when user search with "tom" on offers page
