# springboot-task1-NTG-training

# Customer Management & Payment Processing API

This project contains two parts:

## 📌 Part 1: Customer Management REST API
A simple RESTful API for managing customer records, with the following features:
- Retrieve all customers
- Retrieve customer by ID
- Add a new customer
- Update customer by ID
- Delete customer by ID
- Filter customers by name

## 💳 Part 2: Payment Processing System
Implements a dynamic payment system that allows customers to choose a payment method.

### Features:
- `POST /payment`: Accepts:
  - Customer account number
  - Payment method (e.g., PayPal, ApplePay, Stripe)
- Uses **dynamic bean selection**  to route to the correct payment service.
- Returns a message: Customer No: {accountNumber} will pay with --> {paymentMethod}

---

> 💡 Tech Stack: Spring Boot, Java


