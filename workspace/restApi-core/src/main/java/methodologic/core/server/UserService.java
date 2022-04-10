package methodologic.core.server;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import methodologic.core.mapper.UserMapper;
import methodologic.core.model.User;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserMapper mapper;
	
	private int offset;
	private final int limit = 15;
	
	public List<User> selectRecord(int pageNo) {
		
		RowBounds rowBounds = new RowBounds();
		if(pageNo != -1 && pageNo > 0 ) {
			offset = (pageNo -1) * limit;
			rowBounds = new RowBounds(offset,limit);
		}
		List<User> users = mapper.selectAll(rowBounds);
		
		return users;
	}

}
