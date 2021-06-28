package com.hms.customRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.hms.modal.User;

@Repository
public class Repo {
    @Autowired
	JdbcTemplate jdbc;
    
//    public List abc(int id){
//    	
//    	List<User> list = new ArrayList<>();
//    	list.addAll(jdbc.queryFor("select * from doctor where department_id=1;"));
//    	list.forEach(e->System.out.println(e));
//    	return list;
//    }
//}
    
    
//   
//    public List<User> findById(int id) {
//        String sql = "SELECT * FROM doctor where department_id = ?";
//        List<User> list = new ArrayList<>();
//        list.addAll(jdbc.query(sql, null))
//       return list;
//      }
}