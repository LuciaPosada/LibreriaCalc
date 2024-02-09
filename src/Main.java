
import com.lucia.librerias.*;
public class Main {
    public static void main(String[] args) {

        Salida.salida_float("Resultado: ",Calculadora.calc(Entrada.entrada_ventana_consola_float("Tecle el primer numero",Entrada.VENTANA),Entrada.entrada_ventana_consola_float("Tecle el primer numero",Entrada.VENTANA),Calculadora.SUMA),Salida.CONSOLA);
    }
}