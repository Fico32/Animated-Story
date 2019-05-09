/*
    Filip Milidrag
    Ms.Krasteva
    Oct 21 2018
    This program animates Kid Rodent running across the screen and escaping Xepher and DrDonald
*/

import java.lang.*;
import java.awt.*;
import hsa.Console;

public class KidRodent implements Runnable
{
    Console c;

    public KidRodent (Console con)
    {
	c = con;
    }


    public void rodent1 ()
    {
	for (int i = 0 ; i <= 730 ; i++)
	{
	    //erase
	    c.setColor (new Color(0,155,0));
	    c.fillRect (-91 + i, 460, 90, 40);
	    //draw
	    c.setColor (new Color (255, 172, 0));
	    c.fillRect (-80 + i, 470, 50, 20);//body
	    c.setColor (new Color (179, 119, 255));
	    c.fillOval (-30 + i, 470, 20, 20);//head
	    c.setColor (new Color (255, 0, 0));
	    c.fillOval (-30 + i, 460, 20, 10);//hat
	    c.drawLine (-20 + i, 470, 0 + i, 470);//hat
	    c.setColor (new Color (0, 62, 208));
	    c.drawLine (-80 + i, 480, -90 + i, 490);//tail
	    c.fillOval (-80 + i, 490, 20, 10);//feet
	    c.fillOval (-40 + i, 490, 20, 10);//feet
	    c.setColor (new Color (0, 0, 0));
	    c.fillOval (-15 + i, 475, 2, 2);//eye
	    c.drawArc (-15 + i, 475, 8, 8, 180, 90);//mouth
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	   c.drawString ("Filip Milidrag", 0, 480);
  
    }


    public void run ()
    {
	rodent1 ();
    }
} // KidRodent class


