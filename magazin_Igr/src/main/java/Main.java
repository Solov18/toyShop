public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        // Добавление новых игрушек
        toyShop.addToy(new Toy(1, "Teddy Bear", 5, 20));
        toyShop.addToy(new Toy(2, "Doll", 3, 10));
        toyShop.addToy(new Toy(3, "Play Kitchen", 2, 15));
        toyShop.addToy(new Toy(4, "Car", 8, 30));
        toyShop.addToy(new Toy(5, "Building Blocks", 6, 25));

        // Изменение веса (частоты выпадения игрушки)
        toyShop.updateToyFrequency(3, 5);

        // Розыгрыш игрушек
        toyShop.play();
    }
}
