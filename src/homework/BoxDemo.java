package homework;

public class BoxDemo {
	
	double val;


	public static void main(String[] args) {
		Box obj= new Box();
		Box obj1=new Box(10.5);
		Box obj2=new Box(10,13,11);

		double val1=obj.volume();
		double val2=obj1.volume();
		double val3=obj2.volume();




		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);

	}}



class Box {


	double length,width,height,val;


	Box()
	{

		length=0;
		width=0;
		height=0;

	}

	Box(double v)
	{

		length=v;
		width=v;
		height=v;

	}

	Box(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;

	}

	double volume()

	{   
		double val=length*width*height;
		return val;
	}









}
