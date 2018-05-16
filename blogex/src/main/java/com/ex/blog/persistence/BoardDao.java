package com.ex.blog.persistence;

import java.util.List;

import com.ex.blog.BoardVO;

public interface BoardDao {
	
	//�Խ��� �ۼ�
	public void create(BoardVO vo) throws Exception;
	//�Խ��� �б�
	public BoardVO read(Integer bno) throws Exception;
	//�Խ��� ����
	public void uodate(BoardVO vo) throws Exception;
	//�Խ��� ����
	public void delete(Integer bno) throws Exception;
	//�Խ��� ���
	public List<BoardVO> listAll() throws Exception;

}
