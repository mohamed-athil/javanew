public class primerange {
    public static void main(String[] args) {
        for(int i=2;i<=25;i++)//2,3,4
        {
            int div=2;
            boolean isprime=true;
            while(div<=i/2)//(2<=2)
            {
                if (i%div==0)
                {
                    isprime=false;
                    break;

                }
                div++;
            }
            System.out.println(isprime?i+"":"");
        }
    }
    
}