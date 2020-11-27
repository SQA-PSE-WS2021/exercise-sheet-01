# About
This is a template for an exercise using the hamster simulator. it contains an exercise class which extends SimpleHamsterGame and a launcher class
# How to use
* With your favorite IDE / Editor (Eclipse, IntelliJ, VS Code)
* Via command line: `mvn compile exec:java`
# To Change
### General
1. Update the hamster version in pom.xml line 10
1. Change the module name in pom.xml line 5
1. Update the package sheet number. SimpleHamsterGames can also be added to subpackages. Also update the package name at
    * all java classes in the package
    * module-info.java (each package needs an export statement)
    * the config
    * maven exec plugin mainClass in pom.xml
    * the test cases
1. Update the README so that it contains useful information for students
### For each game
1. Add a nameOfTheGame class which extends SimpleHamstergame (like TemplateHamsterGame)
1. Also create a {nameOfTheGame}App.java with the main method
1. Add the new App class to config.json
1. (Maybe) add a new execution to the maven exec plugin in pom.xml
1. (Maybe) add a new territory to `src/main/resources/territories`