Feature: Login in PPE application
Scenario: PPE login 
 Given Agent Already On Login Page
    When Tittle Of Login Page Is Login        
    Then Agent Entering "ih.testga1" and "Password123"
    Then Click Login Button
    When URL Of LoggedIn Page
    Then Click GuidLines Link
