/**
 * 
 */

$(function() {
	$('#add-brew').click(
			function() {
				console.log($('#brewName').val());
				console.log($('#batchNumber').val());
				console.log($('#measuredVolume').val());
				var nohl = $('#numberOfhalfLiter').val();
				console.log(nohl);
				console.log($('#numberOfZeroPointThreeLiter').val());
				console.log($('#literInKeg').val());
				$.ajax({
					url : BASE_URL + 'addBrew',
					data : {
						brewName : $('#brewName').val(),
						batchNumber : $('#batchNumber').val(),
						measuredVolume : $('#measuredVolume').val(),
						numberOfhalfLiter : nohl,
						numberOfZeroPointThreeLiter : $(
								'#numberOfZeroPointThreeLiter').val(),
						literInKeg : $('#literInKeg').val()
					},
					method : 'POST',
					success : function() {
						console.log('success');
					},
					error : function(xhr, ajaxOptions, thrownError) {
						console.log(xhr.status);
						console.log(thrownError);
						console.log('error');
					}
				});

			});

});