import java.awt.*;
import hsa.Console;
import java.lang.*;

/*
    Filip Milidrag
    Ms.Krasteva
    Oct 10 2018
    This program animates Xepher coming on to screen and crushing MouseMan and Soldier
*/

public class Xepher extends Thread
{
    Console c;
    public Xepher (Console con)
    {
	c = con;
    }


    public void drawXepher1 ()
    {
	for (int j = 90 ; j <= 400 ; j++)
	{
	    //Erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (19 + j, -191 + j, 90, 90);
	    //Draw
	    c.setColor (new Color (255, 102, 255));
	    c.fillOval (80 + j, -190 + j, 30, 30);//head
	    c.setColor (new Color (0, 62, 28));
	    c.fillRect (20 + j, -160 + j, 90, 30);//body
	    c.setColor (new Color (0, 62, 208));
	    c.fillOval (20 + j, -130 + j, 30, 30);//feet
	    c.fillOval (80 + j, -130 + j, 30, 30);//feet
	    c.setColor (Color.black);
	    c.fillOval (100 + j, -182 + j, 5, 5);//eye
	    c.drawArc (95 + j, -173 + j, 28, 10, 90, 90);//mouth
	    c.setColor (Color.red);
	    for (int i = 0 ; i <= 30 ; i++)
	    {
		c.drawLine (45 + i + j, -132 + j, 65 + j, -110 + j);//wing
	    }
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (InterruptedException e)
	    {
	    }
	}
    }


    public void drawXepher2 ()
    {
	for (int j = 0 ; j <= 80 ; j++)
	{
	    //Erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (419 + j, 211 - j, 90, 90);
	    //Draw
	    c.setColor (new Color (255, 102, 255));
	    c.fillOval (480 + j, 210 - j, 30, 30);
	    c.setColor (new Color (0, 62, 28));
	    c.fillRect (420 + j, 240 - j, 90, 30);
	    c.setColor (new Color (0, 62, 208));
	    c.fillOval (420 + j, 270 - j, 30, 30);
	    c.fillOval (480 + j, 270 - j, 30, 30);
	    c.setColor (Color.black);
	    c.fillOval (500 + j, 218 - j, 5, 5);
	    c.drawArc (495 + j, 227 - j, 28, 10, 90, 90);
	    c.setColor (Color.red);
	    for (int i = 0 ; i <= 30 ; i++)
	    {
		c.drawLine (445 + i + j, 268 - j, 465 + j, 290 - j);
	    }
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (InterruptedException e)
	    {
	    }
	}

    }


    public void drawXepher3 ()
    {
	for (int j = 0 ; j <= 80 ; j++)
	{
	    //Erase
	    c.setColor (new Color (117, 202, 225));
	    c.fillRect (500, 129 + j, 90, 90);
	    //Draw
	    c.setColor (new Color (255, 102, 255));
	    c.fillOval (560, 130 + j, 30, 30);
	    c.setColor (new Color (0, 62, 28));
	    c.fillRect (500, 160 + j, 90, 30);
	    c.setColor (new Color (0, 62, 208));
	    c.fillOval (500, 190 + j, 30, 30);
	    c.fillOval (560, 190 + j, 30, 30);
	    c.setColor (Color.black);
	    c.fillOval (580, 138 + j, 5, 5);
	    c.drawArc (575, 147 + j, 28, 10, 90, 90);
	    c.setColor (Color.red);
	    for (int i = 0 ; i <= 30 ; i++)
	    {
		c.drawLine (525 + i, 188 + j, 545, 210 + j);
	    }
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (InterruptedException e)
	    {
	    }
	}

    }


    public void run ()
    {
	drawXepher1 ();
	drawXepher2 ();
	drawXepher3 ();
    }
}


