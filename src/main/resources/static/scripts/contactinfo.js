function editable(e){	
	var elements = document.getElementsByClassName("contactinfodivbodyinput");
	
	for(let element of elements){
		if(!element.disabled){
			element.disabled = true;			
		}		
	}	
	
	document.getElementById("input" + e).removeAttribute('disabled');
	document.getElementById("input" + e).focus();
	document.getElementById("input" + e).select();	
}

function saving(e){		
	var k = window.event.key;	
	
	if(k === "Enter"){
		var value = document.getElementById("input" + e).value;
		
		fetch('./edit?text='+value+'&key='+e, {
			method: 'POST',
		}).then(response => {			
			location.reload();
		}).then(error => {
			console.log("error = " + error);
		});
	}
	
}