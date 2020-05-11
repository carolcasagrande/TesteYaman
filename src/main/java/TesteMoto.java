import org.junit.jupiter.api.Test;

public class TesteMoto{

    @Test
    public void testeCor(){
        Moto moto = new Moto("Vermelho","Pop","Honda",2010);
        Assertions.assertEquals("Vermelho", moto.getCor());
    }

    @Test
    public void testeModelo(){
        Moto moto = new Moto("Vermelho","Pop","Honda",2010);
        Assertions.assertEquals("Pop", moto.getModelo());
    }

    @Test
    public void testeMarca(){
        Moto moto = new Moto("Vermelho","Pop","Honda",2010);
        Assertions.assertEquals("Honda", moto.getMarca());
    }

    @Test
    public void testeAno(){
        Moto moto = new Moto("Vermelho","Pop","Honda",2010);
        Assertions.assertEquals(2010, moto.getAno());
    }
}
