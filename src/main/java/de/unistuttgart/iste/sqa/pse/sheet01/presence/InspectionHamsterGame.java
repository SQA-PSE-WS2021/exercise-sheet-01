package de.unistuttgart.iste.sqa.pse.sheet01.presence;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;


/**
 * A template SimpleHamsterGame
 */
public class InspectionHamsterGame extends InspectableSimpleHamsterGame {

    /**
     * Creates a new TemplateHamsterGame
     */
    public InspectionHamsterGame() {
        this.loadTerritoryFromResourceFile("/territories/territory.ter");
        this.displayInNewGameWindow();
        game.startGame();
    }
    
    /**
     * TODO
     */
    @Override
    protected void run() {
        // do nothing
    }
}
