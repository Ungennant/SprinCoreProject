<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Registration</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<body>
<div>
    <h3>Student registration</h3>

    <form id="uploadStudent" name="registration" action="uploadStudent" method="post" enctype="multipart/form-data">
        <label>First Name<br><input id="firstName" type="text" name="firstName"></label>
        <br>
        <label>Last Name<br><input id="lastName" type="text" name="lastName"></label>
        <br>
        <label>Age<br> <input type="number" id="age" name="age"></label>
        <br><br>
        <input id="singleFileUploadInput" type="file" name="file" required/>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>