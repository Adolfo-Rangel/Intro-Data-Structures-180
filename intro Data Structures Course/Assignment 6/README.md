# Assignment 6: Appointment Queue System

## **Overview**
This project is a Java application designed to manage appointments using a custom **queue** implementation. It demonstrates the use of **file handling**, **data structures (Queue and Hash Table)**, and **object-oriented programming (OOP)** principles. The program processes appointment data from a file, interacts with users via a GUI (`JOptionPane`), and organizes data dynamically in a queue.

---

## **Features**
1. **Appointment Queue Management**:
   - Appointments are read from a file and stored in a dynamically resizing queue.
   - Appointments are sorted based on their time during insertion.

2. **User Interaction**:
   - Users input their names via `JOptionPane` to check if they are next in line.
   - Displays whether the user is ready to be served or needs to wait.

3. **File Handling**:
   - Reads appointment data from `DMV_Appointments.txt`.
   - Parses data into `Appointment` objects and adds them to the queue.

4. **Hash Table for Employee Data**:
   - Reads and stores employee information (ID and name) from `employee.txt` into a hash table.
   - Demonstrates basic hash table operations (insertion and retrieval).

---

## **How It Works**
1. **File Input**:
   - Reads appointments from `DMV_Appointments.txt`:
     ```
     Name,Reason,Time
     Alice,Registration,900
     Bob,Renewal,930
     Charlie,License,945
     ```
   - Parses the data into `Appointment` objects and adds them to a queue in sorted order.

2. **Queue Operations**:
   - **Push**: Adds new appointments to the queue in sorted order based on time.
   - **Pop**: Removes and serves the next appointment in line.
   - **IsEmpty**: Checks if the queue is empty.

3. **User Interaction**:
   - Prompts users to input their names and checks if they match the next appointment.
   - Displays whether the user is ready to be served or needs to wait.

4. **Employee Hash Table**:
   - Reads `employee.txt`:
     ```
     101,John Doe
     102,Jane Smith
     ```
   - Stores employee data in a hash table and prints it for verification.

---
