import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

class Circulo_JCCTest {

    private double radio;
    //Constante pi
    static final double PI = 3.1416;

    public Circulo_JCCTest(double r, String tipoFigura) {
        super();
        radio = r;

        if (r<0){
            Math.abs(r);
        }
    }

    @Test
    public void probarArea() {

    }

    @Test
    public void probarPerimetro() {

    }

}
