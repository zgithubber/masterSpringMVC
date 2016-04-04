package masterSpringMvc.search;

import java.util.List;

import masterSpringMvc.search.cache.SearchCache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

@Component
/*private static*/ class AsyncSearch {
	protected final Log logger = LogFactory.getLog(getClass());
	private SearchCache searchCache;

	@Autowired
	public AsyncSearch(SearchCache searchCache) {
		this.searchCache = searchCache;
	}

	@Async
	public ListenableFuture<List<LightTweet>> asyncFetch(String
	searchType, String keyword) {
	logger.info(Thread.currentThread().getName() + " - Searching for " + keyword);
	return new AsyncResult<>(searchCache.fetch(searchType,
	keyword));
	}
}