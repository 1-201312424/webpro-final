package egovframework.student.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import egovframework.student.StudentVO;


@Repository("StudentDAO")
public class StudentDAO {
	
	@Inject
	private SqlSession session;
	
	public void insertStudent(StudentVO VO) throws Exception {
		session.insert("Student_SQL.insert", VO);
	}
	
	public List<StudentVO> selectStudent() throws Exception {
		return session.selectList("Student_SQL.select");
	}

}
