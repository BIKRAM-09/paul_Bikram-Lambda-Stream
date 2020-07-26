import java.util.*;
class JavaList{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of ArrayList:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int total=0;
        int av=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter numbers:");
            a[i]=sc.nextInt();
        }
        System.out.println("The list is:");
        for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }
    for(int i=0;i<n;i++){
        total+=a[i];
        av=total/n;
    }
    System.out.println("Average :"+av);
}
}
