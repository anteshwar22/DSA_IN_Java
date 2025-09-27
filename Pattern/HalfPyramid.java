public class HalfPyramid 
{   
    HalfPyramid()
    {
       for(int line=1;line<=6;line++)
       {
        for(int star=1;star<=line;star++)
        {
            System.out.print(star);
        }
        System.out.println();
       }
    }
    public static void main(String args[])
    {
     HalfPyramid hp=new HalfPyramid();
    }
}
