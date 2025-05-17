//Collections:Queue
package com.tnsif.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String args[]) {
    PriorityQueue<String> pq=new PriorityQueue<String>();
    pq.add("Spoorthy");
    pq.add("Aishu");
    pq.add("Mithra");
    for(String name:pq) {
    	System.out.println(name);
    }
    System.out.println(pq.getClass());
	
    //Integer example
	PriorityQueue<Integer> iq=new PriorityQueue<>();
	iq.add(98);
	iq.add(87);
	iq.add(32);
	Iterator<Integer> values= iq.iterator();
	while(values.hasNext()) {
		System.out.print(values.next()+" ");
		}
	}
	}
	

