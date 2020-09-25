public class FirstArray {
    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        float sum=0,avg;
        for(int j=0;j<a.length;j++)
        {
            sum=sum+a[j];
        }
        System.out.print("Average:"+sum/a.length);
    }
}
