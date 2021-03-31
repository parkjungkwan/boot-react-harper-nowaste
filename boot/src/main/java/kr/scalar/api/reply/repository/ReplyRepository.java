package kr.scalar.api.reply.repository;

import kr.scalar.api.reply.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;


interface IReplyRepository{
	
}

public interface ReplyRepository extends JpaRepository<Reply, Long>,
									IReplyRepository{

}