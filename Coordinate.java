import java.io.Serializable;
import java.util.ArrayList;

public class Coordinate implements Serializable{
	int doc_id;
	ArrayList<Integer> places = new ArrayList<Integer>();
	
	Coordinate(int doc_id){
		this.doc_id=doc_id;
	}
	
	public void addPlace(int place){
		places.add(place);
	}
}