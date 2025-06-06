# 🛒 Nixonex E-commerce Automation Project

This is a capstone automation testing project developed using **Selenium WebDriver**, **Java**, **TestNG**, and **ExtentReports**, targeting the [Demoblaze](https://www.demoblaze.com) demo e-commerce website. It follows a clean **Page Object Model (POM)** design and includes complete end-to-end testing from registration to checkout.

---

## 🎯 Project Objective

To automate key user flows on an e-commerce platform, ensuring that core functionalities such as registration, login, product search, cart management, and checkout work as expected, while producing detailed HTML reports and screenshots for each run.

---

## 🧰 Tech Stack

| Tool              | Purpose                          |
|------------------|----------------------------------|
| Java              | Programming language             |
| Selenium WebDriver| UI automation with cross-browser support (Chrome & Firefox) |
| TestNG            | Test framework                   |
| Maven             | Build and dependency management  |
| ExtentReports     | Test reporting with screenshots  |
| Git & GitHub      | Version control and sharing      |

---

## 📂 Project Structure

```
NixonexEcommerce_Automation/
├── src/
│   ├── main/java/com/nixonex/pages/       # Page classes (POM)
│   ├── main/java/com/nixonex/utils/       # Utilities (Screenshot, ExtentReport)
│   ├── test/java/com/nixonex/tests/       # Test cases for each module
├── reports/                               # Extent report output
├── screenshots/                           # Screenshots on test steps/failures
├── testng.xml                             # Test suite config
├── pom.xml                                # Maven dependencies
```

---

## ✅ Test Scenarios Covered

- **RegisterTest**: New user registration and alert handling
- **LoginTest**: Valid user login
- **ProductSearchTest**: Select category and product
- **AddToCartTest**: Add selected product to cart
- **CheckoutTest**: Complete checkout with user input
- **EndToEndTest**: Full flow — register → login → purchase

---

## 🚀 How to Run

### Prerequisites:
- Java 11+ and Maven installed
- Chrome & Firefox browsers
- IDE like IntelliJ or Eclipse

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/LakshmisriAkula/NixonexEcommerce_Automation.git
   cd NixonexEcommerce_Automation
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

3. Run tests on a single browser:
   ```bash
   mvn test -Dbrowser=chrome
   ```
   or run `testng.xml` from your IDE.

---

## 📸 Reports & Evidence

- 🔍 **Extent Report**: `/reports/ExtentReport.html`
- 📸 **Screenshots**: Stored in `/screenshots` folder (for each step/failure)

---

## 📘 Final Report

Download the final project report [[here]](https://github.com/LakshmisriAkula/NixonexEcommerce_Automation/blob/main/Nixonex_Final_Project_Report.pdf)  

---

## 🙌 Author

**Lakshmisri Akula**  
**akulalakshmisri@gmail.com**


---

## 📄 License

This project is for educational/demo purposes. No commercial rights reserved.
