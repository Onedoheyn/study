package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;
import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.SearchCriteria;

@Service
public class BoardServiceImple implements BoardService {

	//BoardDAO를 사용하기위해
	@Inject
	private BoardDAO dao;

	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);//dao에 있는 write메소드를 사용(boardVO)값을 넘겨준다
	}

	// 게시물 목록 조회
	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {
		return dao.list(scri);//dao에 있는 list메소드를 사용(scri)값을 넘겨준다
	}
	
	// 게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception{
		return dao.listCount(scri);//dao에 있는 listCount메소드를 사용(scri)값을 넘겨준다
	}
	
	// 게시물 조회
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);//dao에 있는 read메소드를 사용(bno)값을 넘겨준다
	}
	
	// 게시글 수정
	@Override
	public void update(BoardVO boardVO) throws Exception{
		dao.update(boardVO);//dao에 있는 update메소드를 사용(boardVO)값을 넘겨준다
	}
	
	// 게시글 삭제
	@Override
	public void delete(int bno) throws Exception{
		dao.delete(bno);//dao에 있는 delete메소드를 사용(bno)값을 넘겨준다
	}

}