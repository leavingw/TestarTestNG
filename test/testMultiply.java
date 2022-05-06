import org.testng.Assert;
import org.testng.annotations.Test;

public class testMultiply {

    @Test
    public void testarMultiplikation(){
        System.out.println("Testing the multiplication method of the calculator");
        Assert.assertEquals(4.0, calculator.multiply(2,2));
        //Added extra for experimentation
        Assert.assertEquals(-4.0, calculator.multiply(-2,2));
        Assert.assertEquals(4.0, calculator.multiply(-2,-2));
        Assert.assertEquals(0.0, calculator.multiply(4,0));
        Assert.assertEquals(2.25, calculator.multiply(1.5,1.5));
    }


    @Test
    public void testarSubtraktion() {
        System.out.println("Testing the multiplication method of the calculator");
        Assert.assertEquals(4.0, calculator.subtract(6,2));
    }


}
