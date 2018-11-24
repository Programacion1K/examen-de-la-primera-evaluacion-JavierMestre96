public class PaisEuropeo {
    private final String nombre;
    private int poblacion;
    private final String dominio;
    private int saldo;
    public static int fondoComun = 0;

    public PaisEuropeo(String nombre, int poblacion) {
        this(nombre, poblacion, (nombre.substring(0, 2)).toLowerCase());
    }

    public PaisEuropeo(String nombre, int poblacion, String dominio) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.dominio = dominio;
        this.saldo = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getDominio() {
        return this.dominio;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static int getFondoComun() {
        return PaisEuropeo.fondoComun;
    }

    public void aportar(int saldoAnyadido) {
        this.saldo += saldoAnyadido;
        PaisEuropeo.fondoComun += saldoAnyadido;
    }

    public void retirar(int saldoRetirado) {
        this.saldo -= saldoRetirado;
        PaisEuropeo.fondoComun -= saldoRetirado;
    }

    public String getCategoria() {
        String salida = "";
        if (this.saldo > 100000) {
            salida += "Categoria A";
        } else if (this.saldo > 0) {
            salida += "Categoria B";
        } else {
            salida += "Categoria C";
        }
        return salida;
    }
}