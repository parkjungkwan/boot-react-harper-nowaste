package kr.scalar.api.receiver.repository;

import kr.scalar.api.receiver.domain.Receiver;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;


@Repository
public class ReceiverRepositoryImpl extends QuerydslRepositorySupport 
									implements ReceiverCustomRepository{
	// private final JPAQueryFactory qf;
	public ReceiverRepositoryImpl() {
		super(Receiver.class);
		// this.qf = qf;
	}
}
