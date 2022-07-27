package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AlunoTest {
    Aluno at1;
    @BeforeEach
    public void init(){
         at1 = new Aluno("Igor Rosa",
             "3298800000",
            "igorrosa@igorrosa.com",false);

    }
    @Test
    public void test(){
        Assertions.assertEquals(at1.getDesc(),"Prezado Aluno Igor Rosa Telefone: 3298800000\n" +
                "(igorrosa@igorrosa.com)");
    }
}
