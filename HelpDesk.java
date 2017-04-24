//TEAM CONCIERGE - Melanie Chow
//class HelpDesk

import cs1.Keyboard ;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> tickets;
    private int issues;

    public HelpDesk(){
	tickets=new ArrayPriorityQueue<Ticket>();
	issues=0;
    }
    
    //adds ticket
    public void addTicket(){
	issues ++ ;
	System.out.println( "#" + issues + "\n Hello! Welcome to the concierge. What is your name?" ) ;
	String name = Keyboard.readString() ;
		
	System.out.println( "Greetings" + name + ". What is your problem?" ) ;
	String problem = Keyboard.readString() ;
				
	int rank = ( int )( Math.random() * 25 ) ;
	Ticket sos = new Ticket( issues, rank,  name, problem ) ;
	tickets.add( sos ) ;
		
	System.out.println( "Thank you. Your problem has been noted. Please be patient while we process your issue. \n" ) ;	
}

    public void findSoln( Ticket x ) {
	x.setSolved( true ) ; 
	String prob = x.getProblem() ;
		
	if( prob.toLowerCase().indexOf( "life" ) >= 0 ) {
	    x.setSolution( "Try talking to some family and friends about it. Seek out those who care about you." ) ;
	}
	else if( prob.toLowerCase().indexOf( "love" ) >= 0 ) {
	    x.setSolution( "No matter what...don't lose hope and don't lose who you are." ) ;
	}
	else if( prob.toLowerCase().indexOf( "friends" ) >= 0 ) {
	    x.setSolution( "Talk to your family, seek out new people." ) ; // /r/relationships
	}
	else if( prob.toLowerCase().indexOf( "money" ) >= 0 ) {
	    x.setSolution( "Try to save some money aside whenever possible. Find happiness" ) ;
	}
	else {
	    x.setSolution( "Sorry, we cannot help you :( " ) ;
	    x.setSolved( false ) ;
	}
    }
	
    public void solveprob() {
		
	Ticket help = tickets.peekMin() ;
	findSoln( help ) ; // soln var filled
		
	System.out.println(( help.getName()) + "? Stub number:"+ help.getStub() ) ;
	if( help.isSolved()) {
	    System.out.print( "Your problem has been solved.\n What we had to say is: " ) ;
	}
	System.out.println( curr.getSoln() + "\nWe hope to see you again :).\n" ) ;
		
	tickets.removeMin() ;
    }

    public static void main( String[] args ) {
		
	HelpDesk conciergo = new HelpDesk() ;
		
	// enqueue 3, dequeue 3
	for( int i = 0 ; i < 3 ; i ++ ) {
			
	    for( int n = 0 ; n < 3 ; n ++ ) {
		conciergo.addTicket() ;
	    }
			
	    System.out.println( "\n" ) ;
			
	    for( int n = 0 ; n < 3 ; n ++ ) {
		conceirgo.solveprob() ;
	    }
	}
    }
}
