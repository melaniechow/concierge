//TEAM CONCIERGE -- Melanie Chow
//class TICKET

public class Ticket implements Comparable<Ticket>{
    private int stub;
    private int VIP;
    private String user;
    private String problem;
    private String solution;
    private boolean solved;

    public Ticket(int stubnum, int priority, String name, String issue){
	stub=stubnum;
	VIP=priority;
	problem=issue;
	user=name;
	solution="";
}

    public int compareTo( Ticket x ) {
	if( x.getrank() > this.getrank() ) {
	    return -1 ;
	}
	else if( x.getrank() == this.getrank() ) {
	    return 0 ;
	}
	else {
	    return 1 ;
	}
    }

    public int getStub(){
	return stub;
    }

    public int getVIP(){
	return VIP;
    }

    public String getUser(){
	return user;
    }

    public String getProblem(){
	return problem;
    }

    public boolean isSolved(){
	return solved;
    }

    public String getSolution(){
	return solution;
    }

    public void setSolution( String the_fix ) {
	solution = the_fix ;
    }
    
    public void setSolved(int x) { //1=solved. 0=not
	if (x==1){
	    solved=true;
	}
    }
}

