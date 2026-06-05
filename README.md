# Final QA Automation Project

## Overview

This project is a Final QA Automation Project built using Java, Selenide, TestNG, Maven, and Allure Report.

The project demonstrates automated UI testing of an e-commerce website using the Page Object Model (POM) design pattern and Allure reporting.

## Tech Stack

* Java 17
* Maven
* Selenide
* TestNG
* Allure Report
* Git & GitHub

## Project Structure

src/test/java

* pages

  * authentication
  * cart
  * chat
  * contact

* steps

  * authentication
  * cart
  * chat
  * contact

* tests

  * authentication
  * cart
  * chat
  * contact

* utils

  * Constants
  * TestData

## Implemented Test Cases

### Authentication

* TC-02 Forgot Password Validation

### Contact Form

* TC-01 Contact Form Validation

### Shopping Cart

* TC-03 Discounted Product Cart Validation

### Coupon Validation

* TC-10 Invalid Coupon Validation

### Live Chat

* TC-09 Live Chat Message Validation

## Features

* Page Object Model (POM)
* Reusable Step Classes
* Test Data Management
* Allure Reporting
* Clean Project Structure
* Git Version Control

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
