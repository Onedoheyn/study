package kr.co.dao;

import java.util.List;

import kr.co.vo.ReplyVO;

//댓글 DAO
public interface ReplyDAO {
	
	//댓글조회
	public List<ReplyVO> readReply(int bno) throws Exception;

}
