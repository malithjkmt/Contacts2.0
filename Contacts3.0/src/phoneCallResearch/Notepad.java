/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneCallResearch;

/**
 *  http://www.avajava.com/tutorials/lessons/how-do-i-run-another-application-from-java.html?page=2
 * @author http://stackoverflow.com/a/2549184/3332429
 */
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Notepad {

    static int keyInput[] = { KeyEvent.VK_J, KeyEvent.VK_A, KeyEvent.VK_V,
            KeyEvent.VK_A, KeyEvent.VK_SPACE };

    public static void main(String[] args) throws Exception {

        Runtime.getRuntime().exec("notepad");

        Robot robot = new Robot();
        for (int i = 0; i < keyInput.length; i++) {
            robot.keyPress(keyInput[i]);
           robot.delay(100);
            
        }
    }
}