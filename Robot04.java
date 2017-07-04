// 1
// placehold
import java.awt.*;
import java.awt.event.*;

public class Robot04{
  public static void main(String[] args)
                             throws AWTException{
    Robot robot = new Robot();
    //You may need to modify these coordinates if
    // they fail to place the mouse pointer on
    // the Close button of the non-Java program
    // that you are trying to terminate.
    robot.mouseMove(1005,10);

    //Press and then release the left mouse
    // button.  The delays are provided so that
    // you can view the action.  Watch the upper-
    // right corner of the screen when you run
    // this program.
    robot.delay(2000);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(2000);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
  }//end main
  //-------------------------------------------//

}//end class Robot04
