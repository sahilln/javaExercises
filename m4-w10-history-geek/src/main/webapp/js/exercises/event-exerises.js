/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {

	var sameShipping = $("#SameShipping");
	sameShipping.on("change", function(event){
		if(sameShipping.is(':checked')){
			$("#ShippingAddress1").val($("#BillingAddress1").val());
			$("#ShippingAddress2").val($("#BillingAddress2").val());
			$("#ShippingCity").val($("#BillingCity").val());
			$("#ShippingState").val($("#BillingState").val());
			$("#ShippingPostalCode").val($("#BillingPostalCode").val());
		}
	});
	
	var shippingMethod = $('input[name="ShippingType');
	shippingMethod.on("change", function (event) {
		var shippingCost = parseFloat($(this).attr('data-cost'));
		$('#shipping .price').html('$' + shippingCost);
		
		
		var subtotal = parseFloat($('#subtotal .price').html().substring(1));
	
		$('#grandtotal .price').html('$' + (subtotal + shippingCost));
	});

});