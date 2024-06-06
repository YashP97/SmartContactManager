//$(".usernew").click(function(){
	 //$(".usernewdiv").addClass("userclicknewdiv");
//});

//$(".usernew").on("click", function(){
	//alert("hello");
//});

$(".navbardiv2_new").click(function(){
	 $(".usernewdiv").addClass("userclicknewdiv");
});

$(".usernewdivclose").click(function(){	
    $(".usernewdiv").removeClass("userclicknewdiv");
    document.getElementById("usernewdivformform").reset();        
});

$(".usercontainertabletbodytr").mouseenter(function(){	
	$(".operationsdiv")[0].style.display="flex";
	$(".operationsdiv")[0].style.position="absolute";
	
});

$(".usercontainertabletbodytr").mouseout(function(){	
	$(".operationsdiv")[0].style.display="none";	
});

//$(".usercontainertabletbodytr").hover(function(){
	//$(".operationsdiv")[0].style.display="flex";
	//$(".operationsdiv")[0].style.position="absolute";
//})


//$.get("navigation.html", function(data){
   //$("#usernavigation").replaceWith(data);
//});