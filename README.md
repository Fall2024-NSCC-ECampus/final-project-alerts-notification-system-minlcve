# Safety Alerts System

This project is a Spring Boot-based application that provides alerts for people by fire station. It integrates a RESTful API with a simple front-end built using HTML, CSS, and JavaScript.

## Features

- **API Endpoints**: 
    - `GET /firestation`: Fetches people by fire station number.
  
- **Front-end Interface**:
    - A simple form where users can input a fire station number to view a list of people assigned to that fire station.

## Technologies Used

- **Backend**: 
    - Java
    - Spring Boot
    - Spring Data JPA
    - Jakarta Persistence (JPA) for ORM
    
- **Frontend**:
    - HTML
    - CSS
    - JavaScript

## Project Setup

### Prerequisites

- JDK 11 or later
- Maven
- Spring Boot
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run Locally

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/safety-alerts.git
   cd safety-alerts

Access the front-end: Open a web browser and go to http://localhost:8080.

Interact with the API:

Enter a fire station number in the input field to retrieve people associated with that fire station.

<img width="482" alt="Screenshot 2024-12-09 at 3 52 28 AM" src="https://github.com/user-attachments/assets/c6b4a7a0-5641-4b2c-8abd-aab01b545c86">


1. Single Responsibility Principle (SRP)
Concept: Each class should have one responsibility, or in other words, it should have one reason to change. This makes the class easier to understand and maintain.

My Application of This Concept:
In the SafetyNet Alerts project, I ensured that each class in the application follows SRP. For example:

PersonService.java: This class is only responsible for handling operations related to persons, such as retrieving a list of children or finding a person by their name.
FireStationService.java: This service is only responsible for managing the fire station's operations, such as fetching people served by a particular fire station or retrieving phone numbers.
Each class is responsible for only one type of operation, making the code modular, easy to read, and maintain.

console and database: 

<img width="645" alt="Screenshot 2024-12-09 at 3 21 44 AM" src="https://github.com/user-attachments/assets/29fdde6b-fb73-4855-91d4-615e2087cccd">
<img width="613" alt="Screenshot 2024-12-09 at 4 45 51 AM" src="https://github.com/user-attachments/assets/d84a8eea-d424-4ae0-98dd-2c05a55ce06b">
<img width="480" alt="Screenshot 2024-12-09 at 4 45 22 AM" src="https://github.com/user-attachments/assets/cfdc1de2-583d-48da-8d8b-ff6c720146de">
<img width="544" alt="Screenshot 2024-12-09 at 4 45 39 AM" src="https://github.com/user-attachments/assets/17d4fc97-3671-442f-89ee-787ab224f9b4">
