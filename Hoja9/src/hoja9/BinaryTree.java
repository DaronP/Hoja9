/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja9;

/**
 * 
 * @author Andres
 * @author Antonio
 */
class BinaryNode<T extends Comparable<T>, U extends Comparable<U>>
{
    BinaryNode(T theKey, U theValue, U theValue2) {
        key = theKey;
        value=theValue;
        value2 = theValue2;
        left = right = null;
    }

    T key;          // The key in the node
    U value;			//The value associated for the key
    U value2;
    BinaryNode<T, U> left;         // Left child
    BinaryNode<T, U> right;        // Right child
}