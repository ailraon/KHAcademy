<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    #list-area{
        border: 1px solid white;
        text-align: center;
    }

    .outer a{
        color: white;
        text-decoration: none;
    }
</style>
</head>
<body>
    <jsp:include page="../common/menubar.jsp" />

    <div class="outer" align="center">
        <br>
        <h1 align="center">게시판</h1>
        <br>
        
        <div id="search-area">
        	<form action="search.bo">
        		<input type="hidden" name="cpage" value="1">
        		<select name="condition">
        			<option value="writer">작성자</option>
        			<option value="title">제목</option>
        			<option value="content">내용</option>
        		</select>
        		<input type="text" name="keyword" value="${keyword}">
        		<button type="submit">검색</button>
        	</form>
        </div>
        
        <c:if test="${not empty condition}">
        	<script>
        		const opt = document.querySelector("#search-area option[value=${condition}]");
        		opt.setAttribute("selected", true);
        	</script>
        </c:if>
        <br>

        <table id="list-area">
            <thead>
                <tr>
                    <th>글번호</th>
                    <th width="400">제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                    <th>작성일</th>
                </tr>
            </thead>
            <tbody>
               <c:forEach var="b" items="${list}">
	                <tr>
	                    <td>${b.boardNo}</td>
	                    <td>${b.boardTitle}</td>
	                    <td>${b.userId}</td>
	                    <td>${b.count}</td>
	                    <td>${b.createDate}</td>
	                </tr>
               </c:forEach>
            </tbody>
        </table>
        <br><br>
        
        <div align="center">
        	<c:choose>
        		<c:when test="${not empty condition }">
        			<c:if test="${pi.currentPage > 1}">
			            <button class="btn btn-sm btn-primary"
			            		onclick="location.href='${pageContext.request.contextPath}/search.bo?cpage=${pi.currentPage - 1}&condition=${condition}&keyword=${keyword}'">
			            &lt;이전
			            </button>
		            </c:if>
		            <c:forEach var="p" begin="${pi.startPage}" end="${pi.endPage}" >
		            	<c:choose>
		            		<c:when test="${p == pi.currentPage}">
		            			<button class="btn btn-sm btn-primary" disabled>
			            	        ${p}
			            		</button>
		            		</c:when>
		            		<c:otherwise>
		            			<button class="btn btn-sm btn-primary" onclick="location.href='${pageContext.request.contextPath}/search.bo?cpage=${p}&condition=${condition}&keyword=${keyword}'">
			            	        ${p}
			            		</button>
		            		</c:otherwise>
		            	</c:choose>
		            </c:forEach>
		            
		            <c:if test="${pi.currentPage < pi.maxPage}">
			            <button class="btn btn-sm btn-primary" 
			            		onclick="location.href='${pageContext.request.contextPath}/search.bo?cpage=${pi.currentPage + 1}&condition=${condition}&keyword=${keyword}'">
			            	다음&gt;
			            </button>
		            </c:if>
        		</c:when>
	        	<c:otherwise>
		        	<c:if test="${pi.currentPage > 1}">
			            <button class="btn btn-sm btn-primary"
			            		onclick="location.href='${pageContext.request.contextPath}/list.bo?cpage=${pi.currentPage - 1}'">
			            &lt;이전
			            </button>
		            </c:if>
		            <c:forEach var="p" begin="${pi.startPage}" end="${pi.endPage}" >
		            	<c:choose>
		            		<c:when test="${p == pi.currentPage}">
		            			<button class="btn btn-sm btn-primary" disabled>
			            	        ${p}
			            		</button>
		            		</c:when>
		            		<c:otherwise>
		            			<button class="btn btn-sm btn-primary" onclick="location.href='${pageContext.request.contextPath}/list.bo?cpage=${p}'">
			            	        ${p}
			            		</button>
		            		</c:otherwise>
		            	</c:choose>
		            </c:forEach>
		            
		            <c:if test="${pi.currentPage < pi.maxPage}">
			            <button class="btn btn-sm btn-primary" 
			            		onclick="location.href='${pageContext.request.contextPath}/list.bo?cpage=${pi.currentPage + 1}'">
			            	다음&gt;
			            </button>
		            </c:if>
        		</c:otherwise>
        	</c:choose>
        </div>
        <br><br>
    </div>
</body>
</html>