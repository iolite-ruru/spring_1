package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	//실제 쿼리를 날리는 곳
	//쿼리 날리는 애: JdbcTemplate -> 여기에 있어야 함
	
	@Autowired
	JdbcTemplate db;
	
	//insert
	public void insert_data(TestBean bean) {
		String sql = "insert into test values(?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	//update
	public void update_data(TestBean bean) {
		String sql = "update test set data2=? where data1=?";
		//data1이 100인 data2값을 testtest로 변경
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	//delete
	public void delete_data(int data1) {
		String sql = "delete from test where data1=?";
		db.update(sql, data1);
	}
}
