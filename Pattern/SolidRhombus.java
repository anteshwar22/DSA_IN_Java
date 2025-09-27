public class SolidRhombus {
    void printRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
         SolidRhombus sr=new SolidRhombus();
         sr.printRhombus(10);
    }
}
