


public class at04 {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(2.0);
        Circulo c2 = new Circulo(5.0);
        Circulo c3 = new Circulo(7.5);
        Circulo c4 = new Circulo(10.0);

        // Exibindo os resultados
        System.out.println("Área do Círculo 1 (raio 2.0): " + c1.calcularArea());
        System.out.println("Área do Círculo 2 (raio 5.0): " + c2.calcularArea());
        System.out.println("Área do Círculo 3 (raio 7.5): " + c3.calcularArea());
        System.out.println("Área do Círculo 4 (raio 10.0): " + c4.calcularArea());
    }
}
