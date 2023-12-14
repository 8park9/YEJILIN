<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- <%@ include file="../layouts/header.jsp" %> --%>
<%-- 개별 페이지 --%>
<style>
h1 {
	display: flex;
	justify-content: center;
}

.weather {
	display: flex;
	justify-content: left;
}

.profile {
	display: flex;
	justify-content: right;
}
</style>
<h1>to-do list</h1>
<div>

	<div class="weather">날씨</div>

	<div class="profile">
		<a href="../views/profile.jsp"><img
			src="https://api.dicebear.com/7.x/thumbs/svg?size=32&seed=Simba"
			alt="profile_img"> </a>
	</div>
</div>
<%-- <%@ include file="../layouts/footer.jsp" %> --%>