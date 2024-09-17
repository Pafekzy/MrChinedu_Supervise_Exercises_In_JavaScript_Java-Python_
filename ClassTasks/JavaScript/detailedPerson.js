const detailedPerson = {
    person: {
        firstName: 'Pafekzy',
        lastName: 'Ebuild',
        age: 25,
        fullDetailDisplaying() {
            let fullDetailDisplayer = this.firstName + " " + this.lastName + ", Age: " + this.age;
            console.log(`Your full details are: ${fullDetailDisplayer}`);
        }
    },
    otherValues: "Dignity"
};

detailedPerson.person.fullDetailDisplaying();
