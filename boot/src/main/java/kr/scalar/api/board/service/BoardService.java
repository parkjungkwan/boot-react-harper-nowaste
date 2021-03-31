package kr.scalar.api.board.service;

import kr.scalar.api.board.domain.Board;

import java.util.List;


public interface BoardService {
	public Board findByTitle(String brdTitle);


}
