public class ClasePrincipal {
    public static void main(String args[]){
        System.out.println("Se esta inicializando el WebDriver por favor espere...");
        Google prueba = new Google();
        prueba.abrirNavegador();
        prueba.buscar();
        prueba.buscarWikipedia();
        prueba.extcepcion();
        prueba.close();
    }
}
