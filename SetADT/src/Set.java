/*
 * NAME: Shirley Ramirez
 * Programming Fundamentals
 * Summer Semester 2020
 * PROGRAMMING ASSIGNMENT 4 - SET
 */

public class Set {

	LinkedNode front;
	int count;

	// Constructor
	Set() {
		front = null;
		count = 0;
	}

	// add method
	void add(int x) {
		LinkedNode newNode = new LinkedNode(x);

		// if set is empty, add integer to front of set
		if (front == null) {
			front = newNode;
			count++;
		} else {
			// else check for duplicate
			LinkedNode currNode = front;

			// check for duplicate until last node
			while (currNode.next != null && currNode.x != newNode.x) {
				currNode = currNode.next;
			}

			// if last node is not duplicate, add new node as the new end of set
			if (currNode.x != newNode.x) {
				newNode.next = front;
				front = newNode;
				count++;
			}
		}
	}

	// delete method
	void delete(int x) {
		LinkedNode prevNode = null;
		LinkedNode currNode = front;

		// if set is empty, do nothing
		if (currNode == null) {
			return;
		}

		// if deleting first value in set
		if (currNode.x == x) {
			front = currNode.next;
			return;
		}

		// check rest of the set for value to be deleted
		while (currNode.next != null && currNode.x != x) {
			prevNode = currNode;
			currNode = prevNode.next;
		}

		// delete value if found
		if (currNode.x == x) {
			prevNode.next = currNode.next;
		}
	}

	// exists method
	boolean exists(int x) {
		// if set is empty, return false
		if (front == null) {
			return false;
		}

		// else check for value
		LinkedNode currNode = front;

		// check for value
		while (currNode.next != null && currNode.x != x) {
			currNode = currNode.next;
		}

		// if current node is value, return true
		if (currNode.x == x) {
			return true;
		}

		// if value is not found in set, return false
		return false;
	}

	// toString method
	@Override
	public String toString() {
		String result = "";
		LinkedNode current = front;

		while (current != null) {
			result += (current.x + " ");
			current = current.next;
		}

		return result;
	}

}
