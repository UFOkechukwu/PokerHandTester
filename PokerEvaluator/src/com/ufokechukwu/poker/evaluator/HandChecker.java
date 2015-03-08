package com.ufokechukwu.poker.evaluator;

import java.util.Arrays;

public class HandChecker {
	
	
	// ---------------------------- Royal Flush Check ------------------------------------------------
	public static boolean checkRoyalFlush(String[] cardHand){
		
		System.out.println("Searching For ROYAL FLUSH");
		
		Card myCard = new Card();
		
		// Create two arrays to save Suit and Rank
		String[] HandSuit_Arr = new String[5];
		int[] HandRank_Arr = new int[5];
		
		for(int i = 0; i < HandSuit_Arr.length; i++) {
			myCard.setCardValue(cardHand[i]);
			HandSuit_Arr[i] = myCard.getCardSuit(); // Gets Suit type
			HandRank_Arr[i] = myCard.getCardRank(); // Gets Rank integer value
        }
		
		// Sort Rank
		Arrays.sort(HandRank_Arr);
		
		System.out.println(Arrays.toString(HandRank_Arr));
		System.out.println(Arrays.toString(HandSuit_Arr));
		
		//Note Royal Flush sorted Rank Array = {14, 13, 12, 11, 10} 
		
		// Check if same suit
		if(CalculationsFunctions.equalElementArr(HandSuit_Arr) && Arrays.equals(HandRank_Arr, new int[]{10, 11, 12, 13, 14}) ){
			return true;
		}
		
		
		return false;
	}
	

	//---------------Ends Royal Flush Check -------------------------------------------------
	
	// ---------------Straight Flush Check --------------------------------------------------------
	
	public static boolean checkStraightFlush(String[] cardHand){
		
		System.out.println("Searching For STRAIGHT FLUSH");
		
		Card myCard = new Card();
		
		// Create two arrays to save Suit and Rank
		String[] HandSuit_Arr = new String[5];
		int[] HandRank_Arr = new int[5];
		
		for(int i = 0; i < HandSuit_Arr.length; i++) {
			myCard.setCardValue(cardHand[i]);
			HandSuit_Arr[i] = myCard.getCardSuit(); // Gets Suit type
			HandRank_Arr[i] = myCard.getCardRank(); // Gets Rank integer value
        }
		
		// Sort Rank
		Arrays.sort(HandRank_Arr);
		

		System.out.println(Arrays.toString(HandRank_Arr));
		System.out.println(Arrays.toString(HandSuit_Arr));
		
		//Note Royal Flush sorted Rank Array = {14, 13, 12, 11, 10} 
		
		
		
		// Check if same suit
		if(CalculationsFunctions.equalElementArr(HandSuit_Arr) && CalculationsFunctions.differenceBy(1, HandRank_Arr)){
			return true;
		}
		
		
		return false;
	}
	
	
	
		//---------------Ends Straight Flush Check -------------------------------------------------
	
		// ---------------Four Of A Kind --------------------------------------------------------
		
		public static boolean checkFourOfAKind(String[] cardHand){
			
			System.out.println("Searching For FOUR OF A KIND");
			
			Card myCard = new Card();
			
			// Create two arrays to save Suit and Rank
			String[] HandSuit_Arr = new String[5];
			int[] HandRank_Arr = new int[5];
			
			for(int i = 0; i < HandSuit_Arr.length; i++) {
				myCard.setCardValue(cardHand[i]);
				HandSuit_Arr[i] = myCard.getCardSuit(); // Gets Suit type
				HandRank_Arr[i] = myCard.getCardRank(); // Gets Rank integer value
	        }
			
			// Sort Rank
			Arrays.sort(HandRank_Arr);
			

			System.out.println(Arrays.toString(HandRank_Arr));
			System.out.println(Arrays.toString(HandSuit_Arr));
			
			//Note Royal Flush sorted Rank Array = {14, 13, 12, 11, 10} 
			
			
			
			// Check if same suit
			if( CalculationsFunctions.frequencyCount(4, HandRank_Arr)){
				return true;
			}
			
			
			return false;
		}
		
		
		
		//---------------Ends Straight Flush Check -------------------------------------------------
		
		// ---------------Full House --------------------------------------------------------
		
		public static boolean checkFullHouse(String[] cardHand){
			
			System.out.println("Searching For FULL HOUSE");
			
			Card myCard = new Card();
			
			// Create two arrays to save Suit and Rank
			String[] HandSuit_Arr = new String[5];
			int[] HandRank_Arr = new int[5];
			
			for(int i = 0; i < HandSuit_Arr.length; i++) {
				myCard.setCardValue(cardHand[i]);
				HandSuit_Arr[i] = myCard.getCardSuit(); // Gets Suit type
				HandRank_Arr[i] = myCard.getCardRank(); // Gets Rank integer value
	        }
			
			// Sort Rank
			Arrays.sort(HandRank_Arr);
			

			System.out.println(Arrays.toString(HandRank_Arr));
			System.out.println(Arrays.toString(HandSuit_Arr));
			
			//Note Check if exact 3 & 2 frequency exist in array 
			
			// Check 3 & 2 frequency
			if( CalculationsFunctions.frequencyEqualCount(3, HandRank_Arr) &&  CalculationsFunctions.frequencyEqualCount(2, HandRank_Arr)){
				return true;
			}
			
			
			return false;
		}
	
		
		
		//---------------Ends Straight Full House -------------------------------------------------
		
		
		// ---------------Flush --------------------------------------------------------
		
		public static boolean checkFlush(String[] cardHand){
					
					System.out.println("Searching For FLUSH");
					
					Card myCard = new Card();
					
					// Create two arrays to save Suit and Rank
					String[] HandSuit_Arr = new String[5];
					int[] HandRank_Arr = new int[5];
					
					for(int i = 0; i < HandSuit_Arr.length; i++) {
						myCard.setCardValue(cardHand[i]);
						HandSuit_Arr[i] = myCard.getCardSuit(); // Gets Suit type
						HandRank_Arr[i] = myCard.getCardRank(); // Gets Rank integer value
			        }
					
					// Sort Rank
					Arrays.sort(HandRank_Arr);
					

					System.out.println(Arrays.toString(HandRank_Arr));
					System.out.println(Arrays.toString(HandSuit_Arr));
					
					//Note Check if exact 3 & 2 frequency exist in array 
					
					
					return CalculationsFunctions.equalElementArr(HandSuit_Arr);
				}
		
		//---------------Ends Flush -------------------------------------------------
		
		
		// ---------------Straight --------------------------------------------------------
				
		public static boolean checkStraight(String[] cardHand){
							
							System.out.println("Searching For STRAIGHT");
							
							Card myCard = new Card();
							
							// Create two arrays to save Suit and Rank
							String[] HandSuit_Arr = new String[5];
							int[] HandRank_Arr = new int[5];
							
							for(int i = 0; i < HandSuit_Arr.length; i++) {
								myCard.setCardValue(cardHand[i]);
								HandSuit_Arr[i] = myCard.getCardSuit(); // Gets Suit type
								HandRank_Arr[i] = myCard.getCardRank(); // Gets Rank integer value
					        }
							
							// Sort Rank
							Arrays.sort(HandRank_Arr);
							

							System.out.println(Arrays.toString(HandRank_Arr));
							System.out.println(Arrays.toString(HandSuit_Arr));
							
							// Check same suit or 
							if( CalculationsFunctions.differenceBy(1, HandRank_Arr) || Arrays.equals(HandRank_Arr, new int[]{2,3,4,5,14})){
								return true;
							}
							
							
							return false;
							
						}
	
	

}
