$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 271428,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user launches \"firefox\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user opens URL \"http://automationpractice.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on Authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters valid email as \"q49062405@yopmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Clicks create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on the registration page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 15
    }
  ],
  "location": "RegistrationStepDefinition.user_launches_browser(String)"
});
formatter.result({
  "duration": 16892336347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/",
      "offset": 16
    }
  ],
  "location": "RegistrationStepDefinition.user_opens_URL(String)"
});
formatter.result({
  "duration": 3050047520,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_clicks_Sign_in()"
});
formatter.result({
  "duration": 2588823923,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_is_on_Authentication_page()"
});
formatter.result({
  "duration": 89470251,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "q49062405@yopmail.com",
      "offset": 28
    }
  ],
  "location": "RegistrationStepDefinition.user_enters_valid_email_as(String)"
});
formatter.result({
  "duration": 112669943,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.clicks_create_an_account_button()"
});
formatter.result({
  "duration": 298943385,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_should_land_on_the_registration_page()"
});
formatter.result({
  "duration": 10199554,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Register with valid input",
  "description": "",
  "id": "registration-feature;register-with-valid-input",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "user inputs valid data",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks register button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "page heading should be \"MY ACCOUNT\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefinition.user_inputs_valid_data()"
});
formatter.result({
  "duration": 4349353687,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_clicks_register_button()"
});
formatter.result({
  "duration": 5262406782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MY ACCOUNT",
      "offset": 24
    }
  ],
  "location": "RegistrationStepDefinition.page_heading_should_be(String)"
});
formatter.result({
  "duration": 43344092,
  "status": "passed"
});
formatter.after({
  "duration": 2116423681,
  "status": "passed"
});
formatter.before({
  "duration": 166161,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user launches \"firefox\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user opens URL \"http://automationpractice.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on Authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters valid email as \"q49062405@yopmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Clicks create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on the registration page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 15
    }
  ],
  "location": "RegistrationStepDefinition.user_launches_browser(String)"
});
