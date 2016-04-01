package masterSpringMvc.search;

import java.util.List;

public interface TwitterSearch {

	public abstract List<LightTweet> search(String searchType,
			List<String> keywords);

}