public class Tester
{
    public static void main(String[] args) {
    // Create an instance of sampleCode
    SampleCode code = new SampleCode();

    // Test sumOfSquares method
    int a = 3;
    int b = 4;
    int result1 = code.sumOfSquares(a, b);
    System.out.println("Sum of squares of " + a + " and " + b + " is: " + result1);

    // Test cumalitiveSum method
    int[] array = {1, 2, 3, 4, 5};
    int result2 = code.cumalitiveSum(array);
    System.out.print("Cumulative sum of the array [");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1)
            System.out.print(", ");
    }
    System.out.println("] is: " + result2);
}
}