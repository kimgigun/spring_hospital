delimiter//
drop PROCEDURE if exists sp_hello_name//
create PROCEDURE sp_hello_name(
in name varchar(100),
out rs varchar(100))
BEGIN 
 SELECT concat("HELLO", name) into rs;
 END//
 delimiter;
  
 show PROCEDURE status;
 
 set @name = 'James',@rs='';
 call sp_hello_name(@name,@rs);
 select @rs;