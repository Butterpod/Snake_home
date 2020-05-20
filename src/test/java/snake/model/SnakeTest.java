package snake.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeTest {

    private Snake mockSnake;
    /**
     *  Test la creation de l'objet Snake
     */
    @Test
    public void testInstance(){
        assertTrue(mockSnake instanceof Snake);
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeAll
    public void setUp(){
        this.mockSnake = new Snake();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterAll
    public void tearDown(){

    }
}