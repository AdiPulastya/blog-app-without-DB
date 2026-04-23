# blog-app-without-DB
It is a learning springboot project for creating RestApis and performing Curd operations without using any DataBase
# 📝 Blog App (Spring Boot REST API)

A backend **Blog Application** built using **Spring Boot**, providing REST APIs to create and manage blog articles.

This project demonstrates clean API design, layered architecture, and scalable backend development.


## 🚀 Tech Stack

* Java 21
* Spring Boot
* Maven
* Lombok
* Spring Web (REST APIs)


## 📌 Features

* Create blog articles
* Fetch all articles
* Get article by ID
* Simple REST API structure
* Ready to extend with database (JPA/Hibernate)


## 🧱 Architecture
Controller → Service → Repository → Model

## 📂 Project Structure
src/main/java/com/example/blogapp/
├── controller/
├── service/
├── repository/
├── model/

## 🔗 API Endpoints

### 1. Create Article

http
POST /api/v1/article/create

**Response:**
json
"Article is created"

### 2. Get All Articles
http
GET /api/v1/article

### 3. Get Article by ID
http
GET /api/v1/article/{id}
## ▶️ How to Run

### 1. Clone repository
bash
git clone https://github.com/your-username/blog-app.git
cd blog-app
### 2. Build project
bash
mvn clean install
### 3. Run application
bash
mvn spring-boot:run
### 4. Open in browser / Postman
text
http://localhost:8080

## 🧪 Testing APIs
Use tools like:
* Postman
* cURL

Example:
bash
curl -X POST http://localhost:8080/api/v1/article/create

## ⚙️ Configuration
Edit properties here:
src/main/resources/application.properties
## 🔮 Future Improvements

* Add database (MySQL / PostgreSQL)
* Implement full CRUD operations
* Add authentication (JWT)
* Add Swagger documentation
* Add validation & exception handling

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first.

## 👨‍💻 Author

Aditya Kumar

## ⭐ Show Your Support

If you like this project, give it a ⭐ on GitHub!
