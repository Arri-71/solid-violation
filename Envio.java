public class Envio {  //Se crea la clase Envio

    String tipo;
    int precio;

    Envio(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    String getTipoEnvio() {
        return this.tipo;
    }

    int getPrecio() {
        return this.precio;
    }
}

