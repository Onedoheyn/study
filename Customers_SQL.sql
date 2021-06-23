

update MP_BOARD set title ='안녕하세요' where bno=21;


select * from MP_BOARD;

delete from MP_BOARD where bno = 21;


insert into mp_board(bno,title,content,writer)
select mp_board_seq.nextval,title,content,writer from mp_board;
commit;