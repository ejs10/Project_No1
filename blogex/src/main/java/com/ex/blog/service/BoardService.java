package com.ex.blog.service;

import java.util.List;

import com.ex.blog.BoardVO;

public interface BoardService {
	//�Խ��� �ۼ�
	public void regist(BoardVO board) throws Exception;
	//�Խ��� �б�
	public BoardVO read(Integer bno) throws Exception;
	//�Խ��� ����
	public void modify(BoardVO board) throws Exception;
	//�Խ��� ����
	public void remove(Integer bno)throws Exception;
	//�Խ��� ���
	public List<BoardVO> listAll() throws Exception;

}
