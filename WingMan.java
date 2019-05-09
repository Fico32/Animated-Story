/*
    Filip Milidrag
    Ms.Krasteva
    Oct 21 2018
    This program animates WingMan coming on to the screen to "film the action"
*/
import java.awt.*;
import hsa.Console;

public class WingMan extends Thread 
{
    Console c;           // The output console
    int setBack = 0;
    Color mainColor = new Color (240, 238, 59);
    public WingMan (Console con)
    {
	c = con;
    }


    public WingMan (Console con, int sb)
    {
	c = con;
	setBack = sb;
	mainColor = new Color (79, 69, 255);
    }


    public WingMan (Console con, int sb, boolean hi)
    {
	c = con;
	setBack = sb;
	mainColor = new Color (179, 0, 255);

    }


    public void display ()
    {

	for (int k = -65 ; k <= 400 - setBack ; k++)
	{
	    //erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (-1 + k, 120, 65, 66);
	    //draw
	    c.setColor (mainColor);
	    c.fillRect (30 + k, 140, 20, 40); //body
	    c.fillOval (30 + k, 120, 20, 20); //head
	    c.setColor (new Color (112, 181, 119));
	    c.fillRect (35 + k, 155, 10, 20); //arm
	    c.fillOval (35 + k, 175, 10, 10); //hand
	    c.fillArc (0 + k, 140, 30, 20, 0, 180); //wing
	    c.setColor (new Color (117, 202, 225));
	    c.fillArc (0 + k, 145, 30, 10, 0, 180); //erase part of wing
	    c.setColor (Color.black);
	    c.fillOval (43 + k, 125, 5, 5); //eye
	    c.drawLine (40 + k, 133, 47 + k, 135); //mouth
	    for (int j = 0 ; j <= 20 ; j += 20)
	    {
		for (int i = 0 ; i <= 6 ; i += 3) //feet
		{
		    c.drawLine (30 + k + j, 180, 25 + k + j + i, 185);
		}
	    }
	    c.fillRect (50 + k, 125, 10, 5); //camera
	    c.fillOval (60 + k, 125, 5, 5); //lense
	    try
	    {
		Thread.sleep (10);

	    }
	    catch (InterruptedException e)
	    {
	    }
	}


    }


    public void run ()
    {
	display ();
    }
} // WingMan class
