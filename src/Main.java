
import com.lucia.librerias.*;
public class Main {
    public static void main(String[] args) {

        Float retorno = Calculadora.calc(Entrada.entrada_ventana_consola_float("Tecle el primer numero",Entrada.VENTANA),Entrada.entrada_ventana_consola_float("Tecle el primer numero",Entrada.VENTANA),Calculadora.SUMA);

        if(retorno == null){
            Salida.salida_ventana_consola("Algo fallo",Salida.CONSOLA);
        }else{
            Salida.salida_float("Resultado: ",retorno,Salida.CONSOLA);
        }
    }
}