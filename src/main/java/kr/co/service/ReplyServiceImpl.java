package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.dao.ReplyDAO;
import kr.co.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	//ReplyDAO를 사용하기 위해
	@Inject
	private ReplyDAO dao;
	
	//댓글 조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception{
		return dao.readReply(bno);//dao에 있는 readReply메소드를 실행(bno)값을 넘겨준다
	}
	
	//댓글 작성
	@Override
	public void writeReply(ReplyVO vo) throws Exception{
		dao.writeReply(vo);
	}

}
