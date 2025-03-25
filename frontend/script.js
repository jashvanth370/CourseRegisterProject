function showCourses() {
    fetch("http://localhost:8090/courses") //API End point
        .then((response) => response.json())
        .then((courses) => {
            const dataTable = document.getElementById("coursetable")

            courses.forEach(course => {
                var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>
            </tr>`

                dataTable.innerHTML += row;
            });
        });
}

function showEndrolledCourses(){
    fetch("http://localhost:8090/courses/endrolled")
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("endrollcoursetable")

        courses.forEach(course => {
            var row = `<tr>
        <td>${course.id}</td>
        <td>${course.name}</td>
        <td>${course.emailId}</td>
        <td>${course.courseName}</td>
        </tr>`

            dataTable.innerHTML += row;
        });
    });
}