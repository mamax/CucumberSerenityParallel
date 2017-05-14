@vegetables
Feature:
  In order to talk better
  As an English student
  I want to look up word definitions

  @smoke
Scenario: Looking up the definition of 'beet'
  Given the user is on the Wikionary home page
  When the user looks up the definition of the word 'beet'
  Then they should see the definition '(countable) Beta vulgaris, a plant with a swollen root which is eaten or used to make sugar.'

  @regression
Scenario: Looking up the definition of 'pepper'
  Given the user is on the Wikionary home page
  When the user looks up the definition of the word 'pepper'
  Then they should see the definition 'A plant of the family Piperaceae.'