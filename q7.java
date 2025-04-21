public static void sumOfEven(){ // method name
    Scanner sc = new Scanner(System.in);
    int num;
    int sum = 0; // sum = 0
    do
    {
    System.out.println("Enter a number (0 to quit):");
    num = sc.nextInt();
    if (num%2==0) // to get even number
    {
        sum = sum+num; // sum
        
    }
    }while(num !=0); // while condation
    System.out.println("The sum of even numbers is "+sum);
}
