//QuickSort

import java.util.*;
import java.lang.*;

class Sorts
{
    
    static int partition(int arr[],int low,int high){
        
        int pivot = arr[high];
        
        int i = low-1; //smallest element
        
        for(int j=low;j<high;j++){
            
            if(arr[j]<=pivot){
            
                i++;
            //swap elements
                int temp=arr[i];
                
                arr[i]=arr[j];
                
                arr[j]=temp;
                
            }
            
            //swap arr[i+1] and arr[high]
            
            int temp=arr[i+1];
            
            arr[i+1] = pivot;
            
            pivot = temp;
            
            
            
        }
        return i+1;
            
        }
        
        static void sort(int arr[],int low,int high){
            
            if(low<high){
                
                int pi = partition(arr,low,high);
                
                sort(arr,low,pi); //recursive function
                
                sort(arr,pi+1,high); //recursive function
                
            }
            
        }
        
        static void printArray(int arr[]){
            
            for(int i=0;i<arr.length;i++){
                
                System.out.println(arr[i]);
                
            }
            
        }
            
        
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        
        int arr[] = {3,6,2,4,5,3,3};
        
        int n = arr.length;
        
       Sorts ob = new Sorts();
        
        sort(arr,0,n-1);
        
        printArray(arr);
        
    }
}
