/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {
	$('#BillingPostalCode').on('blur', function(event) {
		var subtotal = parseFloat($('#subtotal .price').html().substring(1));
		$.ajax({
			url: "http://localhost:8080/m4-java-historygeek-exercises/api/getTax?billingZipCode=" + $("#BillingZipCode").val() + "&subtotal=" + subtotal,
			type: "GET",
			dataType: "json"
		}).done(function(data) {
			var tax = data;
			$('#tax .price').html(tax);
		});
	});
});