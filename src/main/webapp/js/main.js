window.onload = saveIndexBeforeChange;

function saveIndexBeforeChange(){
    prevVal = $("#lang").attr('selectedIndex');
}


function lanChanged(data){
		var choose=null;
			switch (data.value){
				case "zh":
					choose=confirm(" 您确定要选择中文?");
					break;
				case "en":
					choose=confirm(" Are you sure to change the language to English?");
					break;
				case "fr":
					choose=confirm("Êtes-vous sûr de vouloir sélectionner le français?");
					break;
				default:
					break;
			}	
			 
			if(choose){
			 selectedLang=data.value;
				redirectToSpecifiedLanguage(selectedLang);
			}else{
				document.getElementById("lang").selectedIndex=prevVal;
			}
		
}

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

