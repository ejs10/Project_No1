package com.ex.blog.service;

import java.util.List;

import com.ex.blog.BoardVO;

public interface BoardService {
	//게시판 작성
	public void regist(BoardVO board) throws Exception;
	//게시판 읽기
	public BoardVO read(Integer bno) throws Exception;
	//게시판 수정
	public void modify(BoardVO board) throws Exception;
	//게시판 삭제
	public void remove(Integer bno)throws Exception;
	//게시판 목록
	public List<BoardVO> listAll() throws Exception;

}
