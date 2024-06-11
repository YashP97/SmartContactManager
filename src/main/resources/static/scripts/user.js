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

$("#infologo").click(function(){
	window.location.href = "./contact/info";
});

$(document).ready(function(){
	console.log("Document ready");
    $("#usertable > tr > td").click(function(){
	console.log("Table ready");
        $(this).toggleClass("active");
    });
    console.log("Document ready2");
});

//$(".usercontainertabletbodytr").hover(function(){
	//$(".operationsdiv")[0].style.display="flex";
	//$(".operationsdiv")[0].style.position="absolute";
//}, 2000);


//$.get("navigation.html", function(data){
   //$("#usernavigation").replaceWith(data);
//});