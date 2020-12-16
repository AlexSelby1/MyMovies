
# Web Services and API Development
# Higher Diploma in Science in Computing – Part-time – Year 1 –
# HDSDEV_JANOL_Y1

## Continuous Assessment 2 (50%) Team Project
 

## Group A
### Student No	First Name	Surname
### x19206968	Lukasz	Plawinski
### x19222114	Alexander	Selby
### x13122657	Conor 	Dixon



## Introduction

The problem of designing the Movies on Demand API service entails as follows. The API should allow customers and associated customer accounts to be requested from the API. The customer should be able to create multiple accounts associated with that customer. The list of accounts associated with the customer may be requested from the API. The account should have a list of movies and the customer may request the list of movies for a specific account. The customer may add and remove movies from the list of the movies for the specific account. The customer may transfer movies from one account movie list to another account held by the customer. The customer account list of movies will also indicate if the movie has been watched or is recommended. 

The Movies on Demand API should have a minimum of four entities; Customer, Account, Movie and Admin. The Customer entity should hold name, correspondence address, email and a unique customer ID number. The Account entity should have a unique ID number, username and password. The Movie entity should have a movie name, release date, movie text summary, a flag indicating if it’s been watched and another flag indicating if it’s recommended. The Admin entity is the super class of all other entities and may display all accounts, customers, customer information, global list of movies, movie information by movie ID. The Admin entity will also create new customer and movie records.

## Entity Relationship Diagram
 ![alt text](https://github.com/LukaszPlawinski/MyMovies/blob/master/src/main/resources/Diagrams/Entity%20Relationship%20Diagram.png?raw=true)

## Security Concerns

The security concerns with our API implementation would centre around secure access to the API endpoints and the data provided by the Movies on Demand API. We will discuss the principles we have adhered to.

The implemented Movies on Demand API has followed a separation of concerns design principle ensuring that only the relevant entities contain the method or operation required. This avoids excessive data being sent in the API response. The team kept the Movies on Demand API design simple to avoid unneeded complexity. 

The API implementation account password string is currently sent in plain text in the Movies on Demand API response. Ideally the password should be hashed to protect the system, system entities and user or account data. The API implementation should ideally validate input parameters and handle exceptions according to the World Wide Web Consortium (W3C) Hypertext Transfer Protocol status code definitions. 

I will also discuss the API authentication, authorization and encryption methods that we have not implemented. API authentication is defined as the validation of the client that is trying to access the API. There are a number of standard protocols for authentication for example OAuth 2.0. OAuth is an authentication protocol that allows an entity to gain access to a user’s data in a secure manner without having to know the user’s credentials (Patni, 2017, p. 215). The OAuth 2 protocol allows for authorization to be delegated for accessing resources by HTTP (Patni, 2017, p. 215). OAuth allows for a generated token to be allocated to the client application (Patni, 2017, p. 215). The generated token may be an authorization code, access token or a refresh code (Patni, 2017, p. 215). The lack of an API authentication is a security concern. For the purpose of our local server and client API implementation API authentication has not been implemented.

API authorization relates to how the authenticated client interacts with the API. For example, the client or the user may be allowed a certain set of operations and disallowed for other operations (Patni, 2017, p. 215). There are a number of authorization methods; Basic, Digest and Client Certificate authentication may be done (Patni, 2017, p. 215). The lack of API authorization is a security concern. For the purpose of our local server and client API implementation authorization has not been implemented (Patni, 2017, p. 215).

API encryption allows for data to be protected with cryptographic services like SSL (Patni, 2017, p. 215). The HTTPS protocol leverages SSL and encryption to secure data from interception of network packets and API requests/responses (Patni, 2017, p. 215). Data can be protected with cryptographic services like SSL. HTTPS allows for verification of the client and server by ensuring that communication is not compromised by a “man in the middle attack” (Patni, 2017, p. 215).  For the purpose of our local server and client API implementation encryption has not been implemented.


## Work Breakdown Structure


The group worked on the project during Microsoft Teams conference calls. We had 10 Microsoft Teams calls in a group chat on the following below documented dates and collaborated strongly in a Slack private group chat. Slack is available on mobile and desktop apps. We communicated regularly on the project and shared ideas, links and diagrams. We worked on the group project together during our Teams calls by sharing our screens and coding the project. We did not split tasks out between the group. We also worked on the group project report together in Google Drive.

Teams Conference Calls
Meeting Date	Call Duration
25 November 2020	43 minutes 
25 November 2020	22 minutes
28 November 2020	1 hour and 54 minutes
2 December 2020	2 hours and 34 minutes
3 December 2020	32 minutes
6 December 2020	2 hours and 23 minutes
8 December 2020	1 hour and 16 minutes
12 December 2020	23 minutes
13 December 2020	40 minutes 



## RESTful API
![alt text](https://github.com/LukaszPlawinski/MyMovies/blob/master/src/main/resources/Diagrams/Entity%20Relationship%20Diagram.png?raw=true)

Endpoint 1

API Name	Account Resource
Description	 Displays account info by specific ID in Json format
URI	api/accounts /{accountID}"
HTTP Verb	 GET
Parameters	@PathParamintaccountID
Resource contents	<Account>
Preconditions	 Record for the account with the specified accountID must exist.
Postconditions	Account info displayed

Endpoint 2

API Name	Account Resource
Description	 Adds Movie to the personal MovieList by account ID and Movie ID
URI	api/accounts /{accountID}/addMovie/{movieID}")
HTTP Verb	 POST
Parameters	 @PathParam("movieID")long movieID,
@PathParam("accountID") long accountID
Resource contents	<String> name of the Movie
Preconditions	 Record for the account and movie with the specified accountID and movieID must exist.
Postconditions	 Movie from Global list is added to the Personal Account List


Endpoint 3

API Name	Account resource
Description	Updates watched and recommended variables for Movie in the Account Movie List
URI	api/accounts /{accountID}/updateMovie/{movieID}/")
HTTP Verb	 PUT
Parameters	 @PathParam("movieID")long movieID,
@PathParam("accountID") long accountID, 
Movie m
Resource contents	<Movie>
Preconditions	 Record for the account and movie with the specified accountID and movieID must exist.

Postconditions	 Movie watched and recommended variables are updated








Endpoint 4

API Name	Account Resource
Description	Delete movie from personal list
URI	api/accounts /{accountID}/deleteMovie/{movieID}/")
HTTP Verb	 DELETE
Parameters	@PathParam("movieID")long movieID,
@PathParam("accountID") long accountID
Resource contents	<String> Name of the removed Movie
Preconditions	Record for the account and movie with the specified accountID and movieID must exist.
Postconditions	 Movie with the specified movieID is removed

Endpoint 5

API Name	Admin resource
Description	 Displays the list of all accounts
URI	api/admin/accounts
HTTP Verb	 GET
Parameters	 None
Resource contents	 List of all accounts as a Json Object
Preconditions	 At least one account must exist
Postconditions	 List of the Accounts will be displayed

Endpoint 6

API Name	Admin Resources
Description	 Displays the list of all customers
URI	api/admin/customers
HTTP Verb	 GET
Parameters	 none
Resource contents	 List of all customers as a Json Object
Preconditions	 At least one customer must exist
Postconditions	 List of the customers will be displayed

Endpoint 7

API Name	Admin Resource
Description	 Customer info specified by customerID will be displayed
URI	api/admin /customers/{customerID}")
HTTP Verb	 GET
Parameters	 @PathParam("customerID") int id
Resource contents	<Customer> as Json object
Preconditions	 Record for the customer with the specified customerID must exist.
Postconditions	 Customer info displayed

Endpoint 8

API Name	Admin Resource
Description	 Creates new customer
URI	api/admin/customers/create
HTTP Verb	 POST
Parameters	address,customerID,email,name as JSON Object
Resource contents	 New  <Customer> as a JSON Object
Preconditions	JSON object must include all required parameters
Postconditions	 New customer record created

Endpoint 9

API Name	Admin Resource
Description	 Displays global list of all movies
URI	api/admin/movies
HTTP Verb	 GET
Parameters	 none
Resource contents	 List of the Movies as JSON object
Preconditions	 At least one movie must exist
Postconditions	 List of the movies will be displayed


Endpoint 10

API Name	Admin Resource
Description	Displays Movie  info by specific movieID
URI	api/admin/movies/{movieID}
HTTP Verb	 GET
Parameters	 @PathParam("movieID") int id
Resource contents	 Movie info as JSON object
Preconditions	 Movie record with specified movieID must exist
Postconditions	 Movie info with specified movieID will be displayed

Endpoint 11

API Name	Admin Resource
Description	 Creates new movie record
URI	api/admin/movies/create
HTTP Verb	 POST
Parameters	 Movie m as a JSON Object
Resource contents	 Created Movie as a JSON Object
Preconditions	 JSON object must include all required parameters
Postconditions	 New Movie record will be created


Endpoint 12

API Name	Customer Resource
Description	 Displays customer info by specific ID in JSON format
URI	api/customers/{customerID}
HTTP Verb	GET
Parameters	 @PathParamintcustomerID
Resource contents	<Customer>
Preconditions	 Record for the customer with the specified customerID must exist
Postconditions	 Customer info displayed






Endpoint 13

API Name	Customer Resource
Description	 Displays all accounts owned by a specific customer
URI	api/customers/{customerID}/accounts
HTTP Verb	 GET
Parameters	 @PathParamintcustomerID
Resource contents	<Account>
Preconditions	 Customer must exist with specified ID / Customer must own accounts
Postconditions	 All accounts are displayed that are owned by the requested customer

Endpoint 14

API Name	Customer Resource
Description	Customer can request the movielist from a specific account
URI	api/customers/{customerID}/accounts/{accountID}/movielist
HTTP Verb	 GET
Parameters	 @PathParamintaccountID
Resource contents	<Movie>
Preconditions	Customer must own the specified account. 
An account must own a list of movies
Postconditions	 Movie List request is displayed to the customer

Endpoint 15

API Name	Customer Resource
Description	Customer can create an account to their list.
URI	api/customers/{customerID}/create
HTTP Verb	 POST
Parameters	userName, password as JSON Object
Resource contents	 New <Account>
Preconditions	 JSON object must include all required parameters
Postconditions	 New account is created and displayed



Endpoint 16

API Name	Customer Resource
Description	Customer can transfer a movie from one account list to another
URI	/api/customers/{customerID}/transferMovie/{movieID}
HTTP Verb	 PUT
Parameters	@PathParam("movieID")
@QueryParam("fromID") 
@QueryParam("toID")
Resource contents	 Transferred movie as JSON Objects
Preconditions	 Requested movie must exist within the specified accounts movie list.
Customer must own both accounts
Postconditions	 Specified movie is transferred from one account to another

Endpoint 17

API Name	Movie Resource
Description	 Displays movie info by specific ID in Json format
URI	api/movies/movieID
HTTP Verb	 GET
Parameters	@PathParamintmovieID

Resource contents	<Movie>
Preconditions	Record for the movie with the specified movieID must exist
Postconditions	 Movie info is displayed

Video Presentation

Link: https://www.youtube.com/watch?v=2Ie7KmyTwhk&feature=youtu.be

Bibliography:


Patni, S (2017) Pro Restful APIs Design, Build and Integrate with REST, JSON, XML and JAX-RS. Santa Clara: Apress.

World Wide Web Consortium (W3C) 10. Status Code Definitions. Available at: https://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html [Accessed Thursday 19 November 2020].






