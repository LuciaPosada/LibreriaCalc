import javax.swing.*;

public class Calculadora {
    /**
     * Opcion de suma
     */
    public static final int SUMA = 1;
    /**
     * Opcion de resta
     */
    public final static int RESTA = 2;
    /**
     * Opcion de multiplicacion
     */
    public final static int MULTIPLICACION = 3;
    /**
     * Opcion de division
     */
    public final static int DIVISION = 4;

    /**
     * Metodo que permite la eleccion de operacion (suma,resta,multiplicacion,division) entre dos float
     * @param n1 numero float
     * @param n2 numero float
     * @param opt opcion de operacion
     * @return resultado de la operacion
     */
    public static Float calc(float n1,float n2,int opt){

        Float resultado = 0.0f;

        switch(opt){

            //Suma
            case SUMA:

                resultado = n1+n2;
                break;

            //Resta
            case RESTA:

                resultado = n1-n2;
                break;

            //Multiplicacion
            case MULTIPLICACION:

                resultado = n1*n2;
                break;

            //Division
            case DIVISION:

                try {
                    resultado = n1 / n2;
                }catch (ArithmeticException e){
                    JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
                }finally{
                    break;
                }

            default:

                resultado = null;

        }

        return resultado;

    }

}
