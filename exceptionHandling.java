class exceptionHandling {
    public static void main(String[] args) {
        try{   
            int data=100/0;  
            System.out.println(data);
         }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            int a[]=new int[5];  
            a[10]=50;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}