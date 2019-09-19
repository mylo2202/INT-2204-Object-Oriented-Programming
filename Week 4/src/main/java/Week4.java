public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) return a;
        if (a < b) return b;
        if (a == b) return a;
        return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height);
        if (BMI < 18.5) return "Thieu can";
        if (BMI >= 18.5 && BMI <= 22.9) return "Binh thuong";
        if (BMI >= 23 && BMI <= 24.9) return "Thua can";
        if (BMI >= 25) return "Beo phi";
    }
}