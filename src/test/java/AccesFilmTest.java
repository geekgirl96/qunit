import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccesFilmTest {

    private int age;
    private int limitAge;

    AccesFilm accesFilm = new AccesFilm();

    @Test
    public void givenBadAge_thenReturnFalse(){
        limitAge = 18;
        age = 15 ;
    assertFalse(accesFilm.getAcces(age,limitAge));
    }

    @Test
    public void givenValidAge_thenReturnTrue(){
    limitAge = 18;
    age = 19;
    assertTrue(accesFilm.getAcces(age, limitAge));
    }
}
