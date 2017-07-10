QUnit.test("IQ Test", function (assert) {

    assert.equal(3, iqTest("2 4 7 8 10"));
    assert.equal(2, iqTest("1 2 1 1"));
    assert.equal(0, iqTest(""));
    assert.equal(0, iqTest("2 2 4 6"));

});

QUnit.test("Title Case", function (assert) {

    assert.equal("A Clash of Kings", titleCase("a clash of KINGS", "a an the of"));
    assert.equal("The Wind in the Willows", titleCase("THE WIND IN THE WILLOWS", "The In"));
    assert.equal("The Quick Brown Fox", titleCase("the quick brown fox"));

});

QUnit.test("Perfect Square", function (assert) {

    assert.equal(144, perfectSquare(121));
    assert.equal(676, perfectSquare(625));
    assert.equal(-1, perfectSquare(114));

});