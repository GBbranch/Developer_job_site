CREATE TABLE "RESUME" 
   (	"ID" NUMBER(20,0), 
	"USER_ID" VARCHAR2(100), 
	"CAREER" VARCHAR2(100), 
	"SCHOOL" VARCHAR2(100), 
	"PORTFOLIO" VARCHAR2(100), 
	"REG_DATE" VARCHAR2(100), 
	"LICENCE" VARCHAR2(100)
   );
 
SELECT * FROM "RESUME";

INSERT INTO "RESUME" VALUES
(resume_seq.NEXTVAL , 'qwer' , '개발자', '학교' ,'개인주소' ,'3년차' , '정보처리기사')
;
INSERT INTO "RESUME" VALUES
(resume_seq.NEXTVAL , 'qwer' , '개발자2', '대학교' ,'개인주소' ,'1년차' , '정보처리기사')
;

CREATE SEQUENCE resume_seq
   START WITH 1
   INCREMENT BY 1;
  
  CREATE SEQUENCE member_seq
   START WITH 1 INCREMENT BY 1;
  
  
  ------------------------------------------------------------------------------------
  --------------------0908DB설계--------------------------------------------------------
  CREATE TABLE "MEMBER" (
    "id" NUMBER(6),
    "user_id" VARCHAR2(100),
    "password" VARCHAR2(100),
    "name" VARCHAR2(100),
    "gender_id" VARCHAR2(100),
    "birthday" VARCHAR2(100),
    "phone" VARCHAR2(100),
    "email" VARCHAR2(100),
    "address_id" VARCHAR2(100),
    "detail_id" VARCHAR2(100),
    PRIMARY key("id")
);

SELECT * FROM "MEMBER";

CREATE TABLE "resume" (
    "id" NUMBER(6),
    "member_id" NUMBER(6),
    "career" VARCHAR2(10),
    "portfolio" VARCHAR2(50),
    PRIMARY KEY("id"),
    FOREIGN KEY("member_id") REFERENCES "MEMBER"("id")
);

SELECT * FROM "resume";

CREATE TABLE "liecence" (
    "id" NUMBER(6),
    "resume_id" NUMBER(6),
    "title" VARCHAR2(20),
    PRIMARY KEY ("id"),
    FOREIGN KEY ("resume_id") REFERENCES "resume" ("id")
);

SELECT * FROM "liecence";

CREATE TABLE "school" (
    "id" NUMBER(6),
    "member_id" NUMBER(6),
    "level" VARCHAR2(5),
    "name" VARCHAR2(12),
    "department" VARCHAR2(15),
    "status" VARCHAR2(8),
    "grade" NUMBER(4,2),
    PRIMARY KEY ("id"),
    FOREIGN KEY ("member_id") REFERENCES "MEMBER" ("id")
);

SELECT * FROM "school";

CREATE TABLE "reg" (
    "id" NUMBER(6),
    "resume_id" NUMBER(6),
    "name" VARCHAR2(12),
    "job" VARCHAR2(8),
    "swork_day" DATE,
    "ework_day" DATE,
    PRIMARY KEY ("id"),
    FOREIGN KEY ("resume_id") REFERENCES "resume" ("id")
);

SELECT * FROM "reg";

CREATE TABLE "address" (
	"id" number(6) PRIMARY KEY,
	"district" varchar2(6)
);
SELECT * FROM "address";

CREATE TABLE "gender" (
	"id" number(6) PRIMARY KEY,
	"title" varchar2(10)
);

SELECT * FROM "gender";