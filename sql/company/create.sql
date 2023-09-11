-- 기업 테이블 생성
CREATE TABLE "COMPANY" 
   (	"ID" NUMBER(20,0), 
	"COMPANY_NO" VARCHAR2(100), 
	"PASSWORD" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"BIRTH" VARCHAR2(100), 
	"type" VARCHAR2(100), 
	"EMPLOYEE_NO" VARCHAR2(100), 
	"SALE" VARCHAR2(100), 
	"CEO" VARCHAR2(100), 
	"URL" VARCHAR2(100), 
	"ADDR" VARCHAR2(100), 
	"DETAIL_ADDR" VARCHAR2(100)
   );
  
CREATE SEQUENCE company_seq
	START WITH 1 INCREMENT BY 1;