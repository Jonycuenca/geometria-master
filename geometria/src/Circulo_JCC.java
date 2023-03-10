
public class Circulo_JCC extends FiguraGeometrica_JCC {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JCC(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
                
                if (r<0){
                    Math.abs(r);
                }
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
