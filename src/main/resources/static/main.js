/**
 * 
 */

console.log("Start");

$('#lot').click(
	function(event){
		console.log("Click");
		$.ajax({
			  type: 'GET',
			  url: 'http://localhost:8080/lot/draw',
			  dataType: 'json',
			  success: function(json){
			    $('#rank').text(json.rank);
			    $('#card-value').text(json.value);
			    $('#card-image').attr('src',json.image);
			  }
			});
	}
);

function collectionAdd(json){
	$('history').append("<div></div>");
}

