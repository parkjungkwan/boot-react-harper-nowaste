package kr.scalar.api.payment.repository;

import kr.scalar.api.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


interface PaymentCustomRepository{
	
}
public interface PaymentRepository extends JpaRepository<Payment, Long>,
PaymentCustomRepository{

}