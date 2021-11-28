# N26Task

Task 1
Exploratory Testing


Explore target:I conducted an exploratory test to see whether the basic functions are working as expected from a new registered user perspective.
Because for me it is first time to use this application so I look to app as a new user and checked basic functions.
Most probably a tester who has spent more time with this app would look from different perspective as he is already very familiar with all sides of app.

Resources:I used some expenses of an average size of a family as my test data . In order to get meaningful and detailed charts.

Findings

1-Comment(note) section is not expandabl. If a longer note is written it takes time to read it which is not convinent.

2-At the chart on the home page, when the user clicks the phone icon  "Communication" text in the circle is not fit in full. Only "Communicati" can be seen.

3-At the home page in the middle of the chart the amount of income and expenses appear however their colours are not convenient for colour blind users.
My husband is one of them who approved it:). "There is no differences at all, they are same" he says. 

4- Current actual balance can be shown on the main screen as well.There is only monthly balance over there. 
Users have to  go and choose the year interval from the left menu just to see it. I think it should be more convenient for users if both them are on the main page.

5-It would be nice to have a limit function for specific cases such as dining out expenses or entertainment. 
For the users that have limited income(like students:)) it would be a good chance to organize and put limit to some expenses in the beginning of the month.





Prioritisation of those charters - which area of the app or testing would you explore first and why? 
Basic calculation of expenses and incomes, range calculation, grouping them, and under each expenses all spendings can be seen 
Because I think for the most of the user it is main idea to use this app. See the expenses and their percentage and also the all items of that expenses by one by.
Almost all of us forget the money we spent or the things we bought in the beginning of the months:)

How much time you have planned for each charter? 
Not sure exactly what it means? But eventhough it was the first time, I have used this kind of application my exploratory testing lasted max 2 hours.
I tried to look every corner of app from a new user perspective.



What kind of risks do you need to mitigate for this type of application? 
Ease of use and convenience should not be sacrificed for functions not really useful. Calculator is a very useful component i.e.
Tracking and keeping someone's spending data could be risky, you have a big responsibility to keep them safe. 
We live in Europe and there are very strict rules for it as far as I know. So there could be always a warning, reminder as the user wants to backup to 3rd parties clouds or local. 

I recorded some screen actions while doing exploratory testing but unfortunately I am not able to add them here.








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



