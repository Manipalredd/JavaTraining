package com.java.spr.dao;
 
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.List;
 
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
 
import com.java.spr.model.Employ;
 
public class EmployDaoImpl implements EmployDao {
 
	private JdbcTemplate jdbcTemplate;

	public EmployDaoImpl(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@Override

	public List<Employ> showEmployDao() {

		 String sql = "SELECT * FROM Employ";

		    List<Employ> listEmploy = jdbcTemplate.query(sql, new RowMapper<Employ>() {

		        @Override

		        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {

		            Employ employ = new Employ();

		            employ.setEmpno(rs.getInt("empno"));

		            employ.setName(rs.getString("name"));

		            employ.setDept(rs.getString("dept"));

		            employ.setDesig(rs.getString("desig"));

		            employ.setBasic(rs.getInt("basic"));

		            return employ;

		        }

		    });

		    return listEmploy;
 
	}

	@Override
	public Employ searchEmployDao(int empno) {
		String sql = "select * from Employ where empno=?";
	    return jdbcTemplate.query(sql,new Object[] {empno}, new ResultSetExtractor<Employ>() {
	        public Employ extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	                Employ employ = new Employ();
		            employ.setEmpno(rs.getInt("empno"));
		            employ.setName(rs.getString("name"));
		            employ.setDept(rs.getString("dept"));
		            employ.setDesig(rs.getString("desig"));
		            employ.setBasic(rs.getInt("basic"));
		            return employ;
	            }
	 
	            return null;
	        }
	 
	    });

	}

	@Override
	public String addEmployDao(Employ employ) {
		String cmd = "insert into Employ(empno,name,gender,dept,desig,"
				+ "basic) values(?,?,?,?,?,?)";
		 jdbcTemplate.update(cmd, employ.getEmpno(),employ.getName(), 
				 employ.getDept(),employ.getDesig(),employ.getBasic());
		 return "Employ Record Inserted...";
	}

	@Override
	public String updateEmployDao(Employ employ) {
		String cmd = "Update employ set name=?,Gender=?, Dept=?, Desig=?, "
				+ " Basic=? WHERE Empno=?";
		 jdbcTemplate.update(cmd, employ.getName(),
				 employ.getDept(),employ.getDesig(),employ.getBasic(),
				 employ.getEmpno());
		 return "Employ Record Updated...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		String sql = "DELETE FROM Employ WHERE empno=?";
	    jdbcTemplate.update(sql, empno);
	    return "Employ Record Deleted...";
	}
	}
 

 