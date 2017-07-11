function sumDouble(num1, num2){
	var sum = num1 + num2;
	
	if(num1 == num2) {
		return sum * 2;
	}
	else{
		return sum;
	}
}

function hasTeen(num1, num2, num3){
	if(num1 >= 13 && num1 <= 19){
		return true;
	}
	else if(num2 >= 13 && num2 <= 19){
		return true;
	}
	else if(num3 >= 13 && num3 <= 19){
		return true;
	}
	else{
		return false;
	}
}

function lastDigit(num1, num2){
	return (num1 % 10 == num2 % 10);	
}

function seeColor(str){
	if(str.search("red") == 0){
		return "red";
	}
	else if(str.search("blue") == 0){
		return "blue";
	}
	else{
		return "";
	}
}

function middleThree(str){
	var length = str.length;
	var middleThree = str.substring((length/2) - 1, (length/2) + 2);
	return middleThree;
}

function frontAgain(str){ 
	return(str.substring(0,2) == str.substring(str.length -2));
}

function alarmClock(day, vacation){
	if(vacation){
		if(day == 1){
			return "10:00"; 
		}
		else if(day == 2){
			return "10:00";
		}
		else if(day == 3){
			return "10:00";
		}
		else if(day == 4){
			return "10:00";
		}
		else if(day == 5){
			return "10:00";
		}
		else if(day == 6){
			return "off";
		}
		else{
			return "off";
		}
	}
	else{
		if(day == 1){
			return "7:00"; 
		}
		else if(day == 2){
			return "7:00";
		}
		else if(day == 3){
			return "7:00";
		}
		else if(day == 4){
			return "7:00";
		}
		else if(day == 5){
			return "7:00";
		}
		else if(day == 6){
			return "10:00";
		}
		else{
			return "10:00";
		}
	}
}

function makeMiddle (numArray){
	length = numArray.length;
	var makeMiddle = [];
	if((numArray.length % 2 != 0) || (numArray.length < 2)){
		return makeMiddle;
	}
	else{
		makeMiddle[0] = numArray[length/2 - 1];
		makeMiddle[1] = numArray[length/2]
		return makeMiddle;
	}
} 

function oddOnly(numArray){
	var results = [];
	for(var i = 0; i < numArray.length; i++){
		if(numArray[i] % 2 != 0){
			results.push(numArray[i]);
		}
	}
	return results;
}

function weave(numArray1, numArray2){
	var weave = [];
	if(numArray1.length == numArray2.length){
		for(var i = 0; i < numArray1.length; i++){
			weave.push(numArray1[i]);
			weave.push(numArray2[i]);
		}
	}
	if(numArray1.length < numArray2.length){
		for(var i = 0; i < numArray1.length; i++){
			weave.push(numArray1[i]);
			weave.push(numArray2[i]); 
		}
		for(var i = numArray1.length; i < numArray2.length; i++){
			weave.push(numArray2[i]);
		}
	}
	else{
		for(var i = 0; i < numArray2.length; i++){
			weave.push(numArray1[i]);
			weave.push(numArray2[i]); 
		}
		for(var i = numArray2.length; i < numArray1.length; i++){
			weave.push(numArray1[i]);
		}
	}
	
	return weave;
}

function cigarParty(cigars, weekend){
	if(weekend){
		if(cigars >= 40){
			return true;
		}
		else{
			return false;
		}
	}
	else{
		if (cigars >= 40 && cigars <= 60){
			return true;
		}
		else{
			return false;
		}
	}
}

function stringSplosion(str){
	var results = "";
	for(var i = 1; i <= str.length; i++){
		results += str.substring(0, i);
	}
	return results;
}

function countValues(numArray) {
	var results = {};
	
	for(var i = 0; i < numArray.length; i++){
		var currentNum = numArray[i];
		var currentCount = results[currentNum];
		
		if(currentCount == undefined) {
			currentCount = 1;
		}
		else{
			currentCount++;
		}
		
		results[currentNum] = currentCount;
	}
	return results;
}

function fizzBuzz(num){
	if(num % 3 == 0 && num % 5 == 0){
		return "FizzBuzz";
	}
	else if(num % 3 == 0){
		return "Fizz";
	}
	else if(num % 5 == 0){
		return "Buzz";
	}
	else{
		return num;
	}
}

function reverseArray(numArray) {
	var result = [];
	
	for(var i = 0; i < numArray.length; i++){
		var currentNum = numArray[i];
		result[numArray.length - (i + 1)] = currentNum;
	}
	
	return result;
}