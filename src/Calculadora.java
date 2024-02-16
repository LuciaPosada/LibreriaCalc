import javax.swing.*;

public class Calculadora {
    /**
     * Opcion de suma
     */
    public static final Integer SUMA = 1;
    /**
     * Opcion de resta
     */
    public final static Integer RESTA = 2;
    /**
     * Opcion de multiplicacion
     */
    public final static Integer MULTIPLICACION = 3;
    /**
     * Opcion de division
     */
    public final static Integer DIVISION = 4;

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
            case 1:

                resultado = n1+n2;
                break;

            //Resta
            case 2:

                resultado = n1-n2;
                break;

            //Multiplicacion
            case 3:

                resultado = n1*n2;
                break;

            //Division
            case 4:

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
