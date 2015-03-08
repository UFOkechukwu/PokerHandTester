package com.ufokechukwu.poker.evaluator;


public class CalculationsFunctions {
	
	// Checks if String Array elements are the same
	public static boolean equalElementArr(String[] array){
		
		for (int i=0; i < array.length - 1; i++) {
		    if (!(array[i].equals(array[i+1]))){
		    	return false;
		    }      
		}
		
		return true;
	}
	
	// Checks if integer Array elements are the same
	public static boolean equalElementArr(int[] array){
		
		for (int i=0; i < array.length - 1; i++) {
		    if (array[i] != array[i+1]){
		    	return false;
		    }      
		}
		
		return true;
	}
	
	
	// Checks if variables in an array differ by a certain number
	public static boolean differenceBy(int difference, int[] array){
		
		for (int i=0; i < array.length - 1; i++) {
		    if ((array[i + 1] - array[i]) != difference){
		    	return false;
		    }      
		}
		
		return true;
	}
	
	
	
	public static boolean frequencyCount(int frequency, int[] array){
		
		// Run all ranks from 2 to 14 and check if it appears frequency times or more
		
		for (int irank = 2; irank <= 14 ; irank++) {
			
			int counter = 0;
			
			for (int i=0; i < array.length; i++) {
				
			    if (array[i] == irank){
			    	counter = counter + 1;
			    }      
			}
			
			if (counter >= frequency){
				return true;
			}
		        
		}
		
		
		
		return false;
	}
	
	
	
public static boolean frequencyEqualCount(int frequency, int[] array){
		
		// Run all ranks from 2 to 14 and check if it appears frequency times or more
		
		for (int irank = 2; irank <= 14 ; irank++) {
			
			int counter = 0;
			
			for (int i=0; i < array.length ; i++) {
				
			    if (array[i] == irank){
			    	counter = counter + 1;
			    	
			    }      
			}
			
			if (counter == frequency){
				counter = 0;
				
				return true;
			}
		        
		}
		return false;
		
	}
	
}


