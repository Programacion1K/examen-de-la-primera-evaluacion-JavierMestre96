public class BoletoPrimitiva {
    public static void main(String[] args) {
        String salida = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 4; j++) {
                if (j == 0) {
                    salida += "  " + i + "  ";
                } else {
                    salida += j + "" + i + "  ";
                }
            }
            salida += "\n";
        }
        System.out.println(salida);
    }

}