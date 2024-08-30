Feature: home page validation

  Scenario: Validate When user navigate to home page title is TEK Insurance UI
  and create Primary Account Button is exist
    Given open browser and navigate to insurance app
    Then validate home page title is TEK Insurance App
    Then close the browser
