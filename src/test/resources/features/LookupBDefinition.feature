@vegetables
Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  @smoke
  Scenario: Looking up the definition of 'tomato'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'tomato'
    Then they should see the definition 'A widely cultivated plant, Solanum lycopersicum, having edible fruit'

  @regression
  Scenario: Looking up the definition of 'potato'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'potato'
    Then they should see the definition 'A plant tuber, Solanum tuberosum, eaten as a starchy vegetable, particularly in the Americas and Europe'
