package com.ex.blog.persistence;

import java.util.List;

import com.ex.blog.BoardVO;

public interface BoardDao {
	
	//게시판 작성
	public void create(BoardVO vo) throws Exception;
	//게시판 읽기
	public BoardVO read(Integer bno) throws Exception;
	//게시판 수정
	public void uodate(BoardVO vo) throws Exception;
	//게시판 삭제
	public void delete(Integer bno) throws Exception;
	//게시판 목록
	public List<BoardVO> listAll() throws Exception;

}
