package labs;

/**
 * Class representing a terrifying lion
 *
 * @author Clayton Mays
 */
public class Lion {
    /**
     * Emits a powerful roar
     */
    public void roar() {
        System.out.println("The lion gave a ferocious ROAR!!!");
    }
}

/**
 * Let's see these babies PURR
 *
 * @author Clayton Mays
 */
class LionTestDrive {
    /**
     * We Are All Connected In The Great Circle Of Life.
     */
    public static void main(String[] args) {
        Lion mufasa = new Lion();
        Lion aslan = new Lion();

        aslan.roar();
        mufasa.roar();
    }
}