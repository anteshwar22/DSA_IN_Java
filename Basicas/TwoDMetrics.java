import java.util.*;
public class TwoDMetrics {
     int arr[][]={{1,2,3,4},{1,2,3,4},{1,2,3}};
    public void  Take(){
     
        Scanner sc=new Scanner(System.in);
        

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                (arr[i][j])=sc.nextInt();
            }
        }

    }
    public void display()
    {   
         System.out.println("Output :- ");
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
           TwoDMetrics tdm=new TwoDMetrics();
        //    tdm.Take();
           tdm.display();
    }
}