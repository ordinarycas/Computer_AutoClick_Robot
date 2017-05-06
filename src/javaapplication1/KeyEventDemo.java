package javaapplication1;
//KeyEventDemo

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo{
  public static void main(String[] args)throws Exception,AWTException,InterruptedException{
           Robot robot = new Robot();

           robot.mousePress(InputEvent.BUTTON1_MASK);
           
           /*while(true){
           robot.mousePress(InputEvent.BUTTON1_MASK);
           robot.mouseRelease(InputEvent.BUTTON1_MASK);
           Thread.sleep(3000);  // 讓執行緒睡3秒
        }*/
  }
}