const assert = require('assert');
const { Shape, Rectangle } = require('./shape');  

describe('Shape and Rectangle Class Tests', () => {

  describe('Shape Class Properties', () => {
    it('should initialize default properties in Shape class', () => {
      const shape = new Shape();
      assert.strictEqual(shape.lengthSizeInInches, 0);
      assert.strictEqual(shape.heightSizeInInches, 0);
      assert.strictEqual(shape.widthSizeInInches, 0);
      assert.strictEqual(shape.breadthSizeInInches, 0);
      assert.strictEqual(shape.diameterSizeInInches, 0);
      assert.strictEqual(shape.PIE, 7/22);
    });
  });

  describe('Rectangle Class', () => {

    it('should initialize Rectangle with height and width at their correct position', () => {
      const rectangle = new Rectangle(10, 5);
      assert.strictEqual(rectangle.heightSizeInInches, 10);
      assert.strictEqual(rectangle.widthSizeInInches, 5);
    });

    it('should calculate the area of the rectangle correctly', () => {
      const rectangle = new Rectangle(10, 5);
      const area = rectangle.calculateArea();
      assert.strictEqual(area, 50);
    });

    it('should identify a rectangle as "squarish" if height and width are the same', () => {
      const rectangle = new Rectangle(5, 5);
      const isSquarish = rectangle.isSquarish();
      assert.strictEqual(isSquarish, true);
    });

    it('should identify a rectangle as "not squarish" if height and width are different', () => {
      const rectangle = new Rectangle(10, 5);
      const isSquarish = rectangle.isSquarish();
      assert.strictEqual(isSquarish, false);
    });

    it('should display the details of the rectangle in a structured sentence', () => {
      const rectangle = new Rectangle(10, 5);
      const details = rectangle.rectangleDetermining();
      assert.strictEqual(details, 'The rectangle has a height of 10 inches and width of 5 inches. The area is 50 square inches. It is not squarish.');
    });

    it('should display the details for a squarish rectangle in a structured sentence', () => {
      const rectangle = new Rectangle(7, 7);
      const details = rectangle.rectangleDetermining();
      assert.strictEqual(details, 'The rectangle has a height of 7 inches and width of 7 inches. The area is 49 square inches. It is squarish.');
    });

    it('should throw an error if negative height or width is provided', () => {
      assert.throws(() => new Rectangle(-10, 5), Error, "Height and width must be positive numbers.");
      assert.throws(() => new Rectangle(10, -5), Error, "Height and width must be positive numbers.");
    });
  });
});
