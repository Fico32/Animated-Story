/*
    Filip Milidrag
    Ms.Krasteva
    Oct 21 2018
    This program animates Soldier trying to escape Xepher
*/
import java.awt.*;
import hsa.Console;

public class Soldier implements Runnable
{
    Console c;

    public Soldier (Console con)
    {
	c = con;
    }


    public void drawSoldier ()
    {


	for (int i = -90 ; i <= 420 ; i++)
	{
	    //erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (-1 + i, 200, 90, 100);
	    //draw
	    c.setColor (Color.black);
	    c.fillOval (15 + i, 200, 20, 20);//head
	    c.setColor (new Color (0, 62, 208));
	    c.fillRect (10 + i, 270, 10, 25);//body
	    c.fillRect (30 + i, 270, 10, 25);//body
	    c.fillRect (10 + i, 220, 30, 40);//body
	    c.setColor (new Color (255, 102, 255));
	    c.fillRect (0 + i, 260, 90, 10);//trident
	    c.fillRect (60 + i, 240, 10, 50);//trident
	    c.fillRect (60 + i, 240, 30, 10);//trident
	    c.fillRect (60 + i, 280, 30, 10);//trident
	    c.setColor (new Color (179, 255, 0));
	    c.fillRect (20 + i, 230, 10, 30);//arm
	    c.setColor (new Color (0, 62, 28));
	    c.fillArc (15 + i, 200, 20, 20, 30, 150);//hat
	    c.setColor (Color.white);
	    c.fillOval (30 + i, 207, 5, 5);//eye
	    c.drawArc (28 + i, 207, 10, 10, 180, 90);//mouth
	    c.setColor (Color.black);
	    c.fillOval (10 + i, 290, 20, 10);//feet
	    c.fillOval (30 + i, 290, 20, 10);//feet
	    c.drawLine (60 + i, 270, 70 + i, 260);//x on Trident
	    c.drawLine (60 + i, 260, 70 + i, 270);//x on Trident
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
	drawSoldier ();
    }
} // Soldier class
