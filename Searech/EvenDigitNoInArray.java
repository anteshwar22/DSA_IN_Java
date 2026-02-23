public class EvenDigitNoInArray {
    public int Mahibhau(int[] arr)
    {    int count=0;
        for(int element:arr)
        {
          count += calEven(element);
      
        }
        return count;
    }
    public int calEven(int num)
    {
         if(calDigit(num)%2==0)
         {
            return 1;
         }
         return 0;
    }
    public int calDigit(int num)
    {
        int count=0;
        while(num>0)
        {    count++;
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        EvenDigitNoInArray en=new EvenDigitNoInArray();
        int arr[]={12,346,489,96};
        int evenDigits=en.Mahibhau(arr);
        System.out.println(evenDigits);

    }
}