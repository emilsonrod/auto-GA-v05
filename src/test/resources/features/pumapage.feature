# puma page test
Feature: Pumapage
  Background: Load page
    Given puma page is loaded

  Scenario: Home page from puma page is displayed
    And hover men link
    And go to futbol page
    And get price calzado