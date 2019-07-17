# CodingPractice
For practice purposes
//Rextester.Program.Main is the entry point for your code. Don't change it.
//Compiler version 4.0.30319.17929 for Microsoft (R) .NET Framework 4.5

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.Collections;

//Selection sort
namespace Rextester
{
    
    class sorting{
        
        static void sort(int[] arr){
            
            for(int i=0; i<arr.Length;i++){
                
               int minind=i;
                
                for(int j=0;j<arr.Length-1;j++){
                
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
