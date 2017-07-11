function iqTest(str){
	var numArray = str.split(" ");
	var result;
	var countEven = 0;
	var countOdd = 0;
	if(str.length == 0){
		return 0;
	}
	else{
		for(var i = 0; i < numArray.length; i++){
			if(numArray[i] % 2 == 0){
				countEven++;
			}
			if(numArray[i] % 2 != 0){
				countOdd++;
			}
		}
		if(countOdd == 0 || countEven == 0){
			return 0;
		}
		if(countOdd > 1){
			for(var i = 0; i < numArray.length; i++){
				if(numArray[i] % 2 == 0){
					result = numArray[i];
				}
			}
		}
		else{
			for(var i = 0; i <numArray.length; i++){
				if(numArray[i] % 2 != 0){
					result = i + 1;
				}
			}
		}
	}
	return result;
}

function perfectSquare(num){
	var square = Math.sqrt(num);
	if(square % 1 != 0){
		return -1;
	}
	else{
		return Math.pow(square + 1, 2);
	}
}