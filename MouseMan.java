/*
    Filip Milidrag
    Ms.Krasteva
    Oct 21 2018
    This program animates MouseMan trying to escape Xepher
*/
import java.lang.*;
import java.awt.*;
import hsa.Console;

public class MouseMan extends Thread
{
    Console c;           // The output console

    public MouseMan (Console con)
    {
	c = con;
    }


    public void display ()
    {
	for (int i = 0 ; i <= 600 ; i++)
	{
	    //erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (-81 + i, 200, 50, 100);
	    //draw
	    c.setColor (Color.black);
	    c.fillArc (-60 + i, 290, 10, 10, 0 - i, 180);//hlaf of a wheel
	    c.setColor (new Color (255, 255, 0));
	    c.fillArc (-60 + i, 290, 10, 10, 180 - i, 180);//hlaf of a wheel
	    c.setColor (Color.black);
	    c.fillArc (-40 + i, 290, 10, 10, 0 - i, 180);//hlaf of a wheel
	    c.setColor (new Color (255, 255, 0));
	    c.fillArc (-40 + i, 290, 10, 10, 180 - i, 180);//hlaf of a wheel
	    c.setColor (new Color (255, 125, 255));
	    c.fillRect (-60 + i, 250, 10, 40);//pants
	    c.fillRect (-40 + i, 250, 10, 40);//pants
	    c.fillRect (-50 + i, 250, 10, 10);//pants
	    c.setColor (new Color (51, 51, 51));
	    c.fillRect (-60 + i, 220, 30, 30);//body
	    c.setColor (new Color (255, 172, 119));
	    c.fillOval (-80 + i, 230, 10, 10);//hand
	    c.fillOval (-60 + i, 200, 30, 20);//head
	    c.setColor (Color.black);
	    c.fillRect (-70 + i, 230, 30, 10);//arm
	    c.fillOval (-40 + i, 205, 5, 5);//eye
	    c.drawLine (-42 + i, 212, -32 + i, 212);//mouth
	    c.setColor (Color.yellow);
	    c.fillStar (-40 + i, 220, 10, 10);//star
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void run ()
    {
	display ();
    }
} // MouseMan class
