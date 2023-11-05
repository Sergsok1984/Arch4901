import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {

        Random rnd = ThreadLocalRandom.current();

        List<ItemGenerator> generators = initFabrics();

        for (int i = 0; i < 30; i++) {
            generators.get(rnd.nextInt(generators.size())).openReward();
        }
    }

    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();

        fabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            fabrics.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            fabrics.add(new SilverGenerator());
            fabrics.add(new SapphireGenerator());
            fabrics.add(new PlatinumGenerator());
            fabrics.add(new EmeraldGenerator());
            fabrics.add(new BronzeGenerator());
        }
        return fabrics;
    }
}
