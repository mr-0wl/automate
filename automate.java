// placehold
import java.awt.*;
import java.awt.event.*;

public class automate{

  public static void main(String[] args)
                             throws AWTException{
                               int keyInput[] = {
                                   KeyEvent.VK_H,
                                   KeyEvent.VK_E,
                                   KeyEvent.VK_L,
                                   KeyEvent.VK_L,
                                   KeyEvent.VK_O,
                                   KeyEvent.VK_W,
                                   KeyEvent.VK_O,
                                   KeyEvent.VK_R,
                                   KeyEvent.VK_L,
                                   KeyEvent.VK_D,
                               };
    Robot robot = new Robot();
    //You may need to modify these coordinates if
    // they fail to place the mouse pointer on
    // the Close button of the non-Java program
    // that you are trying to terminate.
    robot.mouseMove(200,1070);
    robot.delay(2000);
    robot.mouseMove(1000, 50);

    //Press and then release the left mouse
    // button.  The delays are provided so that
    // you can view the action.  Watch the upper-
    // right corner of the screen when you run
    // this program.
    robot.delay(2000);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(2000);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    // the remaining characters lower case.
    robot.keyPress(KeyEvent.VK_SHIFT);
    for (int cnt2 = 0;
                 cnt2 < 10; cnt2++){
      if(cnt2 > 0){
             robot.keyRelease(KeyEvent.VK_SHIFT);
      }//end if
      robot.keyPress(keyInput[cnt2]);
      //Insert a one-half second delay between
      // characters.
      robot.delay(500);
    }//end for loop
  }//end main
  //-------------------------------------------//

}//end class Robot04
