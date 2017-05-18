import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HighlandGames {
public static void main(String[] args) {
	Competitor Joe = new Competitor("Joe",5,3);
	Competitor Mark = new Competitor("Mark",9,1);
	Competitor Rick = new Competitor("Rick",6,4);
	Competitor Lisa = new Competitor("Lisa",3,7);
	Competitor Purple = new Competitor("Purple",5,8);
	List<Competitor> competitor= new ArrayList();
	competitor.add(Joe);
	competitor.add(Mark);
	competitor.add(Rick);
	competitor.add(Lisa);
	competitor.add(Purple);
	Competitor winner = competitor.get(0);
	Competitor.event = "Hammer Throw";
	for(Competitor x:competitor){
	//	x.setEvent("HammerThrow");
		if(x.strength>winner.strength){
			winner=x;
		}
	}
	System.out.println(winner.name + " wins the " + winner.event);
}
}
