<h1>Project Description:</h1>
The project is a Spring Boot application that performs various mathematical calculations asynchronously using ExecutorService. It includes methods to calculate square, cube, factorial, Armstrong number, palindrome, even/odd, prime number, and reverse of a number.
<h3>Controller Layer:</h3>

Receives HTTP requests from clients and routes them to appropriate methods.
Methods include:

<ul>
  <li>GET /run:Triggers the execution of all calculation tasks asynchronously.</li>
</ul>
<h3>Service Layer:</h3>

Contains business logic for performing mathematical calculations.
Methods include:
<ul>
  <li>executeTasks(): Executes all calculation tasks using ExecutorService.</li>
</ul>

<h3>Utility Methods:</h3>

Provides utility methods for:

<ul>
    <li>square(int number): Computes the square of a number.</li>
    <li>cube(int number): Computes the cube of a number.</li>
    <li>factorial(int number): Computes the factorial of a number.</li>
    <li>isArmstrong(int number): Checks if a number is an Armstrong number.</li>
    <li>isPalindrome(int number): Checks if a number is a palindrome.</li>
    <li>isEven(int number): Checks if a number is even.</li>
    <li>isPrime(int number): Checks if a number is prime.</li>
    <li>reverse(int number): Reverses a given number.</li>
</ul>

<h3>Logging:</h3>
SLF4J logging is used for capturing application logs.

<h3>Testing:</h3>
Unit tests for utility methods are implemented using JUnit 5 and Mockito.

<h1>Build Steps</h1>
1) Ensure you have Java Development Kit (JDK) 8 or higher installed.
2) Clone the repository from GitHub:

   ```bash
   git clone <repository_url>
   cd <project_directory>
   ```
3) Navigate to the project root directory.
4) Build the project using Maven:
   <ul>
     <li>mvn clean install</li>
   </ul>

<h1>Execution Steps</h1>
1) After building the project, ensure your environment is set up correctly.
Run the Spring Boot application:
  <ul>
    <li>mvn spring-boot:run</li>
  </ul>
Once the application starts, you can trigger the calculation tasks by accessing the endpoint:
  <ul>
    <li>GET http://localhost:8080/run</li>
  </ul>
