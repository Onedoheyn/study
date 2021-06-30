

update MP_BOARD set title ='안녕하세요' where bno=21;


select * from MP_BOARD;

delete from MP_BOARD where bno = 21;

/*현재 디비에 있는 데이터 배로 늘리는 sql문*/
insert into mp_board(bno,title,content,writer)
select mp_board_seq.nextval,title,content,writer from mp_board;
commit;



/*댓글 쿼리,시퀀스*/
create table mp_reply (
	bno number not null,
	rno number not null,
	content varchar2(1000) not null,
	writer varchar2(50) not null,
	regdate date default sysdate,
	primary key(bno, rno)
);

alter table mp_reply add constraint mp_reply_bno foreign key(bno)
references mp_board(bno);

create sequence mp_reply_seq START WITH 1 MINVALUE 0;

/*댓글 테스트용 쿼리작성*/
insert into mp_reply(bno, rno, content, writer)
	values(381, MP_REPLY_seq.nextval,'테스트댓글','테스트 작성자');

select rno, content, writer,regdate
	from mp_reply
	where bno = 381
	ORDER BY RNO;
	
/*DB연결이 끈어지고 재접속할때마다 시퀀스제약조건 때문에 1 10 20 이런식으로 증가해서 사용안하기 위한 명령문*/
alter sequence mp_reply_seq nocache;





