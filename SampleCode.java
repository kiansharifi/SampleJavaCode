public class SampleCode
{
    public int sumOfSquares (int a, int b)
    {
        return (a*a + b*b);
    }

    public int cumalitiveSum (int [] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum+= array [i];
        }
        return sum;
    }
}