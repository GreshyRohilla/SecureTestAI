Feature: Add to Cart

  Scenario: Add product to cart
    Given User launches the e-commerce website
    When User navigates to products page
    And User adds first product to cart
    Then Product should be added successfully