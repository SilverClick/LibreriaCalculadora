# PASOS A SEGUIR:

-Primer paso: Creamos constantes con cada operación inicializadas
y resultado lo inicializamos en null por si hay un error tener un null.

```
 private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;
```
-Segundo paso: Creamos un método con un switch para cada operación usando try catch
para tratar la excepción si hubiese algún error y retornando resultado.
```
public static Float realizar(int device, float num1, float num2){

        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1*num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case DIVISION:
                try{
                    resultado = num1/num2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
        }
        return resultado;
    }

```

-Tercer paso: Creamos el JavaDoc para que se entienda mejor el programa.
```
/**
     * @param device --> operación a realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN, RAIZ)
     * @param num1 --> primer numero de la operación
     * @param num2 --> segundo numero de la operación (divisor en caso de division)
     * @return resultado o null en caso de fallo.
     */
```
-Cuarto paso: Vamos a file-project structure-artifacts y ahi creamos el jar del proyecto. 


-Quinto paso: Por último solo faltaría volver a file-project structure y en libraries 
añadir ese jar, con lo que ya tendríamos hecha nuestra librería.