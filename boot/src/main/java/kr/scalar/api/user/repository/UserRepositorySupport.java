package kr.scalar.api.user.repository;

import java.util.List;
import java.util.Optional;

import kr.scalar.api.user.domain.UserVo;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class UserRepositorySupport extends QuerydslRepositorySupport implements IUserRepository {
	
	private final JPAQueryFactory jpaqueryFactory;
	public UserRepositorySupport(JPAQueryFactory jpaqueryFactory) {
		super(UserVo.class);
		this.jpaqueryFactory = jpaqueryFactory;
	}

	@Override
	public List<UserVo> findByName(String name) {
		return null;
	}

	@Override
	public boolean findByEmail(String email) {
		return false;
	}

	@Override
	public boolean checkId(String id) {
		return false;
	}

	@Override
	public String findIdByEmail(String email) {
		return null;
	}

	@Override
	public Optional<UserVo> findUserById(String email) {
		return Optional.empty();
	}

	@Override
	public Optional<UserVo> findUserByEmail(String email) {
		return Optional.empty();
	}

	@Override
	public Optional<UserVo> findPassword(String password) {
		return Optional.empty();
	}

	@Override
	public Optional<UserVo> updateProfile(String email, String password) {
		return Optional.empty();
	}

	@Override
	public Optional<UserVo> updatePassword(String password) {
		return Optional.empty();
	}

	@Override
	public void updateUserPassword(String id, String password) {

	}

	@Override
	public List<UserVo> findAllUser() {
		return null;
	}

//	public List<User> test(String name) {
//		QUser user = QUser.user;
//		return jpaqueryFactory.selectFrom(user).fetch();
//	}
}
