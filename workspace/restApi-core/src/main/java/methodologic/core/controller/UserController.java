package methodologic.core.controller;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import methodologic.core.mapper.UserMapper;
import methodologic.core.model.User;
import methodologic.core.server.UserService;

@RequestMapping("/api/user")
@RequiredArgsConstructor
@RestController
public class UserController{

	private final UserMapper mapper;
	private final UserService service;

	@Operation(summary = "全件数取得します")
	@GetMapping("/count")
	Long countAll() {
		return mapper.count();
	}

	@Operation(summary = "指定emailからデータを取得")
	@GetMapping("/findByEmail/{email}")
	User findByEmail(@PathVariable String email) {
		return mapper.selectByEmail(email);
	}
	
	@Operation(summary = "一件を取得")
	@GetMapping("/findById/{id}")
	User findById(@PathVariable Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Operation(summary = "指定ページから件数取得、-1の場合、全件取得")
	@GetMapping("/findAll/{pageNo}")
	List<User> findAll(@PathVariable int pageNo) {
		return service.selectRecord(pageNo);
	}

	@Operation(summary = "データを新規します")
	@PutMapping("/create")
	int create(@RequestBody User newUser) {
		if (newUser.getId() == null) {

			newUser.setPassword(new BCryptPasswordEncoder().encode("password"));
			newUser.setFirstLogin(true);
			return mapper.insert(newUser);
			
		} else {
			return 0;
		}
	}

	@Operation(summary = "パスワードを変更")
	@PutMapping("/changePw")
	int changePassword(@RequestBody User newUser) {
		if (newUser.getId() != null && (!newUser.getPassword().isEmpty())) {

			newUser.setPassword(new BCryptPasswordEncoder().encode(newUser.getPassword()));
			return mapper.updatePassword(newUser.getId(), newUser.getPassword());

		} else {
			return 0;
		}
	}

	@Operation(summary = "データを削除します")
	@DeleteMapping("/delete/{id}")
	int deleteById(@PathVariable Long id) {
		return mapper.deleteByPrimaryKey(id);
	}

}
