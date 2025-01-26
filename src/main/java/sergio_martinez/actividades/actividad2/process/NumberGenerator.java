package sergio_martinez.actividades.actividad2.process;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {   /**
 * genera numeros pares del 1 al 100
 */
public static List<Integer> generateNumbers() {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 2; i <= 100; i++) {
        if (i % 2 == 0) {
            numbers.add(i);

        }
    }
    return numbers;
}

}
