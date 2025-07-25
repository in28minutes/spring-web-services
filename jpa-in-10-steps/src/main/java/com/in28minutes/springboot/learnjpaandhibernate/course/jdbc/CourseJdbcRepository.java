package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	private final JdbcTemplate springJdbcTemplate;

	public CourseJdbcRepository(JdbcTemplate springJdbcTemplate) {
		this.springJdbcTemplate = springJdbcTemplate;
	}

	private static final String INSERT_QUERY =

			"""
				insert into course (id, name, author)
				values(?, ?,?);
	
			""";

	private static final String DELETE_QUERY =
			
			"""
				delete from course
				where id = ?
	
			""";

	private static final String SELECT_QUERY =
			
			"""
				select * from course
				where id = ?
	
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,
				course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id) {
		//ResultSet -> Bean => Row Mapper => 
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		
	}

}
