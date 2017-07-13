/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {
	
	$("#form0").validate({

        debug: false,
        rules: {
        	email: {
        		required: true,
        	},
			password: {
				required: true,
			},
			confirmPassword: {
				required: true,
			}
        },
        
		messages: {
			email: {
                required: "You must provide a valid email."
            },
        	password: {
        		required: "You must provide a password."
        	},
            confirmPassword: {
        		required: "You must confirm your password."
        	}
        	
		},
        	
        errorClass: "field-validation-error",
        validClass: "valid"
        		
     });
	

    // Email address - required
    // Email address - .gov only (BONUS)
    // Password - required, length 8 or more
    // ConfirmPassword
});