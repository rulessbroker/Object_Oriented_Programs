package com.bridgelabz.cards;

public class DeckOfCards {

	static final String[] Suite = new String[] { "Clubs", "Diamonds", "Hearts", "Spades" };
	static final String[] Rank = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
			"Ace" };

	static String[][] Cards = new String[4][13];
	String[] player1Cards = new String[9];
	String[] player2Cards = new String[9];
	String[] player3Cards = new String[9];
	String[] player4Cards = new String[9];

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.initializeDeck();
		deck.shuffleCards();
		deck.distributeCards();
		System.out.print("\nPlayer#1 cards: ");
		deck.printCards(deck.player1Cards);
		System.out.print("---------\nPlayer#2 cards: ");
		deck.printCards(deck.player2Cards);
		System.out.print("---------\nPlayer#3 cards: ");
		deck.printCards(deck.player3Cards);
		System.out.print("---------\nPlayer#4 cards: ");
		deck.printCards(deck.player4Cards);
	}

	void initializeDeck() {
		for (int i = 0; i < Suite.length; i++) {
			for (int j = 0; j < Rank.length; j++) {
				Cards[i][j] = (Suite[i] + "-" + Rank[j]);
			}
		}
	}

	void shuffleCards() {
		for (int i = 0; i < Cards.length; i++) {
			for (int j = 0; j < Cards[i].length; j++) {
				int x = (int) (Math.random() * 10 % 4);
				int y = (int) (Math.random() * 10 % 13);
				String temp = Cards[i][j];
				Cards[i][j] = Cards[x][y];
				Cards[x][y] = temp;
			}
		}
	}

	void distributeCards() {
		int count = 0;
		int index = 0;
		for (String[] card : Cards) {
			for (int j = 0; j < card.length; j++) {
				if (count < 9) {
					player1Cards[index++] = card[j];
					count++;
					index = (index == 9) ? 0 : index;
				} else if (count < 18) {
					player2Cards[index++] = card[j];
					count++;
					index = (index == 9) ? 0 : index;
				} else if (count < 27) {
					player3Cards[index++] = card[j];
					count++;
					index = (index == 9) ? 0 : index;
				} else if (count < 36) {
					player4Cards[index++] = card[j];
					count++;
					index = (index == 9) ? 0 : index;
				}

			}
		}
	}

	void printCards(String[] playerCards) {
		for (String card : playerCards) {
			System.out.print(card + " | ");
		}
		System.out.println();
	}
}
