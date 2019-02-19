Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Looking up the translation of 'apple'
Given the user is on the google translate page
Given selected languages from англійська to українська
When the user looks up the translation of the word 'apple'
Then they should see the translation 'яблуко'

Scenario: Check the number of characters entered
Given the user is on the google translate page
Given selected languages from англійська to українська
When the user looks up the translation of the word 'apple'
Then the number of characters must be '6'

Scenario: Looking up the definition of 'apple'
Given the user is on the google translate page
Given selected languages from англійська to українська
When the user looks up the translation of the word 'apple'
Then they should see the definition 'the tree which bears apples.'