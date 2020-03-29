Feature: Verify create account functionality


Scenario: verify test case
Given user launch browser
When user passed 30 age value
Then user should see expected test as "manoj"

Scenario Outline: Verify create account functionality
Given user launch browser
When user enter url
And user click on signin link
And user enter emailaddress as "<emailAddress>"
And user click on create account button
And user enter firstname as "<firstName>"
And user enter lastname as "<lastName>"
And user enter password as "<password>"
And user enter address as "<address>" and city as "<city>"
And user select state as "<state>"
And user enter zipcode as "<zipcode>"
And user enter phonenumber as "<phoneNumber>"
And user enter alias as "<alias>"
And user click on register button 
Then user should see account name as "<createdUserName>"
Examples:
|emailAddress                   |firstName|lastName|password |address|city|state|zipcode|phoneNumber|alias|createdUserName|
|mano1juh1778768@mailinator.com|John     |David   |Manoj@123|test   |test|5    |00000  |888666566  |test |Johw David     |


