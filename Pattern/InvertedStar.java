public class InvertedStar {
      InvertedStar()
      {
        for(int line=4;line>=1;line--)
        {
            for(int star=1;star<=line;star++)
            {
             System.out.print("*");
            }
            System.out.println();
        }
      }    
      public static void main(String args[])
    {
           InvertedStar IS=new InvertedStar();
    }
}
