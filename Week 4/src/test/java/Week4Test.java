import org.junit.Test;

import junit.framework.Assert;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        int res = Week4.max2Int(0, 1);
        Assert.assertEquals(1, res);
    }

    @Test
    public void testMax2Int2(){
        int res = Week4.max2Int(-1, 0);
        Assert.assertEquals(0, res);
    }

    @Test
    public void testMax2Int3(){
        int res = Week4.max2Int(0, 2147483647);
        Assert.assertEquals(2147483647, res);
    }

    @Test
    public void testMax2Int4(){
        int res = Week4.max2Int(-2147483648, 0);
        Assert.assertEquals(0, res);
    }

    @Test
    public void testMax2Int5(){
        int res = Week4.max2Int(32, 64);
        Assert.assertEquals(64, res);
    }

    @Test
    public void testMinArray1(){
        int[] a = new int[3];
        a = {1, 2, 3};
        int res = Week4.minArray(a);
        Assert.assertEquals(1, res);
    }

    @Test
    public void testMinArray2(){
        int[] a = new int[3];
        a = {-2147483648, 0, 64};
        int res = Week4.minArray(a);
        Assert.assertEquals(-2147483648, res);
    }

    @Test
    public void testMinArray3(){
        int[] a = new int[3];
        a = {0, 64, 2147483647};
        int res = Week4.minArray(a);
        Assert.assertEquals(0, res);
    }

    @Test
    public void testMinArray4(){
        int[] a = new int[1024];
        for (int i = 0; i < 1023; i++) a[i] = i;
        int res = Week4.minArray(a);
        Assert.assertEquals(a[0], res);
    }

    @Test
    public void testMinArray5(){
        int[] a = new int[1024];
        for (int i = 0; i < 1023; i++) a[i] = -i;
        int res = Week4.minArray(a);
        Assert.assertEquals(a[1023], res);
    }

    @Test
    public void testCalculateBMI1(){
        String res = new String();
        res = Week4.calculateBMI(40.5, 1.5);        //BMI = 18.0
        Assert.assertEquals("Thiếu cân", res);
    }

    @Test
    public void testCalculateBMI2(){
        String res = new String();
        res = Week4.calculateBMI(51.2, 1.6);        //BMI = 20.0 
        Assert.assertEquals("Bình thường", res);
    }

    @Test
    public void testCalculateBMI3(){
        String res = new String();
        res = Week4.calculateBMI(73.5, 1.75);        //BMI = 24.0 
        Assert.assertEquals("Thừa cân", res);
    }

    @Test
    public void testCalculateBMI4(){
        String res = new String();
        res = Week4.calculateBMI(64.0, 1.6);        //BMI = 25.0 
        Assert.assertEquals("Béo phì", res);
    }

    @Test
    public void testCalculateBMI5(){
        String res = new String();
        res = Week4.calculateBMI(70.4, 1.6);        //BMI = 27.5
        Assert.assertEquals("Béo phì", res);
    }
}