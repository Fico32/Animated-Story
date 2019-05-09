import java.awt.*;
import hsa.Console;

public class Background
{
    Console c;
    // array keeping the coordiantes of the flowers
    //Max Li explained the syntax for arrays
    int coords[] [] = {{10, 70, 100, 130, 160, 190, 210, 240, 280, 310, 350, 390, 400, 430, 480, 520, 580, 630}, {320, 350, 420, 430, 320, 350, 424, 350, 430, 370, 345, 446, 354, 365, 394, 425, 435}};


    public Background (Console con)
    {
	c = con;
	run ();
    }


    public void display ()
    {
	c.setColor (new Color (117, 202, 225));
	for (int i = 0 ; i <= 500 ; i++)
	{
	    c.drawLine (0, 500 - i, 640, 500 - i);//sky
	}
	c.setColor (Color.white);
	for (int i = 0 ; i <= 60 ; i++)//cloud
	{
	    c.drawOval (40 - i / 2, 60 - i / 2, i, i);
	    c.drawOval (60 - i / 2, 40 - i / 2, i, i);
	    c.drawOval (90 - i / 2, 60 - i / 2, i, i);
	}
	for (int i = 0 ; i < 30 ; i++)//cloud
	{
	    c.drawLine (10, 65 + i, 120, 65 + i);
	}

	// c.drawOval();
	c.setColor (new Color (0, 155, 0));
	for (int i = 0 ; i < 200 ; i++)
	{
	    c.drawRect (0, 300 + i, 640, 200);//grass
	}
	c.setColor (Color.yellow);
	for (int i = 0 ; i < 80 ; i++)//sun
	{
	    c.drawArc (600 + i, -40 - i, 80 - i, 80 - i, 180, 90);
	    c.drawArc (601 + i, -40 - i, 80 - i, 80 - i, 180, 90);
	    c.drawArc (600 + i, -39 - i, 80 - i, 80 - i, 180, 90);
	}
	for (int i = 0;i<=10;i++)
	{
	    c.drawLine (640,0,500,20+i);//rays of sunlight
	}
	for (int i = 0;i<=10;i++)
	{
	    c.drawLine (640,0,520,60+i);//rays of sunlight
	}
	for (int i = 0;i<=10;i++)
	{
	    c.drawLine (640,0,540,100+i);//rays of sunlight
	}
	for (int i = 0;i<=10;i++)
	{
	    c.drawLine (640,0,560,120+i);//rays of sunlight
	}
	
	c.setColor (new Color (179, 0, 255));
	for (int i = 0 ; i < 18 ; i++)//flowers
	{
	    try
	    {
		for (int j = 0 ; j <= 5 ; j++)
		{
		    c.drawOval (coords [0] [i] - j / 2, coords [1] [i] - j / 2, j, j);
		}
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




} // Background class
