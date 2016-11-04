import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaveURLs {

	private HashMap<String, List<String>> invertedIndex;

	public SaveURLs() {
		this.invertedIndex = new HashMap<String, List<String>>();
	}

	public void buildInvertedIndex(String badWord, String badUrl) {

		if (invertedIndex.containsKey(badWord)) {
			invertedIndex.get(badWord).add(badUrl);
		} else {
			ArrayList<String> urlList = new ArrayList<String>();
			urlList.add(badUrl);
			invertedIndex.put(badWord, urlList);
		}
	}

}
