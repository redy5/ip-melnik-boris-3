/*ip 3 melnik boris
forgot to make comments*/
import java.io.Serializable;

public class DoubleToken implements Serializable{ //if u need for wxample to make 3-word combinations dictionary - u can just add new word in this class, which will effectively create a 3 word chain, and so on
	String secondWord;
	int doc_id;
	
	DoubleToken(String secondWord, int doc_id){
		this.secondWord=secondWord;
		this.doc_id=doc_id;
	}
}