package kr.scalar.api.user.service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import kr.scalar.api.common.service.AbstractService;
import kr.scalar.api.user.domain.UserVo;
import kr.scalar.api.user.domain.UserDto;
import kr.scalar.api.user.repository.UserRepository;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl extends AbstractService<UserVo> implements UserService {
	private final UserRepository userRepository;

	
	

	@Override
	public long save(UserVo userVo) {
		return userRepository.save(userVo) != null ? 1 : 0;
	}
	
	@Override
	public boolean checkDuplicateId(String userId) {
		if (userId != null) {
			return userRepository.checkId(userId);
		}
		return false;
	}

	@Override
	public boolean checkDuplicateEmail(String userId) {
		if (userId != null) {
			return userRepository.findByEmail(userId);
		}
		return false;
	}

	public long login(UserVo userVo) { return 3; }

	@Override
	public List<UserVo> findUsersByName(String name) {
		return userRepository.findByName(name);
	}


	@Override
	public List<UserVo> findAllUser() {
		return userRepository.findAllUser();
	}

	@Override
	public List<UserVo> findAll() {
		return userRepository.findAll().stream().sorted(Comparator.comparing(UserVo::getUsrName).reversed())
				.collect(Collectors.toList());
	}

	@Override
	public Optional<UserVo> updateProfile(UserVo userVo) {
		return userRepository.updateProfile(userVo.getUsrEmail(), userVo.getUsrPwd());
	}

	@Override
	public long delete(UserVo userVo) {
		userRepository.delete(userVo);
		return getOne(userVo.getUsrNo()) != null ? 1 : 0;
	}
	

	
	public Map<?, ?> userDetail(UserDto usrDto) {
		HashMap<String, String> map = new HashMap<>();
		return map;
	}

	
	@Override public UserDto create(UserDto user) { return null; }
	@Override public UserVo getOne(long id) { return userRepository.getOne(id); }
	@Override public boolean idCheck(UserVo userVo) { return false; }




	@Override
	public void updatePassword(String str, String userEmail) {
		
	}

	@Override
	public String createTempPassword() {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public Optional<UserVo> findById(long id) {
		return null;
	}

	@Override
	public boolean existById(long id) {
		return false;
	}


}