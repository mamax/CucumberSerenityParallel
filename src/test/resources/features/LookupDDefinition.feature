Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: Looking up the definition of 'cucumber'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'cucumber'
    Then they should see the definition 'A vine in the gourd family, Cucumis sativus.'

  Scenario: Looking up the definition of 'plum'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'plum'
    Then they should see the definition 'The edible, fleshy stone fruit of Prunus domestica, often of a dark red or purple colour.'
