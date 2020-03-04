package main;

public class Punkt2D {
	private double x;
	private double y;
	
	public Punkt2D() {
		this.x=0.0;
		this.y=0.0;
	}
	public Punkt2D(double x,double y) {
		this.x=x;
		this.y=y;
		System.out.println("Stworzony punkt:"+this.x+"\t"+this.y);
	}
	
	public static void getPunkt2D(Punkt2D p) {
		System.out.println(p.x+" oraz "+p.y);

	}
}
