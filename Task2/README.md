# N26Task

Task 3.
API Testing

This is a maven project. All necessary dependencies was added(Testng assertion,restassured library)

Java language(version 8) has been used.

Build up with the TestNG framework

Page Object Model design pattern has been used which has Pom.xml,Configuration properties,Configuration readers,pages,Utilities. 
The task is not so long and it was only api testing for that reason I haven’t used Configuration properties,Configuration readers,pages and Utilities.

Pom.xml is the brain of our project. I put all kinds of dependencies and libraries that are needed. 

I run my tests in localhost(http://localhost:3030) and to be able to use that I did some installation.
First of all I did installed NodeJS  (required version 4 or newer).
Then through Terminal I followed these steps one by one.
git clone https://github.com/bestbuy/api-playground/
cd api-playground
npm install
npm start

After done this I had an information as "Best Buy API Playground started at http://localhost:3030" and after that I was able to use it in my local.

I used Swagger documentation for execute my automaion test cases. 
But before each automation testing I did that particular test manually in my postman to see expected results.

I implemented two ways in post method. Firstly I used Map structure to add data and second way I created a custom java class and with object of that class I add data necesaary for posting.

All tests are run properly but get, patch,delete methods cannot be run for the second time because after each post a unique ID is created and  all other methods done by using id number as path parameter.



