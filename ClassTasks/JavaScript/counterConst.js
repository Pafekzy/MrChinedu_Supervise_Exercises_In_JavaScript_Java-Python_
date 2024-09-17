const counter = {
  count: 0,  
  step: 1,   

  increment() {
    this.count += this.step; 
    console.log(`Count at this point is: ${this.count}`);
  }
};

counter.increment();  
counter.increment();  

counter.step = 5;
counter.increment();  

    console.log(`Count is now: ${this.count}`);

