<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../layout/header.jsp"%>
<h1>Detail Page</h1>
<hr />
<div>아이디가 2번인 페이지 관리자 메세지를 띄우기</div>
<c:if test="${boards.id == 2}">
	<h2>관리자</h2>
</c:if>
번호 : ${boards.id}
<br />
제목 : ${boards.title}
<br />
내용 : ${boards.content}
<br />
<hr />
<div>아이디가 1번이면 OK 출력하고 1번이 아니면 NO를 출력</div>
<c:choose>
	<c:when test="${id==1}">
		<h1>ok</h1>
	</c:when>
	<c:otherwise>
		<h1>no</h1>
	</c:otherwise>
</c:choose>
<%@ include file="../layout/footer.jsp"%>