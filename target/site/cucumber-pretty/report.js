$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Complete.feature");
formatter.feature({
  "line": 2,
  "name": "Complete",
  "description": "As a user I want to login website sauce demo",
  "id": "complete",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Complete"
    }
  ]
});
formatter.before({
  "duration": 47605856799,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal checkout",
  "description": "",
  "id": "complete;normal-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# Proses Buka Web dan Login"
    }
  ],
  "line": 7,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# Proses halaman product dan pilih product"
    }
  ],
  "line": 10,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User choice two product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click remove",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "# Proses halaman cart"
    }
  ],
  "line": 16,
  "name": "User already on cart page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#And User click continue shopping"
    },
    {
      "line": 18,
      "value": "# Proses kembali ke halaman produk"
    },
    {
      "line": 19,
      "value": "#Then User already on landing page"
    },
    {
      "line": 20,
      "value": "#And User choice 1 product from the list"
    },
    {
      "line": 21,
      "value": "#And User click cart"
    },
    {
      "line": 22,
      "value": "#Then User already on cart page"
    }
  ],
  "line": 23,
  "name": "User click checkout",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "# Proses halaman checkout"
    }
  ],
  "line": 25,
  "name": "User already on checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User input \"alia\" as firstName and input \"ulfah\" as lastName and input \"04\" as postalCode",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "# Proses halaman overview"
    }
  ],
  "line": 28,
  "name": "User already on overview page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Total must be match between expect and actual",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User click finish",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User already on complete page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 2557191500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 2383080301,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 131221000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 5790950500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasketTwo()"
});
formatter.result({
  "duration": 5945890699,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cartButton()"
});
formatter.result({
  "duration": 5167558300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceRemove()"
});
formatter.result({
  "duration": 5111661200,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.verifyCartPage()"
});
formatter.result({
  "duration": 107933999,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.checkoutButton()"
});
formatter.result({
  "duration": 5302171500,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCheckout()"
});
formatter.result({
  "duration": 5180337599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alia",
      "offset": 12
    },
    {
      "val": "ulfah",
      "offset": 42
    },
    {
      "val": "04",
      "offset": 72
    }
  ],
  "location": "CheckoutSteps.inputCredential(String,String,String)"
});
formatter.result({
  "duration": 6093214200,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.verifyOverview()"
});
formatter.result({
  "duration": 5088774801,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.verifyTotal()"
});
formatter.result({
  "duration": 5337432601,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.choiceFinish()"
});
formatter.result({
  "duration": 5251339201,
  "status": "passed"
});
formatter.match({
  "location": "CompleteSteps.verifyCompletePage()"
});
formatter.result({
  "duration": 146470901,
  "status": "passed"
});
formatter.after({
  "duration": 7031495900,
  "status": "passed"
});
});