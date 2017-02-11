/**
 * This class contains the main implementation for a Linked list data structure in Java. 
 * 
 * @author Joe Samuel
 * @version 5.0.0
 */

import java.util.*;

public class ListReferenceBased
{
    private int numItems;
    Node head;
    /**
     * Constructor for objects of class ListReferenceBased
     */
    public ListReferenceBased()
    {
        head = new Node(0);
        numItems = 0;
    }
    
    /**
     * Returns the size of the list
     * 
     * @param  none   
     * @return integer value of the number of items
     */
    public int size()
    { 
       return numItems;
    }   

    /**
     * Removes an element from the list at the given index 
     * 
     * @param  index   takes the index from which the element needs to be removed 
     * @return  none
     */    
    public void remove(int index)
    {
        if (index < 1 || index > size())        //Range checker
            System.out.println("Sorry your choice was out of range!");     
        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    System.out.println("Sorry your choice was out of range!");
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            numItems--;
            System.out.println("Success!");
 
        }
        System.out.println("Sorry your choice was out of range!");
    }

    /**
     * Gets an element from a given index.
     * 
     * @param  index   takes the index from which the element needs to be removed 
     * @return  none
     */    
    public int get(int index)
    {
        Node current = head;
        for(int i = 0; i < index ;i++)  
        {
            if(current.getNext() == null) return current.getData();
            current = current.getNext();
        }
        return current.getData();
    }

    /**
     * Removes every element from the list  
     * 
     * @param none
     * @return  none
     */    
    public void removeAll()
    {
        head = null;
        numItems = 0;
    }

    /**
     * Checks if the list is empty or not
     * 
     * @param  index   takes the index from which the element needs to be removed 
     * @return returns false if not empty
     */    
    public boolean isEmpty()
    {
        if(numItems == 0)
        return true;
        else
        return false;
    }

    /**
     * Adds an element to your list
     * 
     * @param  value   integer value to add to your node
     *         index    index to place the element
     * @return  none
     */        
    public void add(int value, int index)
    {       
        Node n1 = new Node(value);
		Node current = head;
		if (current != null) {
			for (int i = 0; i < index && current.getNext() != null; i++) {
				current = current.getNext();
			}
		}
		n1.setNext(current.getNext());
		current.setNext(n1);
		numItems++;
    }

    /**
     * Makes a node for your linked lists
     * 
     * @author Joe Samuel
     * @version 5.0.0
     */
    private class Node
    {
        private int value;
        private Node next;
    
        /**
         * Constructor for objects of class ListReferenceBased
         */       
        public Node(int dvalue)
        {
            value = dvalue;
            next = null;
        }
        
        /**
         * Constructor for objects of class ListReferenceBased
         */
        public Node(int dvalue, Node n)
        {
            value  = dvalue;
            next = n;
        }
        
        /**
         * Get the value part of the node
         * 
         * @param  none   
         * @return  none
         */    
        public int getData()
        {
            return value;
        }

        /**
         * Set value to a given value for the node
         * 
         * @param  v   Takes in the value 
         * @return  none
         */            
        public void setData(int v)
        {
            value = v;
        }

        /**
         * Return the address linking to the next node
         * 
         * @param  none    
         * @return next Address for next node 
         */            
        public Node getNext()
        {
            return next;
        }
        
        /**
         * Setting up next node
         * 
         * @param  n   Taking in the next node value to point to 
         * @return  none
         */    
        public void setNext(Node n)
        {
            next = n;
        }
    }
}