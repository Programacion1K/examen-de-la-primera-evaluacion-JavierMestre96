public class Enmascara {
    public static String enmascara(String cadena) {
        int longitudCadena = cadena.length();
        String cadenaACifrar = cadena.substring(0, longitudCadena - 4);
        int longitudCadenaACifrar = cadenaACifrar.length();
        String salida = "";
        if (longitudCadena == 1) {
            salida += cadena;
            if(longitudCadena==0){
                return cadena;
            }
            if(longitudCadena==1){
                return cadena;
            }
            while (longitudCadena > 4) {
                for (int i = 0; i <= longitudCadenaACifrar; i++) {
                    salida += "#";
                }
            }
            salida += cadena.substring(longitudCadenaACifrar);
        }
        return salida;
    }