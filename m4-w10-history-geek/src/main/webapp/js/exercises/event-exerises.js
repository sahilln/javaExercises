/// <reference path="../jquery-3.1.1.js" />

$(document)
		.ready(
				function() {

					var sameShipping = $("#SameShipping");
					sameShipping.on("change", function(event) {
						if (sameShipping.is(':checked')) {
							$("#ShippingAddress1").val(
									$("#BillingAddress1").val());
							$("#ShippingAddress2").val($("#BillingAddress2").val());
							$("#ShippingCity").val($("#BillingCity").val());
							$("#ShippingState").val($("#BillingState").val());
							$("#ShippingPostalCode").val($("#BillingPostalCode").val());
						}
					});

					var shippingMethod = $('input[name="ShippingType');
					shippingMethod.on("change",
							function(event) {
								var shippingCost = parseFloat($(this).attr(
										'data-cost'));
								$('#shipping .price').html('$' + shippingCost);

								var subtotal = parseFloat($('#subtotal .price')
										.html().substring(1));

								$('#grandtotal .price').html(
										'$' + (subtotal + shippingCost));
							});

					$(document)
							.keydown(
									function(e) {

										switch (e.which) {

										case 37: // left

											$('.ship').prev().addClass("ship");

											$('.ship').next().removeClass(
													"ship");

											if ($('.ship').hasClass("treasure")) {

												alert("You've got your booty!");

												$(".ship").removeClass("ship");

											}

											if ($('.ship').hasClass("iceberg")) {

												alert("You lost, but maybe you'll be in the movie!");

												$(".ship").removeClass("ship");

											}

											if ($('.ship').hasClass("pirate")) {

												alert("You lost, and pirates never take prisoners!");

												$(".ship").removeClass("ship");

											}

											break;

										case 38: // up

											$('.ship').parent().prev()
													.children().eq(
															$('.ship').index())
													.addClass('ship');

											$('.ship').parent().next()
													.children().eq(
															$('.ship').index())
													.removeClass('ship');

											if ($('.ship').hasClass("treasure")) {

												alert("You've got your booty!");

												$(".ship").removeClass("ship");

											}

											if ($('.ship').hasClass("iceberg")) {

												alert("You lost, but maybe you'll be in the movie!");

												$(".ship").removeClass("ship");

											}

											if ($('.ship').hasClass("pirate")) {

												alert("You lost, and pirates never take prisoners!");

												$(".ship").removeClass("ship");

											}

											break;

										case 39: // right

											$('.ship').next().addClass("ship");

											$('.ship').prev().removeClass(
													"ship");

											if ($('.ship').hasClass("treasure")) {

												alert("You've got your booty!");

												$(".ship").removeClass("ship");

											}

											if ($('.ship').hasClass("iceberg")) {

												alert("You lost, but maybe you'll be in the movie!");

												$(".ship").removeClass("ship");

											}

											if ($('.ship').hasClass("pirate")) {

												alert("You lost, and pirates never take prisoners!");

												$(".ship").removeClass("ship");

											}

											break;

										case 40: // down

											var ship = $('.ship');

											var nextRow = $('.ship').parent()
													.next();

											if (nextRow.length > 0) {

												$('.ship').parent().next()
														.children()
														.eq($('.ship').index())
														.addClass('ship');

												ship.removeClass('ship');

												if ($('.ship').hasClass(
														"treasure")) {

													alert("You've got your booty!");

													$(".ship").removeClass(
															"ship");

												}

												if ($('.ship').hasClass(
														"iceberg")) {

													alert("You lost, but maybe you'll be in the movie!");

													$(".ship").removeClass(
															"ship");

												}

												if ($('.ship').hasClass(
														"pirate")) {

													alert("You lost, and pirates never take prisoners!");

													$(".ship").removeClass(
															"ship");

												}

											}

											break;

										}

										var gameReset = $("#btnRestart");

										gameReset.on("click", function(event) {

											$("h2").text("You've broken it!");

											$(".ship").removeClass("ship");

											$("td#row_0_column_0.gamecell")
													.addClass("ship");

										});

									});

				});