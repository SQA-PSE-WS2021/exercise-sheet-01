package de.unistuttgart.iste.sqa.oo.hamstersimulator.sheet00.homework;

import de.hamstersimulator.objectsfirst.external.model.SimpleHamsterGame;


/**
 * A template SimpleHamsterGame
 */
public class TemplateHamsterGame extends SimpleHamsterGame {

    /**
     * Creates a new TemplateHamsterGame
     */
    public TemplateHamsterGame() {
        this.loadTerritoryFromResourceFile("/territories/territoryExample00.ter");
        this.displayInNewGameWindow();
        game.startGame();
    }
    
    /**
     * Put the hamster code into this method.
     * Solve the task in this method NOT in the constructor
     */
    @Override
    protected void run() {
        // simple example program
        for (int i = 0; i < 4; i++) {
            while (paule.frontIsClear()) {
                paule.move();
            }
            paule.turnLeft();
        }
    }
}
