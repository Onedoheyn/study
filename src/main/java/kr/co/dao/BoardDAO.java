package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVO;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	
	// 게시물 조회
	public BoardVO read(int bno) throws Exception; //xml에서 bno값으로 조회하기 때문에 bno값을 넘겨준다
	
	// 게시글 수정
	public void update(BoardVO boardVO) throws Exception;
	
	// 게시글 삭제
	public void delete(int bno) throws Exception;
}