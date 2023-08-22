import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private List<Toy>toys;
    public ToyShop() {
        toys = new ArrayList<>();
    }
    public void addToy(Toy toy){
        toys.add(toy);
    }
    public void updateToyFrequency( int id, int frequency){
        for (Toy toy : toys  ) {
            if (toy.getId()== id){
                toy.setFrequency(frequency);
                return;
            }
        }
        System.out.println("Игрушка не найдена! ");
    }

    public void play() {
        List<Toy> prizeToys = new ArrayList<>();
        Random random = new Random();

        while (!toys.isEmpty()) {
            int totalFrequency = toys.stream().mapToInt(Toy::getFrequency).sum();
            int randomNum = random.nextInt(totalFrequency) + 1;

            int accumulatedFrequency = 0;
            for (Toy toy : toys) {
                accumulatedFrequency += toy.getFrequency();
                if (randomNum <= accumulatedFrequency) {
                    prizeToys.add(toy);
                    toy.decreaseQuantity();
                    if (toy.getQuantity() == 0) {
                        toys.remove(toy);
                    }
                    break;
                }
            }
        }

        savePrizeToys(prizeToys);
    }

    private void savePrizeToys(List<Toy> prizeToys) {
        try (FileWriter writer = new FileWriter("prize_toys.txt")) {
            for (Toy toy : prizeToys) {
                writer.write(toy.getName() + "\n");
            }
            System.out.println("Призовые игрушки сохранены в файл! ");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при сохранении призовых игрушек в файл. ");
        }
    }
}