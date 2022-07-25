public class Principal {                     //Crear Clase Global para Envio (Solución Open-Close)
    abstract class Envio {
        abstract int precio();
        abstract String tiempoDeEnvio();
    }

    class Municipal extends Envio {           //Crear Subclase para Envio Municipal
        @Override
        int precio() {
            return 5000;
        }
        String tiempoDeEnvio() {
            return "Tiempo esperado de 12 horas";
        }
    }

    class Intermunicipal extends Envio {      //Crear Subclase para Envio Intermunicipal
        @Override
        int precio() {
            return 15000;
        }
        String tiempoDeEnvio() {
            return "Tiempo esperado de 36 horas";
        }
    }

    class Internacional extends Envio {       //Crear Subclase para Envio Internacional
        @Override
        int precio() {
            return 25000;
        }
        String tiempoDeEnvio() {
            return "Tiempo esperado de 90 horas";
        }
    }

    public void main(String[] args) {             //Crear el arreglo de subtipos de Envio
        Envio[] arregloEnvio = {
                new Municipal(),
                new Intermunicipal(),
                new Internacional()
        };
        imprimirTiempoDeEnvio(arregloEnvio);
    }

    public void imprimirTiempoDeEnvio(Envio[] arregloEnvio){            //Se imprimen los ítems del arreglo con su Tipo, Precio, y Tiempo de Envio
        for (Envio Envio : arregloEnvio) {
            System.out.println(Envio.tiempoDeEnvio());
        }
    }
}
