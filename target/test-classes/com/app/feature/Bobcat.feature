Feature:  Validate To Get Eqiupment Title
@bopcat
Scenario: Get The Loaders
Given Load The browser "Chrome"
    And Load The Url "https://www.bobcat.com/in/en"
    Given Click The acceptAllCookies
    And  Click The Eqiupment
    And  GetText In Loaders
    And  GetText In Mini Excavators
    And  GetText In Forklifts
    And  GetText In Portable Power
   