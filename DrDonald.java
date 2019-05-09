/*
    Filip Milidrag
    Ms.Krasteva
    Oct 21 2018
    Thsi class draws DrDonald and animtes him coming across the screen. It then prints out text that he says.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class DrDonald implements Runnable
{
    Console c;
    public DrDonald (Console con)
    {
	c = con;
    }


    public void display ()
    {
	for (int i = -60 ; i <= 260 ; i++)
	{
	    //erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (-1 + i, 200, 60, 61);
	    //draw
	    c.setColor (new Color (51,51,51));
	    c.fillRect (20 + i, 220, 20, 20); //body
	    //wings
	    c.fillOval (0 + i, 220, 20, 20);
	    c.fillOval (40 + i, 220, 20, 20);
	    c.fillOval (20 + i, 200, 20, 20);
	    c.fillOval (20 + i, 240, 20, 20);
	    c.setColor (new Color (66,255,203));
	    //stripes
	    c.drawLine (30 + i, 200, 30 + i, 220);
	    c.drawLine (30 + i, 240, 30 + i, 260);
	    c.drawLine (0 + i, 230, 20 + i, 230);
	    c.drawLine (40 + i, 230, 60 + i, 230);
	    c.fillOval (23 + i, 225, 5, 5); //eyes
	    c.fillOval (33 + i, 225, 5, 5); //eyes
	    c.drawArc (23 + i, 223, 14, 14, 200, 140);//mouth
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (InterruptedException e)
	    {
	    }
	}
	c.setColor (Color.black);
	c.drawString ("Good job, now we need to find Kid Rodent.", 320, 210);
    }


    public void run ()
    {
	display ();
    }
} // DrDonald class
