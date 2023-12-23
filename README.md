# Patient Management API

Welcome to the Patient Management API! This API is built using Java, Spring Boot, PostgreSQL, Lombok, Swagger, and JDBC Template for database interactions.

## Technologies Used

- **Java:** The programming language used for the backend logic.
- **Spring Boot:** A powerful framework for building Java-based enterprise applications.
- **PostgreSQL:** The chosen relational database for storing patient data.
- **Lombok:** A library to reduce boilerplate code in Java.
- **Swagger:** An open-source tool to generate interactive API documentation.
- **JDBC Template:** A Spring framework class for database interactions, simplifying JDBC code.

## API Endpoints

### 1. Insert Patient

- **Endpoint:** `POST /patient`
- **Description:** Add a new patient to the system.
  
### 2. Get Patient by ID

- **Endpoint:** `GET /patient/{id}`
- **Description:** Retrieve detailed information about a specific patient using their ID.
  
### 3. Update Patient

- **Endpoint:** `PUT /patient`
- **Description:** Update patient information.
  
### 4. Delete Patient by ID

- **Endpoint:** `DELETE /patient/{id}`
- **Description:** Remove a patient from the system based on their ID.
  
### 5. Get All Patients

- **Endpoint:** `GET /patients`
- **Description:** Retrieve a list of all patients in the system.
  
### 6. Get Patient by Custom ID

- **Endpoint:** `GET /patient/id/{id}`
- **Description:** Retrieve details of the specified patient using a custom ID.

## Data Model

The patient data model includes the following attributes:

- Patient ID
- Name
- Gender
- Age
- Disease

## Deployment Information

The application is deployed on AWS. You can access the API endpoints using the provided AWS URL.

## Running the Application Locally

Follow these steps to run the application locally:

1. Clone the repository: `git clone <repository-url>`
2. Open the project in your preferred IDE.
3. Run the application.

Feel free to explore and utilize the provided APIs for managing patient data. If you have any questions or issues, please don't hesitate to reach out.

Happy managing patient data!
