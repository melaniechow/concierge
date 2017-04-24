//TEAM CONCIERGE - Melanie Chow
//PriorityQueue Interface

public interface PriorityQueue{

    //adds item to priority queue
    public void add(Object x);

    //T if empty, false otherwise
    public boolean isEmpty();

    //returns smallestt item stored in pq
    public Object peekMin();

    //removes and returns smallest item stord in pq
    public Objct removeMin();
}

