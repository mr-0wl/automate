import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Robot05{
  //Create an array of keycode data
  int keyInput[] = {
      KeyEvent.VK_H,
      KeyEvent.VK_E,
      KeyEvent.VK_L,
      KeyEvent.VK_L,
      KeyEvent.VK_O
  };//end keyInput array

  public static void main(String[] args)
                 throws AWTException,IOException{

    //Start the Windows Notepad program running
    // in a separate process.  It should become
    // the active window, capable of accepting
    // input from the keyboard.
    Runtime.getRuntime().exec("notepad");

    //Get a Robot object that will be used to
    // enter characters into the Notepad document
    Robot robot = new Robot();

    //Enter the keycodes contained in the
    // keyInput array into the Notepad document.
    // Make the first character upper case and
    // the remaining characters lower case.
    robot.keyPress(KeyEvent.VK_SHIFT);
    for (int cnt2 = 0;
                 cnt2 < keyInput.length; cnt2++){
      if(cnt2 > 0){
             robot.keyRelease(KeyEvent.VK_SHIFT);
      }//end if
      robot.keyPress(keyInput[cnt2]);
      //Insert a one-half second delay between
      // characters.
      robot.delay(500);
    }//end for loop
  }//main
}//end class Robot05
