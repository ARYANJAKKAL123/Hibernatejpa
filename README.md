# 🏫 School Management System (Hibernate + JPA + PostgreSQL)

This is a simple **School Management System** built using **Java**, **Hibernate (JPA)**, and **PostgreSQL**. It demonstrates how to manage students, teachers, and subjects using object-relational mapping (ORM).

---

## 🚀 Features

- Add and manage **Students**
- Add and manage **Teachers**
- Add and manage **Subjects**
- Basic database operations using **JPA (Java Persistence API)**
- Uses **PostgreSQL** as the backend database
- Simple and beginner-friendly code structure

---

## 🧰 Tech Stack

- Java 8+
- Hibernate (JPA implementation)
- PostgreSQL
- Maven

---

## 📂 Project Structure

SchoolManagementHibernate/
│
├── src/
│ └── main/
│ ├── java/
│ │ └── schoolmanagement/
│ │ ├── Main.java
│ │ ├── Student.java
│ │ ├── Teacher.java
│ │ └── Subject.java
│ └── resources/
│ └── META-INF/
│ └── persistence.xml
│
├── pom.xml


---

## ⚙️ Database Configuration

Update the following fields inside `src/main/resources/META-INF/persistence.xml`:

```xml
<property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/presidency"/>
<property name="javax.persistence.jdbc.user" value="postgres"/>
<property name="javax.persistence.jdbc.password" value="ARYANJAKKAL"/>


📦 How to Run
Clone or extract the project

Open in your IDE (e.g., IntelliJ, Eclipse)

Make sure PostgreSQL is running

Run the Main.java file to test insert operations

Use mvn clean install if needed to resolve dependencies

💡 Sample Output

Hibernate: insert into Student ...
Hibernate: insert into Teacher ...
Hibernate: insert into Subject ...

MEMBERS:
       1)ARYAN JAKKAL
       2)GOURIPRASAD TUMMA
       3)ARYA HARIDAS
