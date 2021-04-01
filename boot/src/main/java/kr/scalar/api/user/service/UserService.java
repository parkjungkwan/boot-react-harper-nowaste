package kr.scalar.api.user.service;

import kr.scalar.api.user.domain.UserVo;
import kr.scalar.api.user.domain.UserDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;


public interface UserService {
	
	public boolean checkDuplicateId(String userId);
	public boolean checkDuplicateEmail(String userId);
	public List<UserVo> findUsersByName(String name);
	public List<UserVo> findAllUser();
	public UserDto create(UserDto user);
	public Optional<UserVo> updateProfile(UserVo userVo);
	public boolean idCheck(UserVo userVo);
	public void updatePassword(String str, String userEmail);
	public String createTempPassword();

	// security default method
	public String signin(String username, String password);
	public String signup(UserVo user);
	public void delete(String username);
	public UserVo search(String username);
	public UserVo whoami(HttpServletRequest req);
	public String refresh(String username);

	
}