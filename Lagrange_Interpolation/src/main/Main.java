
package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import interpolation.Interpolation;
import readcls.ReadFile;


public class Main {
	public static void main(String[] args) {
		String path="C:\\Users\\WIKUS\\eclipse-workspace\\Lagrange_Interpolation\\src\\points";
		
		Punkt2D[] points=ReadFile.readlines(path);
		
		System.out.println("INTERPOLACJA");
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.println("Podaj wspolrzedna x do interpolacji punktu");
			double x=Double.parseDouble(reader.readLine());

			System.out.println("Value of f("+x+") is : "+Interpolation.InterpolationLagrange(points,x,points.length));
			TimeUnit.SECONDS.sleep(5);
			
		}catch(IOException ioexc) {
			System.out.println(ioexc.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}

