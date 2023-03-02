public interface ITransporte {
    public static final int Pale = 0;
    public static final int CajaCarton = 1;
    public static final int CajaMadera = 2;

    Float costeTotal(Integer CP);
    Integer tipoEmbalaje(Float x,Float y,Float z,Float peso);
}
