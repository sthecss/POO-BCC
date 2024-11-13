public class Main {
    public static void main(String args[]){
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo("Círculo-A", 2);
        formas[3] = new Quadrado("Quadrado-A", 4.5);
        formas[4] = new Triangulo("Triangulo-A", 6, 8, 10);
        formas[2] = new Esfera("Esfera-A", 12);
        formas[1] = new Cubo("Cubo-A", 3);
        formas[5] = new Tetraedro("Tetraedro-A", 2);

        System.out.println();
        for(Forma forma : formas){
            if (forma instanceof Bidimensional){
                System.out.println("Área forma bidimensional: " + forma.getArea());
            }
            if (forma instanceof Tridimensional){
                System.out.println("Volume forma tridimensional: " + ((Tridimensional) forma).getVolume());
            }
            System.out.println("\n");
        }

        System.out.println();
        for(Forma forma : formas){
            forma.mostrarInfos();
            System.out.println("\n");
        }
    }
}
