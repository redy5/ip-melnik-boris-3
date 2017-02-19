import java.io.Serializable;
import java.util.ArrayList;

public class Token implements Comparable<Token>, Serializable {
	private String text; // token text (the word)
	private int count = 0; // how many times this word is repeated
	int index;

	ArrayList<Coordinate> coords = new ArrayList<Coordinate>();

	ArrayList<Integer> docs = new ArrayList<Integer>();

	ArrayList<DoubleToken> dt = new ArrayList<DoubleToken>();

	Token(String text) { // basic constructor
		this.text = text;
		count = 1;
	}

	public void countPlus() {
		count++;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return text + ", repeated " + count + " times.";
	}

	@Override
	public int compareTo(Token o) {
		return this.text.compareTo(o.text);
	}

	public void addSecond(String s, int doc_id) {
		dt.add(new DoubleToken(s, doc_id));
	}

	public void addCoord(int place, int doc_id) {
		for (int i = 0; i < coords.size(); i++)
			if (coords.get(i).doc_id == doc_id) {
				coords.get(i).addPlace(place);
				return;
			}
		Coordinate n = new Coordinate(doc_id);
		n.addPlace(place);
		coords.add(n);
	}

}