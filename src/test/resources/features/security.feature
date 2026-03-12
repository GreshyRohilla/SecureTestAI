Feature: Security Validation

  Scenario: Detect SQL Injection
    Given User enters malicious SQL input
    Then System should flag potential security risk