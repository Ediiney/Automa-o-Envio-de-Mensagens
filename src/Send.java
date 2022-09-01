import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Send {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		int x = 1;
		
		Robot robot = new Robot();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your text");
		String Text = scanner.nextLine();
		
		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);
		
		System.out.println("The sends will start in 5 seconds");
		Thread.sleep(5000);
		
		while (x < 100) {
			Thread.sleep(1000);
		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			x++;
			
		}
	}

}
