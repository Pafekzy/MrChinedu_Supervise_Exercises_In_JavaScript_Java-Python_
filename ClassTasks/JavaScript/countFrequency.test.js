const assert = require('assert');
const countFrequency = require('./countFrequency'); 


describe("Element Frequency Counter", function() {
    it("should return {1: 2, 2: 2, 3: 1, 4: 1} for input [1, 2, 1, 4, 3, 2, 3]", function() {
        const input = [1, 2, 1, 4, 3, 2, 3];
        const expectedOutput = {1: 2, 2: 2, 3: 2, 4: 1};
        assert.deepStrictEqual(countFrequency(input), expectedOutput);
    });

    it("should return {} for input []", function() {
        const input = [];
        const expectedOutput = {};
        assert.deepStrictEqual(countFrequency(input), expectedOutput);
    });

    it("should return {5: 3} for input [5, 5, 5]", function() {
        const input = [5, 5, 5];
        const expectedOutput = {5: 3};
        assert.deepStrictEqual(countFrequency(input), expectedOutput);
    });
});
