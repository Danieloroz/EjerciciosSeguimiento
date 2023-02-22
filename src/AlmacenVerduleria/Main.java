package AlmacenVerduleria;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        productos[0] = new Fruta(120.00, "Amarillo", "Banano", 500);
        productos[1] = new Fruta(250.00, "Naranja", "Papaya", 1000);
        productos[2] = new Limpieza("Cloro", 1.5, "Blancox", 12000);
        productos[3] = new Limpieza("Jabón de Loza Líquido", 1.5, "Lysol", 8000);
        productos[4] = new Lacteo(1000, 32, "Leche Colanta", 2500);
        productos[5] = new Lacteo(200, 37, "Mantequilla", 4000);
        productos[6] = new NoPerecible(500, 42, "Miel", 2500);
        productos[7] = new NoPerecible(170, 95, "Atún", 5000);

        for (Producto prod : productos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }
    }
}
