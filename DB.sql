DROP TABLE AJAX;

CREATE TABLE "AJAX" (
	Name VARCHAR2(20),
	Age NUMBER(10),
	Gender VARCHAR2(20),
	Email VARCHAR2(20)
);

INSERT INTO AJAX VALUES ('강동현', 18, '남자', 'ss-20501@gmail.com');
INSERT INTO AJAX VALUES ('강응찬', 18, '남자', 'ss-20502@gmail.com');
INSERT INTO AJAX VALUES ('김석현', 18, '남자', 'ss-20503@gmail.com');
INSERT INTO AJAX VALUES ('홍준혁', 18, '남자', 'ss-20504@gmail.com');
INSERT INTO AJAX VALUES ('전병현', 18, '남자', 'ss-20505@gmail.com');
INSERT INTO AJAX VALUES ('김재원', 18, '남자', 'ss-20506@gmail.com');
INSERT INTO AJAX VALUES ('박건호', 18, '남자', 'ss-20507@gmail.com');
INSERT INTO AJAX VALUES ('박준형', 18, '남자', 'ss-20508@gmail.com');
INSERT INTO AJAX VALUES ('선우주', 18, '남자', 'ss-20509@gmail.com');
INSERT INTO AJAX VALUES ('성시건', 18, '남자', 'ss-20510@gmail.com');

SELECT * FROM AJAX WHERE Name = '선우주';