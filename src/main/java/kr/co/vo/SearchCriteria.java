package kr.co.vo;

//검색기능
public class SearchCriteria extends Criteria{

	private String searchType = "";//검색키워드(제목,내용,작성자등)
	private String keyword = "";//검색키워드
	 
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
	}
	
}