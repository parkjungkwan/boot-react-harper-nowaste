package kr.scalar.api.receiver.repository;

import kr.scalar.api.receiver.domain.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;


interface ReceiverCustomRepository{
	
}
public interface ReceiverRepository extends JpaRepository<Receiver, Long>,
ReceiverCustomRepository{

}
