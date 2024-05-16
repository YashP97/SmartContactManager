//$.get("navigation.html", function(data){
    ///$("#usernavigation").replaceWith(data);
});

$(".usernew").click(function(){
	 $(".usernewdiv").addClass("userclicknewdiv");
});

//$(".usernew").on("click", function(){
	//alert("hello");
//});

$(".usernewdivclose").click(function(){	
    $(".usernewdiv").removeClass("userclicknewdiv");
    document.getElementById("usernewdivformform").reset();        
});