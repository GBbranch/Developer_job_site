package com.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.CompanyDTO;
import com.util.DBConnectionUtil;

public class CompanyDAO {
    public int insertCompany(CompanyDTO company) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = 0;
        
        try {
            conn = DBConnectionUtil.getConnection();
            String sql = "INSERT INTO COMPANY (BUSINESS_NUMBER, PASSWORD, COMPANY_NAME, ESTABLISHED_DATE, COMPANY_TYPE, " +
                         "EMPLOYEE_COUNT, CEO, URL, ADDRESS, DETAIL_ADDR, ADDRETC, CONTENT) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, company.getBusinessNumber());
            pstmt.setString(2, company.getPassword());
            pstmt.setString(3, company.getCompanyName());
            pstmt.setString(4, company.getEstablishedDate());
            pstmt.setString(5, company.getCompanyType());
            pstmt.setInt(6, company.getEmployeeCount());
            pstmt.setString(7, company.getRepresentativeName());
            pstmt.setString(8, company.getWebsite());
            pstmt.setString(9, company.getZipcode());
            pstmt.setString(10, company.getAddress());
            pstmt.setString(11, company.getDetailAddr());
            pstmt.setString(12, company.getAddretc());
            pstmt.setString(13, company.getCompanyDescription());
            
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnectionUtil.close(conn, pstmt, null);
        }
        
        return result;
    }
}
