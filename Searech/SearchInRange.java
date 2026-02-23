public class SearchInRange {
    public boolean  Search( String str,char target,int start,int end)
    {
        if(str.length()==0)
        {
            return false;

        }
        for(int i=start;i<=end;i++)
        {   
             char element=str.charAt(i);
             if(element==target)
             {
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInRange sir=new SearchInRange();
        String str="Hi am  Iron Man " ;
        char target='r';
         boolean result=sir.Search(str,target,0,str.length()-1);
         System.out.println(result);
    }
}