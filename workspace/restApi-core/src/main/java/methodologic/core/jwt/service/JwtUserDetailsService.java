package methodologic.core.jwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import methodologic.core.mapper.UserMapper;

@Service
@RequiredArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

	private final UserMapper mapper;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		methodologic.core.model.User user = mapper.selectByEmail(email);

		if ((!user.getEmail().isEmpty() && user.getEmail().trim() != "")
				&& (!user.getPassword().isEmpty() && user.getPassword().trim() != "")) {

			return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
		} else {

			throw new UsernameNotFoundException("User not found with username: " + email);
		}

	}

}