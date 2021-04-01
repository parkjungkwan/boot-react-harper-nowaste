package kr.scalar.api.board.service;


import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import kr.scalar.api.board.domain.Board;
import kr.scalar.api.board.domain.BoardDto;
import kr.scalar.api.board.repository.BoardRepository;
import kr.scalar.api.common.service.AbstractService;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;



import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class BoardServiceImpl extends AbstractService<Board> implements BoardService{
	private final BoardRepository repository;
	
	@Override public long save(Board t) {
		String date = String.format("%s %s", LocalDate.now(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("a HH시 mm분")));
        t.setBrdWrtDate(date);
		return (repository.save(t)!=null) ? 1:0;}
	@Override public long count() {return (long)repository.count();}
	@Override public Board getOne(long id) {return repository.getOne(id);}
	@Override public Optional<Board> findById(long id){return repository.findById(id);}

	@Override
	public boolean existById(long id) {
		return false;
	}

	public boolean existsById(long id) {return repository.existsById(id);}
	@Override public List<Board> findAll() {
		return repository.findAll().stream().sorted(Comparator.comparing(Board::getBrdWrtDate).reversed()).collect(Collectors.toList());
	}
	@Override 
	public long delete(Board t) {
		repository.delete(t); 
		return (getOne(t.getBrdNo())==null)? 1:0;
	}
	@Override
	public Board findByTitle(String brdTitle) {
		return repository.findByTitle(brdTitle);
	}
	public Board findByBrd(Board board) {
		return repository.findByBrd(board);
	}
	public List<Board> search(String brdTitle) {
		return repository.search(brdTitle);
	}
	public List<Board> blogListAll() {
		return repository.blogListAll();
	}
	public long update(BoardDto dto) {
//		ModelMapper model = new ModelMapper();
//		
//		Board c = findById(brdNo).get();
//			c =	model.map(t , Board.class);	
		Board map = findById(dto.getBrdNo()).get();
		map.setBrdTitle(dto.getBrdTitle());
		map.setBrdContent(dto.getBrdContent());
     		return repository.save(map)==null? 1:0;
	}

	
	
	
	


//	public JPAUpdateClause update(Board t) {
//		return repository.update(t);
//	}

	



	
}
