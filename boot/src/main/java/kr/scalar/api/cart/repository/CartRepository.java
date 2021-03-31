package kr.scalar.api.cart.repository;

import kr.scalar.api.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


interface ICartRepository {}

public interface CartRepository extends JpaRepository<Cart, Long>, ICartRepository {

}
