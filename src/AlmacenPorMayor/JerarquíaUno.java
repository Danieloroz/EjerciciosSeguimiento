package AlmacenPorMayor;

public class JerarquíaUno {
    public class Producto {}

    public class Alimento extends Producto {}

    public class Perecedero extends Alimento {}

    public class NoPerecedero extends Alimento {}

    public class Limpieza extends Producto {}
}
