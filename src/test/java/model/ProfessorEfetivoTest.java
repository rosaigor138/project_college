package model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProfessorEfetivoTest {
    @Test
    void testingPF(){
        ProfessorEfetivo pe1 = new ProfessorEfetivo("Hilton martins",
                "329999999",
                "hiltonmartins@ifsudeste.com",
                "01/01/2001",
                new Regime(true),
                "Departamento de TI",false);
        Assertions.assertEquals(pe1.toString(),"Prof Efetivo Hilton martins - Telefone: 329999999\n" +
                "(hiltonmartins@ifsudeste.com)\n" +
                "Departamento de Departamento de TI\n" +
                "Salario:R$1800.0\n" +
                "Contratado em 01/01/2001");
    }
}
