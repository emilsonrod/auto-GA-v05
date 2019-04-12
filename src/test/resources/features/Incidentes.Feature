# Incident Review the functionality of Registrar Maquinaria
Feature: Incidentes

  Background: Load page
    Given Load Page

  Scenario: Registrar Maquinaria is displayed
    And got to mi page 'Registrar Maquinaria'
    And submit form'

  Scenario: Edit Maquina
    And got to 'catalogo'
    And edit maquinaria
    And submit edit form

  Scenario: Eliminar Maquina
    And got to 'catalogo'
    And delete maquinaria