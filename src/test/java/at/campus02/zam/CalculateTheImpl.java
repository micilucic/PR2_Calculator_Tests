package at.campus02.zam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateTheImpl {
    private Calculator calc;

    // is executed before each test: use it to initialize data
    @BeforeEach
    void setup(){
        // SETUP PHASE
        calc = new CalculatorImpl();
    }

    // die Methoden mit Tests immer sinnvoll benennen - das ist Konvention !
    @Test // Notation um zu sagen dass es um einen Test handelt
    void should_add_two_numbers() {

            // EXCERCISE PHASE - hier probiere ich das aus was ich erzielen möchte
        double sol = calc.add(42,68);

            // VERIFICATION
        Assertions.assertEquals(110, sol, 0.001); // delta bedeutet die Abschwänkung vom Ergebnis um es als true ansehen zu können, weil double nicht immer richtig

    }
    // AFTEREACH - Tear down Methode zum Schließen von Ressourcen, Netzwerken, Datenbanken... wird hier nicht gebraucht

    @Test
    void should_multiply_two_numbers(){
        Assertions.assertEquals(42, calc.multiply(6,7));
    }
}
