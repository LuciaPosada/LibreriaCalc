
public class Calculadora {
    /**
     * Opcion de suma
     */
    public final static Integer SUMA = 1;
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
    public static float calc(float n1,float n2,int opt){

        if (opt == SUMA){

            return n1+n2;

        }else if (opt == RESTA){

            return n1-n2;

        }else if (opt == MULTIPLICACION){

            return n1*n2;

        }else if (opt == DIVISION){

            return n1/n2;

        }
        return 0;

    }

}
