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