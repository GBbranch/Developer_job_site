package com.dto;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.SqlMapConfig;

public class ResumeDAO {
    SqlSessionFactory factory = SqlMapConfig.getFactory();
    SqlSession sqlSession;

    public ResumeDAO() {
        sqlSession = factory.openSession(true);
    }

<<<<<<< HEAD
    public boolean insertresume(ResumeDTO rdto) {
        boolean result = false;
        
        // 여기에서 이력서 정보를 데이터베이스에 삽입하는 코드를 작성합니다.
        try {
            int count = sqlSession.insert("Resume.insertresume", rdto);
            if (count > 0) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        
        return result;
    }
=======
	public boolean insertresume(ResumeDTO rdto) {
		boolean result = false;

		return result;
	}

	public boolean save(ResumeDTO rdto) {
		try {
			sqlSession.insert("Resume.write", rdto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
>>>>>>> origin/jbh

    public boolean save(ResumeDTO rdto) {
        if (sqlSession.insert("Resume.write", rdto) == 1) {
            // 성공시
            return true;
        }
        return false;
    }
}
