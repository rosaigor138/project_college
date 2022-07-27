package model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfessorSubstitutoTest {
    @Test
    void testingPs(){
        ProfessorSubstituto pst1 = new ProfessorSubstituto("maria",
                "329999999",
                "maria@ifsudeste.com",
                "ti",
                20,45.50,true);


        Assertions.assertEquals(pst1.toString(),"Profa Sub maria Telefone: 329999999\n" +
                "(maria@ifsudeste.com)\n" +
                "departamento: 329999999 - 20 aulas mensais.");
    }
}
