<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
.register-container{
	display: grid;
	grid-template-columns: auto auto auto ;
	padding: 5px;
	background-color: #FFE08C;
	width: 1000px;
	margin: 0px auto;
}
.register-item {
  background-color: rgba(255, 255, 255, 0.8);
  border: 1px solid rgba(0, 0, 0, 0.8);
  padding: 20px;
  font-size: 20px;
  text-align: center;
}
#register-item2{
	grid-column-start: 2;
	grid-column-end: 4;
}
#register-item4{
	grid-column-start: 2;
	grid-column-end: 4;
}
#register-item6{
	grid-column-start: 2;
	grid-column-end: 4;
}
#register-item8{
	grid-column-start: 2;
	grid-column-end: 4;
}
#register-item10{
	grid-column-start: 2;
	grid-column-end: 4;
}
#register-item11{
	grid-column-start: 1;
	grid-column-end: 3;
}

</style>

<div style="height: 50px">사원등록</div>
<form action="">
<div class="register-container">
	<div class="register-item" id="register-item1">사원번호</div>
	<div class="register-item" id="register-item2">
		<input type="text" class="" name="id"  />
	</div>
	<div class="register-item" id="register-item3">이름</div>
	<div class="register-item" id="register-item4">
		<input type="password" name="pass"  />
	</div>
	<div class="register-item" id="register-item5">매니저</div>
	<div class="register-item" id="register-item6">
		<input type="text" name="name"  />
	</div>
	<div class="register-item" id="register-item7">생년월일</div>
	<div class="register-item" id="register-item8">
		<input type="text" name="ssn"  />
	</div>
	<div class="register-item" id="register-item9">상세</div>
	<div class="register-item" id="register-item10">
		<input type="text" name="height" />
	</div>
	<div class="register-item" id="register-item11">
		<input type="submit" id="confirm_btn" value="등록"/>
	</div>
	<div class="register-item" id="register-item12">
		<input type="reset" id="cancel_btn" value="취소"/>
	</div>
</div>
</form>
<script>
$('#confirm_btn').click(function(){
	alert('확인버튼 클릭!!');
});

$('#cancel_btn').click(function(){
	alert('리셋버튼 클릭!');
});
</script>	
