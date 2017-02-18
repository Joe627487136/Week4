package Week4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by zhouxuexuan on 18/2/17.
 */

class GameChain {
    public String state;

    public GameChain()     { state = "off"; }
    public void pulldown() {
        if (state.equals("off")) {
            state = "game_menu";
            System.out.println("Game_menu");
        } else if (state.equals("game_menu")) {
            state = "lobby";
            System.out.println("Lobby");
        } else if (state.equals("lobby")) {
            state = "ingame";
            System.out.println("In_game_scene");
        } else if (state.equals("ingame")){
            state = "endgame";
            System.out.println("End_game_scene");
        }

    }
    public void pulluptooff() {
        if (state.equals("endgame")) {
            state = "off";
            System.out.println("Game not running");
        } else if (state.equals("ingame")) {
            state = "off";
            System.out.println("Game not running");
        } else if (state.equals("lobby")) {
            state = "off";
            System.out.println("Game not running");
        } else if (state.equals("game_menu")){
            state = "off";
            System.out.println("Game not running");
        }
    }
    public void pulluptomenu() {
        if (state.equals("endgame")) {
            state = "game_menu";
            System.out.println("Game_menu");
        } else if (state.equals("lobby")) {
            state = "game_menu";
            System.out.println("Game_menu");
        } else if (state.equals("ingame")) {
            state = "game_menu";
            System.out.println("Game_menu");
        }
    }
}

class Gamemanager{
    GameChain chain = new GameChain();
    public void run(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("input an instruction:\n");
            String ins = sc.next();
            if (ins.equals("quit")){
                chain.pulluptooff();
            }
            if (ins.equals("backtomenu")){
                chain.pulluptomenu();
            }
            if (ins.equals("next")){
                chain.pulldown();
            }
            if (ins.equals("break")){
                System.out.println("Gamemanager terminated");
                break;
            }
        }

    }
    public String getstate(){
        return chain.state;
    }
}
class Gamerun {
    public static void main( String[] args ) throws IOException {
        Gamemanager gamemanager = new Gamemanager();
        gamemanager.run();
    }
}