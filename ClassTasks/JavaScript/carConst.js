const car = {
  make: "Toyota",
  model: "Camry",
  year: 2021
};

function logObjectProperties(obj) {
  for (let property in obj) {
    console.log(`${property}: ${obj[property]}`);
  }
}

logObjectProperties(car);
make: Toyota
model: Camry
year: 2021


