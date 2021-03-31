package kr.scalar.api.cart.repository;

import kr.scalar.api.cart.domain.Cart;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;


@Repository
public class CartRepositoryImpl extends QuerydslRepositorySupport implements ICartRepository {
	public CartRepositoryImpl() {
		super(Cart.class);
	}
}