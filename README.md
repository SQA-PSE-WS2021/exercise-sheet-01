# About
This is a template for an exercise using the hamster simulator. it contains an exercise class which extends SimpleHamsterGame and a launcher class
# How to use
* With your favorite IDE / Editor (Eclipse, IntelliJ, VS Code)
* Via command line: `mvn compile exec:java`
# To Change
### General
1. Update the hamster version in pom.xml line 10
1. Change the module name in pom.xml line 5
### For each game
1. Add a nameOfTheGame class which extends SimpleHamstergame (like TemplateHamsterGame)
1. Also create a {nameOfTheGame}App.java with the main method
1. Add the new App class to config.json
1. (Maybe) add a new profile to the maven exec plugin in pom.xml (see https://stackoverflow.com/a/51505284)
1. (Maybe) add a new territory to `src/main/resources/territories`
# WARNING
This is not finished yet!