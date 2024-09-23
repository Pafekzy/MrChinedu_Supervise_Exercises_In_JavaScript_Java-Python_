function filterAfternoonClasses(classTimings) {
    return classTimings.filter(time => time.includes("PM"));
}

module.exports = filterAfternoonClasses;
