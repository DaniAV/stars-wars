
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String PrimerApellido;
    private String Nombre;
    private String ApellidoMadre;
    private String CiudadNacimiento;
    private static final int POS_INI = 0;
    private static final int POS_FIN = 3;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        String PrimerApellido= ""; 
        String Nombre= "";
        String ApellidoMadre= "";
        String CiudadNacimiento= "";

    }

    /**
     * Metotodo que genera un nombre para una pelicula, a lo George Lucas.
     */
    public void generateStarsWarsName(String PrimerApellido, String Nombre, String ApellidoMadre, String CiudadNacimiento)
    {
        String sCadena = PrimerApellido;
        String sSubCadena = sCadena.substring(POS_INI,POS_FIN);
        String sCadena2 = Nombre;
        String bSubCadena = sCadena2.substring(POS_INI,POS_FIN);
        String sCadena3 = ApellidoMadre;
        String cSubCadena = sCadena3.substring(POS_INI,POS_FIN);
        String sCadena4 = CiudadNacimiento;
        String dSubCadena = sCadena4.substring(POS_INI,POS_FIN);
        System.out.println(sSubCadena + bSubCadena + " " + cSubCadena + dSubCadena );
    }
}
