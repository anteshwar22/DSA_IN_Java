public class CharPyramind 
{   CharPyramind()
    {
         char ch='A';
         for(int line=1;line<=4;line++)
         {
            for(int star=1;star<=line;star++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
         }
    }
    public static void main(String args[])
    {
         CharPyramind cp=new CharPyramind();
    }
}
