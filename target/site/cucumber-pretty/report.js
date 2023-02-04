$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Overview.feature");
formatter.feature({
  "line": 2,
  "name": "Checkout",
  "description": "As a user I want to login website sauce demo",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Overview"
    }
  ]
});
formatter.before({
  "duration": 117273933800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal checkout",
  "description": "",
  "id": "checkout;normal-checkout",
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
  "name": "User sort product list by \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User choice 2 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click cart",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "# Proses halaman cart"
    }
  ],
  "line": 15,
  "name": "User already on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click continue shopping",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "# Proses kembali ke halaman produk"
    }
  ],
  "line": 18,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User choice 1 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click cart",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User already on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User click checkout",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "# Proses halaman checkout"
    }
  ],
  "line": 24,
  "name": "User already on checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User input \"alia\" as firstName and input \"ulfah\" as lastName and input \"04\" as postalCode",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "# Proses halaman overview"
    }
  ],
  "line": 27,
  "name": "User already on overview page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Total seharusnya sesuai dengan ekspektasi",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 3139789200,
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
  "duration": 2559280500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 156753500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 5580702100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasket()"
});
formatter.result({
  "duration": 6073063200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cartButton()"
});
formatter.result({
  "duration": 5105922400,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.verifyCartPage()"
});
formatter.result({
  "duration": 154899300,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.continueShoppingButton()"
});
formatter.result({
  "duration": 5215835100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 62391700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasketTas()"
});
formatter.result({
  "duration": 5069638500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.cartButton()"
});
formatter.result({
  "duration": 5093457300,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.verifyCartPage()"
});
formatter.result({
  "duration": 57006200,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.checkoutButton()"
});
formatter.result({
  "duration": 5150869100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCheckout()"
});
formatter.result({
  "duration": 5077976300,
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
  "duration": 5761976100,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.verifyOverview()"
});
formatter.result({
  "duration": 5080230800,
  "status": "passed"
});
formatter.match({
  "location": "OverviewSteps.verifyTotal()"
});
formatter.result({
  "duration": 5160976900,
  "status": "passed"
});
formatter.after({
  "duration": 1654283900,
  "status": "passed"
});
});