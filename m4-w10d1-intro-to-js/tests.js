QUnit.test("Sum Double", function (assert) {
    
    assert.equal(3, sumDouble(1, 2));
    assert.equal(5, sumDouble(3, 2));
    assert.equal(8, sumDouble(2, 2));

});

QUnit.test("Has Teen", function (assert) { 
    
    assert.equal(true, hasTeen(13, 20, 10));
    assert.equal(true, hasTeen(20, 19, 10));
    assert.equal(true, hasTeen(20, 10, 13));
    assert.equal(false, hasTeen(9, 21, 5));

});

QUnit.test("Last Digit", function (assert) {
    
    assert.equal(true, lastDigit(7, 17));
    assert.equal(false, lastDigit(6, 17));
    assert.equal(true, lastDigit(3, 113));

});

QUnit.test("See Color", function (assert) {

    assert.equal("red", seeColor("redxx"));
    assert.equal("", seeColor("xxred"));
    assert.equal("blue", seeColor("blueTimes"));
    assert.equal("blue", seeColor("blue"));
    assert.equal("", seeColor(""));

});

QUnit.test("Middle Three", function (assert) {    
    assert.equal("and", middleThree("Candy"));
    assert.equal("AND", middleThree("CANDY"));
    assert.equal("and", middleThree("and"));
    assert.equal("lvi", middleThree("solving"));
});

QUnit.test("Front Again", function (assert) {    
    assert.equal(true, frontAgain("edited"));
    assert.equal(false, frontAgain("edit"));
    assert.equal(true, frontAgain("ed"));
    assert.equal(false, frontAgain("Edited"));
});

QUnit.test("Alarm Clock", function (assert) {
    
    assert.equal("7:00", alarmClock(1, false));
    assert.equal("7:00", alarmClock(5, false));
    assert.equal("10:00", alarmClock(5, true));
    assert.equal("off", alarmClock(0, true));

});

QUnit.test("Make Middle", function (assert) {    
    assert.deepEqual([2, 3], makeMiddle([1, 2, 3, 4]));
    assert.deepEqual([2, 3], makeMiddle([7, 1, 2, 3, 4, 9]));
    assert.deepEqual([], makeMiddle([]));
    assert.deepEqual([], makeMiddle([1]));
    assert.deepEqual([], makeMiddle([1, 3, 5]));
    assert.deepEqual([1, 2], makeMiddle([1, 2]));
});

QUnit.test("Odd Only", function (assert) {    
    assert.deepEqual([1, 3, 5, 7, 9, 11], oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]));
    assert.deepEqual([], oddOnly([2, 4, 8, 32, 256]));
});

QUnit.test("Weave", function (assert) {
    
    assert.deepEqual([1, 2, 3, 4, 5], weave([1, 3, 5], [2, 4]));
    assert.deepEqual([1, 2, 3, 4, 5, 6, 8], weave([1, 3, 5], [2, 4, 6, 8]));
    assert.deepEqual([], weave([], []));

});

QUnit.test("Cigar Party", function (assert) {
    
    assert.equal(false, cigarParty(30, false));
    assert.equal(true, cigarParty(50, false));
    assert.equal(true, cigarParty(70, true));
    
});

QUnit.test("String Splosion", function (assert) {

    assert.equal("CCoCodCode", stringSplosion("Code"));
    assert.equal("ssusupsupesupersupercsupercasupercalsupercalisupercalifsupercalifrsupercalifrasupercalifragsupercalifragisupercalifragilsupercalifragilisupercalifragilissupercalifragilistsupercalifragilistisupercalifragilisticsupercalifragilisticesupercalifragilisticexsupercalifragilisticexpsupercalifragilisticexpisupercalifragilisticexpiasupercalifragilisticexpialsupercalifragilisticexpialisupercalifragilisticexpialidsupercalifragilisticexpialidosupercalifragilisticexpialidocsupercalifragilisticexpialidocisupercalifragilisticexpialidociosupercalifragilisticexpialidociousupercalifragilisticexpialidocious", stringSplosion("supercalifragilisticexpialidocious"));

});

QUnit.test("Fizz Buzz", function (assert) {

    assert.equal(1, fizzBuzz(1));
    assert.equal(2, fizzBuzz(2));
    assert.equal("Fizz", fizzBuzz(3));
    assert.equal("Buzz", fizzBuzz(5));
    assert.equal("Fizz", fizzBuzz(9));
    assert.equal("Buzz", fizzBuzz(10));
    assert.equal("FizzBuzz", fizzBuzz(15));

});

QUnit.test("Count Values", function (assert) {

    assert.deepEqual(
        { 1: 1, 99: 3, 43: 1, 2: 2, 55: 1, 78: 1, 2345: 1, 438: 1, 107: 1 },
        countValues([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107]));

    assert.deepEqual({}, countValues([]));
    assert.deepEqual({ 0: 1 }, countValues([0]));
    assert.deepEqual({ 0: 1, 20: 1 }, countValues[0, 20]);
});

QUnit.test("Reverse Array", function (assert) {

    assert.deepEqual([1, 3, 9, 1], reverseArray([1, 9, 3, 1]));
    assert.deepEqual([], reverseArray([]));
    assert.deepEqual([1, 1, 1], reverseArray([1, 1, 1]));
    assert.deepEqual([9], reverseArray([9]));

});






