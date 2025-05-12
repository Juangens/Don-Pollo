# Don Pollo

Proyecto desarrollado durante el curso de formación en **Java con Spring Boot** impartido por **GFT Technologies**.  
Este trabajo fue realizado en equipo como parte del proceso de aprendizaje intensivo en desarrollo backend con Java y frameworks modernos como Spring Boot.

---

## 🧰 Tecnologías Utilizadas

- **Java 17**  
- **Spring Boot**  
  - Spring Web (API REST)
  - Spring Data JPA
  - Spring Boot DevTools
- **Base de Datos**
  - H2 Database (en entorno de desarrollo)
  - Posible integración con MySQL/PostgreSQL (según avance del proyecto)
- **Control de Versiones**
  - Git
  - GitHub
- **Herramientas**
  - Maven (gestión de dependencias)
  - Lombok (reducción de código repetitivo)
  - Swagger UI (documentación de API REST)

---

## 📁 Estructura del Proyecto
Don-Pollo/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/donpollo/
│ │ │ ├── controller/ # Controladores REST
│ │ │ ├── model/ # Entidades JPA
│ │ │ ├── repository/ # Interfaces de acceso a datos
│ │ │ ├── service/ # Lógica de negocio
│ │ │ └── DonPolloApplication.java # Clase principal de Spring Boot
│ │ └── resources/
│ │ ├── application.properties # Configuración de la app
│ │ └── data.sql # Script de carga inicial (opcional)
│ └── test/
│ └── ... # Pruebas unitarias e integración
│
├── pom.xml # Archivo Maven de dependencias
└── README.md # Este archivo
