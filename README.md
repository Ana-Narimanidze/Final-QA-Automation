# Final QA Automation Project

## Overview

This project was created as part of my Final QA Automation assignment.

It includes manual testing, bug reports, and automated test cases built with Java, Selenide, and TestNG.


### Trello Board

https://trello.com/invite/b/6a22fa5d9ece95f381c88e27/ATTIda0b60ff61802c486aa8e1a922a0176bCFC1AC5D/final-qa-automation

## Technologies Used

* Java 17
* Maven
* Selenide
* TestNG
* Allure Report
* Git & GitHub

## Project Structure

* pages
* steps
* tests
* utils

The project follows the Page Object Model (POM) structure and uses reusable step classes to keep the code clean and easy to understand.

## Automated Test Cases

The following test cases were automated:

* TC-01 Contact Form Validation
* TC-02 Forgot Password Validation
* TC-03 Discounted Product Cart Validation
* TC-09 Live Chat Message Validation
* TC-10 Invalid Coupon Validation

## Manual Testing

For the manual testing part, I prepared:

* 10 Test Cases
* 5 Failed Test Cases
* 5 Passed Test Cases
* 5 Bug Reports

Screenshots and video recordings were attached as evidence for the executed tests and reported bugs.

## Run Tests

```bash
mvn clean test
```

## Generate Allure Report

```bash
allure serve target/allure-results
```

## Author

Ana Narimanidze

