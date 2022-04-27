import java.util.ArrayList;
import java.util.List;

public class Merkletest {
public static void main(String[] args) {
	List<String> tempTxList = new ArrayList<String>();
	tempTxList.add("My");
	tempTxList.add("name");
	tempTxList.add("is");
	tempTxList.add("Nikhil");
	tempTxList.add("Goyal");

	MerkleTrees merkleTrees = new MerkleTrees();
	merkleTrees.merkle_tree();
	System.out.println("root : " + merkleTrees.getRoot());
}
} 