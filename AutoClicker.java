/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class AutoClicker {
    
    public static void main(String[] args) throws Exception {
        
        Robot robot = new Robot();

        Random random = new Random();

        int delay = 2000;

        while (true) {
            // Phát ra một click chuột
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // Ngừng một thời gian ngẫu nhiên
            Thread.sleep(delay + random.nextInt(100));

            // Tăng tốc độ ngẫu nhiên
            delay -= random.nextInt(50);
            if (delay < 1) {
                delay = 1;
            }
        }
    }
}