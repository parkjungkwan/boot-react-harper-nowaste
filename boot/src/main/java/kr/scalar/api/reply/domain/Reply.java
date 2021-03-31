package kr.scalar.api.reply.domain;

import javax.persistence.*;


import kr.scalar.api.board.domain.Board;
import kr.scalar.api.user.domain.UserVo;
import lombok.Getter;

@Entity @Getter @Table(name="replies")
public class Reply {
	@Id @Column(name="rpl_no") @GeneratedValue(strategy = GenerationType.IDENTITY) private long rplNo;
	@Column(name="rpl_content") private String rplContent;
	
	
	@ManyToOne
	@JoinColumn(name="brd_no")
	private Board board;

	@ManyToOne
	@JoinColumn(name = "usr_no")
	private UserVo userVo;
	

}