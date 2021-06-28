package kr.co.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO{
	
	//.xml에 접근하기 위한
	@Inject SqlSession sql;
	
	//댓글조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception{//bno값을 받아서 .xml의 readReply에 bno값을 넘겨준다
		return sql.selectList("replyMapper.readReply",bno);//bno값을 넘겨준다
	}
	
	//댓글작성
	@Override
	public void writeReply(ReplyVO vo) throws Exception{
		sql.insert("replyMapper.writeReply",vo);
	}

}
