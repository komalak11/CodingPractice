using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.Collections;

//Selection sort
namespace Rextester
{
    
    class Program{
        
        static void sort(int[] arr){
            
            for(int i=0; i<arr.Length;i++){
                
               int minind=i;
                
                for(int j=i+1;j<arr.Length;j++){
                
                    if(arr[j]<arr[minind]){
                        
                        minind =j;
                        
                    }
                        //swap the elements
                        
                        int temp = arr[minind];
                        arr[minind] = arr[i];
                        arr[i] = temp;
                        
                    }
                    
                }
                
            }
           
        
        //to print array
        
        static void printArr(int[] arr){
            
            for(int i=0;i<arr.Length;i++){
                
                Console.WriteLine(arr[i]);
                
            }
            
        }
        
        //main function
        
        public static void Main(String[] args){
            
            int[] arr = {3,6,2,7,9};
            
            sort(arr);
            
            printArr(arr);
            
        }
        
    }
    
}
