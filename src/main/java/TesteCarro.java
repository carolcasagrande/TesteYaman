import org.junit.jupiter.api.Test;

public class TesteCarro {

    @Test
    public void testeCor(){
        Carro carro = new Carro ("Vermelho","Gol",220.50);
        Assertions.assertEquals("Vermelho", carro.getCor());
    }

    @Test
    public void testeModelo(){
        Carro carro = new Carro ("Vermelho","Gol",220.50);
        Assertions.assertEquals("Gol", carro.getModelo());
    }

    @Test
    public void testeVelocidadeMaxima(){
        Carro carro = new Carro ("Vermelho","Gol",220.50);
        Assertions.assertEquals("220.50", carro.getVelocidadeMaxima());
    }

}
