/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;

/**
 *
 * @author diego_000
 */

/**
 * An implementation of a stack, based on extensible arrays.  The head of the
 * stack is stored in the first position of the list, allowing the stack to grow
 * and shrink in constant time. This stack implementation is ideal for 
 * applications that require a dynamically resizable stack which occasionally takes
 * a time proportional to the its length to expand.
 * <P>
 * Example usage:
 * <P>
 * To reverse a string with a stack array, we would use the following:
 * <pre>
 * public static void main(String[] arguments)
 * {
 *     if(arguments.length > 0){
 *         {@link StackVector} reverseStack = new {@link #StackVector()};
 *         String s = arguments[0];
 *          
 *         for(int i=0; i < s.length(); i++){
 *             reverseStack.{@link #push(Object) push(new Character(s.charAt(i)))};
 *         }
 *
 *         while(!reverseStack.{@link #empty()}){
 *             System.out.print(reverseStack.{@link #pop()});
 *         }
 *
 *         System.out.println();
 *     }
 * }
 * </pre>
 * @see Stack 
 * @see StackList 
 * @see StackArray
 * @see AbstractStack
 *
 * @version $Id: StackVector.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 */
public class StackVector<E> implements Stack<E> {
    /**
     * The vector containing the stack data.
     */
    protected Vector<E> data;

    /**
     * Construct an empty stack.
     *
     * @post an empty stack is created
     */
    public StackVector()
    {
        data = new Vector<E>();
    }

    /**
     * Construct a stack with initial capacity
     * Vector will grow if the stack fills vector.
     *
     * @post an empty stack with initial capacity of size is created
     * 
     * @param size The initial capacity of the vector.
     */
    public StackVector(int size)
    {
        data = new Vector<E>(size);
    }
    
    public void push(E item){
        data.add(item);
    }
    
    public E pop(){
      return data.remove(data.size()-1);
    }
    
    public E peek(){
        if(this.size()>0){
            return data.get(data.size()-1);
        }
        else{
            return null;
        }
    }
    
    public int size(){
        return data.size();
    }
    
    public boolean empty(){
        return this.size()==0;
    }
    
    public String toString(){
        return data.toString();
    }
}
