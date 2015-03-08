/**
 * 
 */
package com.ufokechukwu.poker.evaluator;

/**
 * @author Ugochukwu Okechukwu
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//--------------------------------------------------------------
		/*
		String[] royalFlush = {"AS","JS","QS","KS","TS"};
		
		if(HandChecker.checkRoyalFlush(royalFlush)){
			System.out.println("Yes it is a Royal Flush");
		}else{
			System.out.println("Nope");
		}
		*/
		
		//---------------------------------------------------------------
		/*
		String[] straight_Flush = {"6S","9S","8S","7S","TS"};
		
		if(HandChecker.checkStraightFlush(straight_Flush)){
			System.out.println("Yes it is a Straight Flush");
		}else{
			System.out.println("Nope");
		}
		*/
		
		//---------------------------------------------------------------
		
		
		/*
		
		String[] four_Kind = {"9S","9H","9C","9D","6S"};
				
			if(HandChecker.checkFourOfAKind(four_Kind)){
				System.out.println("Yes it is a Four of a kind");
			}else{
				System.out.println("Nope");
			}
		*/
		//---------------------------------------------------------------
		
		/*
		String[] full_House = {"JC","JS","TH","JD","TH"};
		
		if(HandChecker.checkFullHouse(full_House)){
			System.out.println("Yes it is a Full House");
		}else{
			System.out.println("Nope");
		}
		*/
		
		//---------------------------------------------------------------
		/*
				
			String[] flush = {"4H","8H","TH","KH","2H"};
				
			if(HandChecker.checkFlush(flush)){
				System.out.println("Yes it is a Flush");
			}else{
				System.out.println("Nope");
			}
		*/	
		
		
		//---------------------------------------------------------------
				
						
					//String[] straight = {"6S","7C","8H","9H","TD"};
					String[] straight = {"AS","2C","3H","5H","4D"};
						
					if(HandChecker.checkStraight(straight)){
						System.out.println("Yes it is a Straight");
					}else{
						System.out.println("Nope");
					}
				

	}

}
