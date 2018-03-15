window.onload = saveIndexBeforeChange;

function saveIndexBeforeChange(){
    prevVal = $("#lang").attr('selectedIndex');
}



function changeLang(selectElement){
	var paramPrefix="?lang=";
	var langValue = selectElement.value;
	//alert(langValue);
	window.location = paramPrefix+langValue; 
	
	//$("#selectLang").val(langValue);
}

/*

function lanChanged(data){
	alert(1)
		var choose=null;
			switch (data.value){
				case "zh_CN":
					choose=confirm(" 您确定要选择中文?");
					break;
				case "en_US":
					choose=confirm(" Are you sure to change the language to English?");
					break;
				case "fr_CA":
					choose=confirm("Êtes-vous sûr de vouloir sélectionner le français?");
					break;
				default:
					break;
			}	
			 
			if(choose){
			 selectedLang=data.value;
				//redirectToSpecifiedLanguage(selectedLang);
			 var data={"selectedLang":selectedLang};
			 $.ajax({ 
		            type: "POST",
		            url: "./lang/change",
		            data: data,
		            contentType: "application/x-www-form-urlencoded"
		        });
			 
			}else{
				document.getElementById("lang").selectedIndex=prevVal;
			}
		
}
*/
function redirectToSpecifiedLanguage(selectedLang){

		var currentPage =location.href.split('athensoft/')[1];
			currentPage=currentPage.split('.html')[0];
			
			currentPage=currentPage.split('_')[0];

			if(currentPage=="test"){
				
			window.location.href=currentPage+'.html?lang='+selectedLang;
	
			}else{
			window.location.href=currentPage+'_'+selectedLang+'.html?lang='+selectedLang;
				
			}
		
}

