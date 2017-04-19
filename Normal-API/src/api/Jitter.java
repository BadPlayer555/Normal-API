package api;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.util.Random;

public class Jitter {
	
	public static Random rand = new Random();
	

	public static void jitter() throws AWTException {
	    
		System.out.println("Hi");
		
		int Jittersize = 1;
		
		Robot r = new Robot();
	    int mouseY = MouseInfo.getPointerInfo().getLocation().y;
	    int mouseX = MouseInfo.getPointerInfo().getLocation().x;
	    
	   int addY = rand.nextBoolean() ? rand.nextInt(Jittersize + 1) - 1 : 0 - (rand.nextInt(Jittersize + 1) - 1);
	   int addX = rand.nextBoolean() ? rand.nextInt(Jittersize + 1) - 1 : 0 - (rand.nextInt(Jittersize + 1) - 1);
	    
	    r.mouseMove(mouseX + addY, mouseY + addX);
	  }
	}

	

