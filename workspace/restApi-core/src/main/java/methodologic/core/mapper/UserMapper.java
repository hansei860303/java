package methodologic.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import methodologic.core.model.User;


@Mapper
public interface UserMapper {
	
	Long count();
	
	List<User> selectAll(RowBounds rowBounds);
	
	User selectByEmail(String email);
	
	User selectByPrimaryKey(Long id);
	
	int insert(User record);
	
	int updatePassword(Long id,String password);
	
	int deleteByPrimaryKey(Long id);
	
}
