package kr.scalar.api.payment.service;

import java.util.List;
import java.util.Optional;

import kr.scalar.api.common.service.AbstractService;
import kr.scalar.api.payment.domain.Payment;
import kr.scalar.api.payment.repository.PaymentRepository;
import org.springframework.stereotype.Service;



import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl extends AbstractService<Payment>
								implements PaymentService{
	private final PaymentRepository repo;

	@Override public long save(Payment t) {return (repo.save(t)!=null) ? 1 : 0 ;}
	@Override public long count() {return (long) repo.count();}
	@Override public Payment getOne(long id) {return repo.getOne(id);}
	@Override public Optional<Payment> findById(long id) {return repo.findById(id);}

	@Override
	public boolean existById(long id) {
		return false;
	}

	@Override public List<Payment> findAll() {return repo.findAll();}
	@Override public long delete(Payment t) {
		repo.delete(t); 
		return (getOne(t.getPayNo())==null) ? 1 : 0;
	}
}
