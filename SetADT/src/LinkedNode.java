/*
 * NAME: Shirley Ramirez
 * Programming Fundamentals
 * Summer Semester 2020
 * PROGRAMMING ASSIGNMENT 4 - SET
 */

// This class encapsulates an int value as a linked node
public class LinkedNode {
	int x; // The data value
	LinkedNode next; // Reference to the next LinkedNode

	// Default constructor
	LinkedNode() {
		next = null;
	}

	// Constructor that initializes the data value
	LinkedNode(int x) {
		this.x = x;
	}

}
