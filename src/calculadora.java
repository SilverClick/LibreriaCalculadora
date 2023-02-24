public class calculadora {


    private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;
    static final int RAIZ = 5;

    /**
     * @param device --> operación a realizar (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN, RAIZ)
     * @param num1 --> primer numero de la operación
     * @param num2 --> segundo numero de la operación (divisor en caso de division)
     * @return resultado
     */
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
            case RAIZ:
                try{
                    resultado = Math.pow(num1, 1.0 / num2); //num1 es el radicando y num2 el indice
                }catch (Exception e){
                    System.out.println("Error");
                }
        }
        return resultado;
    }

}




