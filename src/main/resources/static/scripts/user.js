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

$(".usercontainertabletbodytr").click(function(){
	$(".usercontainertabletbodytr").style.backgroundColor="yellow";
});

//$.get("navigation.html", function(data){
   //$("#usernavigation").replaceWith(data);
//});