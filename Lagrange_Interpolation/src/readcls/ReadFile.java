package readcls;
import java.io.*;
import java.util.Scanner;

import main.Punkt2D;

public class ReadFile {
	public static Punkt2D[] readlines(String path) {
		Punkt2D[] points=new Punkt2D[0];
		try {
			File file=new File(path);
			Scanner sc=new Scanner(file);
			String lines="";
			if(sc.hasNextLine()) {
				lines=sc.nextLine();
				int number_of_points=Integer.parseInt(lines);
				if(number_of_points>=2) {
				points=new Punkt2D[number_of_points];
				for(int i=0;i<number_of_points;i++) {
					lines=sc.nextLine();
					String[] LineArray=lines.split(",");
					points[i]=new Punkt2D(Double.parseDouble(LineArray[0]),Double.parseDouble(LineArray[1]));
					}
				}
				else {
					System.out.println("za malo punktow , miniumum dwa");
				}
			}
			sc.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
		return points;
	}

}
