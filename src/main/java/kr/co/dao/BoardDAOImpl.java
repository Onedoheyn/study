package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	//.xml에 접근하기 위한
	@Inject
	private SqlSession sqlSession;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {//VO안에 있는 boardVO를 사용
		sqlSession.insert("boardMapper.insert", boardVO);//insert라는 디비문에 접속
	}
	
	// 게시물 목록 조회
	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {//VO안에 있는 SearchCriteria를 사용
		return sqlSession.selectList("boardMapper.listPage", scri);//listPage라는 디비문에 접속
	}
	
	// 게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {//VO안에 있는 SearchCriteria를 사용
		return sqlSession.selectOne("boardMapper.listCount", scri);//listCount라는 디비문에 접속
	}
	
	// 게시물 조회
	@Override
	public BoardVO read(int bno) throws Exception {//bno값을 받아서 .xml의 read에 bno값을 넘겨준다
		return sqlSession.selectOne("boardMapper.read", bno);//bno값을 넘겨준다 
	}
	
	// 게시글 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {//VO안에 있는 boardVO를 사용
		sqlSession.update("boardMapper.update", boardVO);//update라는 디비문에 접속
	}
	
	// 게시글 삭제
	@Override
	public void delete(int bno) throws Exception {//bno값을 받아서 .xml의 delete에 bno값을 넘겨준다
		sqlSession.delete("boardMapper.delete", bno);//bno값을 넘겨준다
	}

}