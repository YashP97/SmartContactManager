// For displaying form to add contact by user

//$(".usernew").click(function(){
//$(".usernewdiv").addClass("userclicknewdiv");
//});

//$(".usernew").on("click", function(){
//alert("hello");
//});


$(".navbardiv2_new").click(function() {
	//$(".usernewdiv").addClass("userclicknewdiv");	
	$(".usernewdiv")[0].style.display = "flex";
});

//-> Closing the div
$(".usernewdivclose").click(function() {
	//$(".usernewdiv").removeClass("userclicknewdiv");
	$(".usernewdiv")[0].style.display = "none";	
	document.getElementById("usernewdivformform").reset();
});

//End here

//Highlighting table row on selected
var id = "";
document.addEventListener('DOMContentLoaded', () => {
	const table = document.getElementById('usertable');

	table.addEventListener('click', (e) => {
		let target = e.target;


		while (target && target.nodeName !== 'TD') {
			target = target.parentElement;
		}

		if (!target) return;


		const row = target.parentElement;

		for (let r of table.rows) {
			for (let cel of r.cells) {
				cel.classList.remove('active');
			}
		}

		for (let cell of row.cells) {
			cell.classList.add('active');
			id = row.cells[0].textContent;
		}
	});
});
//Highlighting code ends

//Displaying div for editing info etc on users page
$(".usercontainertabletbodytr").mouseenter(function() {
	$(".operationsdiv")[0].style.display = "flex";
	//$(".operationsdiv")[0].style.position="absolute";	
});

$(".usercontainertabletbodytr").mouseout(function() {
	$(".operationsdiv")[0].style.display = "none";
});

$("#infologo").click(function() {
	//if(id.toString)
	window.location.href = "./contact/info?id=" + id;
});

$("#editlogo").click(function() {
	window.location.href = "./contact/edit?id=" + id;
});

$("#deletelogo").click(function() {
fetch('./contact/delete?id=' + id, {
  method: 'DELETE',    
}).then(response => {
	location.reload();
	console.log("response = " + response.text);
}).then(error => {
	location.reload();
	console.log("error = " + error);
})
	
	//window.location.href = "./contact/delete?id=" + id;
});
//End here