package Week4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;

/**
 * Created by zhouxuexuan on 18/2/17.
 */

public class Gametest {
    @Test
    public void test1() {//off-menu-lobby-ingame-endgame-off
        Gamemanager gamemanager = new Gamemanager();
        String simulatedUserInput =
                "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "quit" + System.getProperty("line.separator")
                        + "break" + System.getProperty("line.separator");


        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        gamemanager.run();
        assertTrue(gamemanager.getstate()=="off");
    }
    @Test
    public void test2() {//off-menu-lobby-menu-off
        Gamemanager gamemanager = new Gamemanager();
        String simulatedUserInput =
                "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "backtomenu" + System.getProperty("line.separator")
                        + "quit" + System.getProperty("line.separator")
                        + "break" + System.getProperty("line.separator");


        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        gamemanager.run();
        assertTrue(gamemanager.getstate()=="off");
    }
    @Test
    public void test3() {//off-menu-lobby-menu
        Gamemanager gamemanager = new Gamemanager();
        String simulatedUserInput =
                "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "next" + System.getProperty("line.separator")
                        + "backtomenu" + System.getProperty("line.separator")
                        + "break" + System.getProperty("line.separator");


        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        gamemanager.run();
        assertTrue(gamemanager.getstate()=="game_menu");
    }
}

