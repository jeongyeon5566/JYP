<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<jsp:include page="/WEB-INF/views/common/header.jsp">
	<jsp:param name="title" value="함께해요"/>
</jsp:include>

<jsp:include page="/WEB-INF/views/common/menuTitle.jsp">
	<jsp:param name="menuTitle" value="함께해요"/>
</jsp:include>

<!-- Start With -->
<div class="with-list-box">
	<div class="container">
		<div class="row"> 
			<div class="col-xl-5 col-lg-5 col-md-6">
				<p>총 ${totalContents }건의 게시글이 있습니다.</p>
		        <div id="pageBar">
		        	${pageBar }	        
		        </div>
				<button class="btn btn-primary" type="button" onclick="location.href='${path }/with/withEnroll.do'">등록하기</button>
			</div>
		</div>
	</div> 
</div>

<!-- End With -->

<jsp:include page="/WEB-INF/views/common/footer.jsp"/>		