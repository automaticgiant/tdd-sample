Feature: Validate form for Pet credit cards

  Scenario: Bob Bobson applies for a credit card for his llama Rudolph
    Given Bob Bobson has a 10 year old llama Rudolph
    And Rudolph has 0 credit cards
    When Rudolph applies for a credit card
    Then the credit card should be declined

  Scenario: Mary Maryson applies for a credit card for her dog Charles
    Given Mary Maryson has a 5 year old dog Charles
    And Charles has 1 credit card
    When Charles applies for a credit card
    Then the credit card should be approved
    And the credit card has a $200 limit
