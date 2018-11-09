# SpringMVC-FTJB016
initialization

ip- host
port
dbname
un
pwd


StudentDao- I
---

list all operation

StudentDaoImpl - C
-----
impl of all operations


1. connection  (load , getc connection by passing url)


Client- browser
=======================

Session
===============
map= key values
123aBCDEF
JSESSIONID=123aBCDEF


SERVER---> CLIENT

CREATE COOKIE  - CLASS

KEY - VALUES

ADD TO RESPONSE 

----

doGet
doPost(HttpServletReqesut request, HttpServletResponse response)
{
// logic check user against DB, file

HttpSession session = request.getSession(true/false);
session.setattribut("name","cts")

doLogin(HttpServletReqesut request)

@seestionattributes("name")

}