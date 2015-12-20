/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneCallResearch;

/**
 *
 * @author Malith
 */
import java.io.IOException;

public class RuntimeExecTest1 {

    public static void main(String[] args) {
        try {
            System.out.println("Opening notepad");
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("PhotoFiltre");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Closing notepad");
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
