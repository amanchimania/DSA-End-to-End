import java.io.*;
import java.util.*;
class Main{
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int i=0;
    int j=n-1;
    while(i<=j){
        System.out.println(arr[i]+" "+arr[j]);
        i++;
        j--;
        }
    }
}