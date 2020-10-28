package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise00.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;


/**
 * A template SimpleHamsterGame
 */
public class TemplateHamsterGame extends SimpleHamsterGame {
    
    /**
     * Put the hamster code into this method.
     * Solve the task in this method NOT in the constructor
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/territoryExample00.ter");
        this.displayInNewGameWindow();
        game.startGame();

        // simple example program
        for (int i = 0; i < 4; i++) {
            while (paule.frontIsClear()) {
                paule.move();
            }
            paule.turnLeft();
        }
    }
}
