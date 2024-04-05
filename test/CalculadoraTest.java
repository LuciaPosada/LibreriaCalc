import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    //SUMA

    @Test
    public void comprobacionSumaDeDosPositivos(){
        Assertions.assertEquals(5,Calculadora.calc(3,2,Calculadora.SUMA));
    }

    @Test
    public void comprobacionSumaDePositivoYNegativo(){
        Assertions.assertEquals(-1,Calculadora.calc(-3,2,Calculadora.SUMA));
    }

    @Test
    public void comprobacionSumaDeDosNegativos(){
        Assertions.assertEquals(-5,Calculadora.calc(-3,-2,Calculadora.SUMA));
    }

    //RESTA

    @Test
    public void comprobacionRestaDosPositivos(){
        Assertions.assertEquals(1,Calculadora.calc(3,2,Calculadora.RESTA));
    }

    @Test
    public void comprobacionRestaDePositivoYNegativo(){
        Assertions.assertEquals(5,Calculadora.calc(3,-2,Calculadora.RESTA));
    }

    @Test
    public void comprobacionRestaDosNegativos(){
        Assertions.assertEquals(-1,Calculadora.calc(-3,-2,Calculadora.RESTA));
    }

    //MULTIPLICACION

    @Test
    public void comprobacionMultiplicacionDosPositivos(){
        Assertions.assertEquals(6,Calculadora.calc(3,2,Calculadora.MULTIPLICACION));
    }

    @Test
    public void comprobacionMultiplicacionDePositivoYNegativo(){
        Assertions.assertEquals(-6,Calculadora.calc(3,-2,Calculadora.MULTIPLICACION));
    }

    @Test
    public void comprobacionMultiplicacionDosPositivo(){
        Assertions.assertEquals(15,Calculadora.calc(-5,-3,Calculadora.MULTIPLICACION));
    }

    //DIVISION

    @Test
    public void comprobacionDivisionDosPositivos(){
        Assertions.assertEquals(2,Calculadora.calc(6,3,Calculadora.DIVISION));
    }

    @Test
    public void comprobacionDivisionDePositivoYNegativo(){
        Assertions.assertEquals(-3,Calculadora.calc(6,-2,Calculadora.DIVISION));
    }

    @Test
    public void comprobacionDivisionDosPositivo(){
        Assertions.assertEquals(3,Calculadora.calc(-6,-2,Calculadora.DIVISION));
    }

    //RAIZ

    @Test
    public void comprobacionRaiz(){
        Assertions.assertEquals(3,Calculadora.calc(9,2,Calculadora.RAIZ));
    }
}
