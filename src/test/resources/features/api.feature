Feature: API Testing

  Scenario: Verify product API
    Given User sends GET request to product API
    Then API response status should be 200