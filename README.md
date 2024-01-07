# Spring Boot CRUD Application Documentation

## Overview

This Spring Boot CRUD application provides a simple and efficient way to manage student records. It exposes RESTful APIs for basic CRUD operations (Create, Read, Update, Delete) on student entities.

## Technologies Used

- Java 17
- Spring Boot

## Prerequisites

Before running the application, ensure that you have the following:

- Java Development Kit (JDK) 17 or later installed.
- An integrated development environment (IDE) such as IntelliJ or Eclipse.
- [Postman](https://www.postman.com/) or any API testing tool for testing the endpoints.

## Getting Started

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/spring-boot-crud.git
Open the project in your preferred IDE.

Run the application.

Use Postman or a similar tool to test the provided endpoints.

## API Endpoints

1. Get All Students

URL: /student/getAll
Method: GET
Description: Retrieve a list of all students.

3. Add Student

- URL: /student/add
- Method: POST
- Description: Add a new student.
- Request Body: JSON representation of the student.

4. Get Student by ID

- URL: /student/{id}
- Method: GET
- Description: Retrieve a specific student by ID.
- Path Variable: id - ID of the student.

5. Update Student

- URL: /student/{id}
- Method: PUT
- Description: Update a specific student by ID.
- Path Variable: id - ID of the student.
- Request Body: JSON representation of the updated student.

6. Delete Student

- URL: /student/{id}
- Method: DELETE
- Description: Delete a specific student by ID.
- Path Variable: id - ID of the student.
