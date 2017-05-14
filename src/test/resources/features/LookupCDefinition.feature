@fruit
Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  @smoke
  Scenario: Looking up the definition of 'orange'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'orange'
    Then they should see the definition 'An evergreen tree of the genus Citrus such as Citrus sinensis.'

  @regression
  Scenario: Looking up the definition of 'strawberry'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'strawberry'
    Then they should see the definition 'The sweet, usually red, edible fruit of certain plants of the genus Fragaria.'
