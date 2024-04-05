## Explicacion de programa

Este programa consta de una clase Calculadora:

 - Tiene cuatro constantes correspondientes a operaciones (suma/resta/multiplicacion/division)
 - Un metodo calc() que recibe dos numeros y una opcion, segun la cual ejecuta una de las ya mencionadas operaciones

Tambien tiene una clase main para comprobar el funcionamiento del programa:

 - Utiliza la libreria INOUT

## Examen

- Creamos la rama raiz (y nos situamos en esta)
- Añadimos constante para la opcion RAIZ
> public final static int RAIZ = 5;
- Añdadimos al switch del metodo calc() el case para calcular la raiz
> case RAIZ: // ... 

* Nota: Caclcular solo raiz cuadrada y cubica:
  
    > public static Float calc(float n1,float n2,int opt){
    > 
    > public final static int CUADRADA = 2;
    > 
    > public final static int CUBICA = 3;
    > 
    > //...
    > 
    > case RAIZ:
    > 
    >  switch(n2){
    > 
    >  case CUADRADA:
    > 
    >  resultado = Math.sqrt(n1);
    > 
    >  break;
    > 
    >  case CUBICA:
    > 
    >  resultado = Math.cbrt(n1);
    >
    >  break;
  > 
  >   default:
  > 
  > resultado = null;
  > 
  > break;
    > 
    >  }

- Realizamos un merge squash (situandonos primero en la rama main)
- Realizamos un jar:
  - File -> Project Structure -> Artifact -> JAR -> From modules with dependencies... -> Main CLass (ninguna/dejar vacio)
- Creamos un tag apartir del commit del merge
- Realizamos una release con el .jar