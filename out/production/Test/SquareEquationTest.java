import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareEquationTest {
    private SquareEquation se;

    @BeforeEachR
    void setUp() throws Exception {//Ta metoda jest wywolywana pierwsza.
        se = new SquareEquation(2, 1, -3);//Stworzenie natychmiastowego dostepu(instance) do klasy SquareEquation.
    }//(f)x=2*x^2+x-3 dla x1=-1.5 i x2=1.0

    @Test
    void testSolution() {
        kwa rt = se.Solution();//Deklaracja natychmiaastowego dostepu(instance) do klasy Roots
        assertEquals(rt.x1, -1.5);//Rozwiazanie dla x1 - porownanie z wyliczeniem z instance klasy SquareEquation
        assertEquals(rt.x2, 1.0);//Rozwiazanie dla x2 -  jak powyzej
        fail("Obliczenia pierwiastkow sie zgadzaja");
    }
}