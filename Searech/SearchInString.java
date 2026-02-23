public class SearchInString {
    public int  Search( String arr , char target)
    {
        if(arr.length()==0)
        {
            return  -1 ;
        }
        for(int index=0;index<arr.length();index++)
        {
            if(arr.charAt(index)== target)
            {
                return index;
            }
        }
        return -1 ;
    }
    public boolean Search2( String arr , char target)
    {
        if(arr.length()==0)
        {
            return false;
        }
        for( char ch: arr.toCharArray())
        {
            if(ch == target)
            {
                return true ;
            }
        }
        return false  ;
    }
    public static void main(String[] args) {
        
        SearchInString sis=new SearchInString();
        String name ="antsesshwar";
        char target='y';
         int  result= sis.Search(name ,target);
         System.out.println( "The Result 1: "+ result);
        boolean result1= sis.Search2(name, target);
        System.out.println("The Result 2: "+result1);
    }
}