<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            width: 900px;
            height: auto;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .profile {
            display: flex;
            flex-direction: column;
            gap: 15px;
            align-items: center;
        }
        .profile-item {
            display: flex;
            justify-content: space-between;
            width: 100%;
            padding: 8px 0;
            border-bottom: 1px solid #ddd;
            font-size: 18px;
        }
        .profile-item label {
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Employee Profile</h2>
        <div class="profile">
            <div class="profile-item"><label>Name:</label> <span>${name}</span></div>
            <div class="profile-item"><label>Email:</label> <span>${email}</span></div>
            <div class="profile-item"><label>Phone:</label> <span>${contact}</span></div>
            <div class="profile-item"><label>Department:</label> <span>${department}</span></div>
            <div class="profile-item"><label>Position:</label> <span>${position}</span></div>
            <div class="profile-item"><label>Joining Date:</label> <span>${Joining}</span></div>
            <div class="profile-item"><label>Salary:</label> <span>${salary}</span></div>
            <div class="profile-item"><label>Address:</label> <span>${address}</span></div>
            <div class="profile-item"><label>Date of Birth:</label> <span>${dob}</span></div>
            <div class="profile-item"><label>city :</label> <span>${city}</span></div>
            <div class="profile-item"><label>State :</label> <span>${state}</span></div>
        </div>
    </div>
</body>
</html>
