package interpolation;

import main.Punkt2D;

public class Interpolation {
	
	public static double InterpolationLagrange(Punkt2D Points[],double point_to_calculate,int number_of_points) {
		double result=0;

		for(int i=0;i<number_of_points;i++) {
			
			Punkt2D.getPunkt2D(Points[i]);
			double tmp=Points[i].y;
			
			for(int j=0;j<number_of_points;j++) {
				if(j==i) {
					tmp*=1;

				}else {
					tmp*=(point_to_calculate-Points[j].x)/(Points[i].x-Points[j].x);
				}
			}
			System.out.println(result);
			result+=tmp;
		}
		return result;
	}

}
