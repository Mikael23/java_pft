import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Points;

/**
 * Created by Михаил on 18.02.2017.
 */
public class DistanceTest {


    @Test

    public void testDistance(){

        Points w = new Points();
        w.getdistance(3,5,7,2);
        Assert.assertEquals(w.getdistance(3,5,7,2),5.0);
    }
}
