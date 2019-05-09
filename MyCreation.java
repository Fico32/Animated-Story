/*
    Filip Milidrag
    Ms.Krasteva
    October 21 2018
    This is class will run all the other ones at the right time.
*/
// The "MyCreation" class.
import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c;

    public MyCreation ()
    {
	c = new Console ();
    }


    public void background ()
    {
	Background b = new Background (c);
    }


    public void xepher ()
    {
	Xepher x = new Xepher (c);
	x.start ();
	try
	{
	    x.join ();
	}
	catch (Exception e)
	{
	}

    }


    public void soldier ()
    {
	Soldier s = new Soldier (c);
	s.run ();
    }


    public void mouseMan ()
    {
	MouseMan mm = new MouseMan (c);
	mm.run ();
    }


    public void kidRodent ()
    {
	KidRodent r = new KidRodent (c);
	r.run ();
    }


    public void drDonald ()
    {
	DrDonald d = new DrDonald (c);
	d.run ();
    }


    public void wingMan ()
    {
	WingMan w1 = new WingMan (c);
	w1.start ();
	try
	{
	   w1.join ();
	}
	catch (Exception e)
	{
	}
	WingMan w2 = new WingMan (c, 80);
	w2.run ();
	WingMan w3 = new WingMan (c, 160, true);
	w3.run ();
    }


    public static void main (String[] args)
    {
	MyCreation m = new MyCreation ();
	m.background ();
	m.mouseMan ();
	m.soldier ();
	m.xepher ();
	m.drDonald ();
	m.wingMan ();
	m.kidRodent ();


    } // main method
} // MyCreation class
