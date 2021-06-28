package kr.co.vo;

public class Criteria {
	
	private int page;//페이지
	private int perPageNum;//페이지번호
	private int rowStart;//줄시작
	private int rowEnd;//줄끝
	
	public Criteria(){
		this.page = 1;
		this.perPageNum = 10;
	}

	public void setPage(int page){
		if(page <=0){
			this.page = 1;
			return;			
		}
		this.page = page;
	}
	
	public void setPerPageNum(int perPageNum){
		if(perPageNum <=0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	public int getPage(){
		return page;		
	}
	
	public int getPageStart(){
		return (this.page-1)*perPageNum;		
	}
	
	public int getPerPageNum(){
		return this.perPageNum;
	}
	
	public int getRowStart(){
		rowStart = ((page -1) * perPageNum) + 1;
		return rowStart;
	}
	
	public int getRowEnd() {
		rowEnd = rowStart + perPageNum - 1;
		return rowEnd;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", per PageNum=" + perPageNum	+ ", rowStart=" +rowStart + ",rowEnd=" + rowEnd +"]";
	}
	 
}
