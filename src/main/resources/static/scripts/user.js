// For displaying form to add contact by user

//$(".usernew").click(function(){
	 //$(".usernewdiv").addClass("userclicknewdiv");
//});

//$(".usernew").on("click", function(){
	//alert("hello");
//});

$(".navbardiv2_new").click(function(){
	 $(".usernewdiv").addClass("userclicknewdiv");
});

//-> Closing the div
$(".usernewdivclose").click(function(){	
    $(".usernewdiv").removeClass("userclicknewdiv");
    document.getElementById("usernewdivformform").reset();        
});

//End here

//Highlighting table row on selected
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
			for(let cel of r.cells){
				cel.classList.remove('active');
			}            
        }
        
        for(let cell of row.cells){
			cell.classList.add('active');
			var id =  row.cells[0].textContent;
			console.log("id= " + id);
		}             
    });
});

//End Here

//Displaying div for editing info etc on users page

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

//End here