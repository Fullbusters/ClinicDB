INSERT INTO `Patient` (Patient_id, First_Name,Last_Name,Date_of_Birth,Sex,Phone_Number,Info) VALUES(1, 'leodev','leodev',1888-05-15,"male",0971010310,"last");

INSERT INTO `Specialty` (Name, Info) VALUES ("name1", "info1");

INSERT INTO `Weekly_Timetable` (Start_date, End_date, Duration_Visit) VALUES ("2018-06-01 00:00","2018-06-01 13:00","15");

INSERT INTO `doctor` (Name, Phone_Number, Sex, Info) VALUES ("name", "09999", "male", "info");

INSERT INTO `Role` (Role) VALUES ("admin");
INSERT INTO `Role` (Role) VALUES ("patient");
INSERT INTO `Role` (Role) VALUES ("doctor");