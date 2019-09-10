package Prog5_3;

public class Test {
	public static void main(String[] args) {
		Figure[] fig= {new UpwardHat(),new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};
		for (Figure figure : fig) {
			figure.getFigure();
		}
		System.out.println();
		for (Figure figure : fig) {
			System.out.print(figure.getClass().getSimpleName() +":");
			figure.getFigure();
			System.out.println();
		}
	}
}
