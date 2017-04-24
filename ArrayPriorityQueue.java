//

import java.util. ArrayList;

public class ArrayPriorityQueue<Ticket> implements PriorityQueue<Ticket>{

    private ArrayList<Ticket> _info;

    public ArrayPriorityQueue(){
	_info = new ArrayList<Ticket>;
    }

    public void add(Ticket x){
	int size = _info.size();
	for( int i = 0 ; i < size ; i ++ ) { 
	    Ticket infovalue = _info.get( i ) ;
	    // if current element is more than x
	    if( x.compareTo( infovalue ) > 0 ) {
		_info.add( i , x ) ;
		return ;
	    }
	}
	// if end
	_info.add( x ) ;
    }

    //retrievs head of the queue
    public Ticket peekMin(){
	return _info.get(0);
    }

    //compares to find highest priority
    public Ticket removeMin(){
	return _info.remove(0);

    public boolean isEmpty(){
	return _info.size() == 0;
    }

    public void print(){
	String p = "";
	for (Comparable s : _queue){
	    p += s + "   ";
	}
	System.out.println(p);
    }

    public static void main(String[] args){
	ArrayPriorityQueue<Integer> test = new ArrayPriorityQueue();
	test.add(1);
	test.add(10);
	test.add(8);
	test.add(0);
	test.add(14);
	test.add(2);
	test.print();

	System.out.println("peek:   " + test.peek());
	System.out.println("remove: " + test.remove());
	test.print();
    }
}
