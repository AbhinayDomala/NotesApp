# NotesApp

## Prerequisite for running the application
* When you run this application, make sure that your db confiurations are as per you local mysql server.<br/>
  Update your configurations in this [file](https://github.com/AbhinayDomala/NotesApp/blob/main/src/main/resources/application.properties)
* Populate User table with few entries.

## App Validations:
* Read HTTP method<br/>
`curl --user admin:password --request GET http://localhost:8080/getAllNotes/test@gmail.com`
* Delete HTTP method<br/>
`curl --user admin:password --request DELETE http://localhost:8080/note/10/test1@gmail.com`
* Create HTTP method<br/>
`curl --user admin:password --header "Content-Type: application/json" --request POST --data '{"email":"test1@gmail.com","title":"test9","note":"notes on testing","createTime":"2021-10-12T11:55:32.450","lastUpdateTime":"2021-10-12T11:55:32.450"}' http://localhost:8080/note`
* Update HTTP method<br/>
`curl --user admin:password --header "Content-Type: application/json" --request PUT --data '{"id":"13","email":"test1@gmail.com","title":"test8","note":"notes on testing","createTime":"2021-10-12T11:55:32.450","lastUpdateTime":"2021-10-12T11:55:32.450"}' http://localhost:8080/note`
