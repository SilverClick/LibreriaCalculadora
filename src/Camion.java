public class Camion {

    public Float costeTotal(Integer CP){
         Float coste;
        if (CP>53000){
            coste= 10000f;
        }
        else{
            coste= 1000f;
        }
        return coste;
    }




    public Integer tipoEmbalaje(Float x,Float y,Float z,Float peso) {
        Integer opcion;
        if (x>50&&y>50&&z>50&&peso>50){
            opcion= 2;

        }
    }
}
