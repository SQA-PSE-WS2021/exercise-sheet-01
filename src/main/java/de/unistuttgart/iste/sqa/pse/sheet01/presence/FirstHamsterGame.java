package de.unistuttgart.iste.sqa.pse.sheet01.presence;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;


/**
 * A simple HamsterGame where paule can walk a path of grains
 */
public class FirstHamsterGame extends InspectableSimpleHamsterGame {

    /**
     * Creates a new FirstHamsterGame
     */
    public FirstHamsterGame() {
        this.loadTerritoryFromResourceFile("/territories/territory.ter");
        this.displayInNewGameWindow();
        game.startGame();
    }
    
    /**
     * Executed after the game is started.
     * Can be used to execute hamster commands
     */
    @Override
    protected void run() {
        // do nothing
    }
}
