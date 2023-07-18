<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chat rooms</title>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
 <script>
            $(document).ready(function(){

                var createRoomMsg = "${createRoomMsg}";

                if(createRoomMsg != null && createRoomMsg != "")
                    alert(createRoomMsg + "방이 개설되었습니다.");

                $(".btn-create").on("click", function (e){
                    e.preventDefault();

                    var name = $("input[name='name']").val();

                    if(name == "")
                        alert("Please write the name.")
                    else
                        $("form").submit();
                });

            });
        </script>
</head>
<body>
	<h1>Chat rooms</h1>
    <form action="/chat/room" method="post">
        <input type="text" name="name" class="form-control">
        <button class="btn btn-secondary">개설하기</button>
    </form>
    

	<ul>
	<c:if test="${!empty list}">
		<c:forEach var="chatRoom" items="${list }">	
			<li>
				<a href="/chat/room?room_id=${chatRoom.room_id }">${chatRoom.room_title }</a>
			</li>
		</c:forEach>
	</c:if>
	</ul>
</body>
</html>