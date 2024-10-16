 class Shape {
    constructor() {
      this.lengthSizeInInches = 0;
      this.heightSizeInInches = 0;
      this.widthSizeInInches = 0;
      this.breadthSizeInInches = 0;
      this.diameterSizeInInches = 0;
      this.PIE = 7 / 22;  
    }
  }
  
   class Rectangle extends Shape {
    constructor(heightSizeInInches, widthSizeInInches) {
      super();  
      this._validateDimensions(heightSizeInInches, width);
      this.heightSizeInInches = heightSizeInInches;
      this.widthSizeInInches = widthSizeInInches;
    }
  
     _validateDimensions(height, width) {
      if (height <= 0 || width <= 0) {
        throw new Error("Height and width must be positive numbers.");
      }
    }
  
     calculateArea() {
      return this.heightSizeInInches * this.widthSizeInInches;
    }
  
     isSquarish() {
      return this.heightSizeInInches === this.widthSizeInInches;
    }
  
     rectangleDetermining() {
      const area = this.calculateArea();
      const squarish = this.isSquarish() ? "It is squarish." : "It is not squarish.";
      return `The rectangle has a height of ${this.heightSizeInInches} inches and width of ${this.widthSizeInInches} inches. The area is ${area} square inches. ${squarish}`;
    }
  }
  
   module.exports = { Shape, Rectangle };
  