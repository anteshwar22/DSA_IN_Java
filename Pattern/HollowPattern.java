class HollowPattern
{    HollowPattern( int totrows,int totcols)
    {   
        for (int row=1;row<=totrows;row++)
        {
            for(int col=1;col<=totcols;col++)
            {   
                if(row==1||row==totrows||col==1||col==totcols)
                {
                   System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
       HollowPattern hp=new HollowPattern(4,5);

    }
}