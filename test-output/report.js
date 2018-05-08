$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/anuba/eclipse-workspace/FreeCRMBDDFramework/src/main/java/com/qa/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature of FreeCRM app",
  "description": "",
  "id": "login-feature-of-freecrm-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the login feature of Free CRM app",
  "description": "",
  "id": "login-feature-of-freecrm-app;verify-the-login-feature-of-free-crm-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in the FreeCRM app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password and clicks Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "FreeCRM HomePage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginPageStepDefinitions.user_is_in_the_FreeCRM_app()"
});
formatter.result({
  "duration": 9677677135,
  "status": "passed"
});
formatter.match({
  "location": "loginPageStepDefinitions.user_enters_username_and_password_and_clicks_Login_button()"
});
formatter.result({
  "duration": 6529768826,
  "status": "passed"
});
formatter.match({
  "location": "loginPageStepDefinitions.freecrm_HomePage_is_displayed()"
});
formatter.result({
  "duration": 20528362,
  "status": "passed"
});
});