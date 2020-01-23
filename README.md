# Songr

This is a demo SpringMVC app which uses Thymeleaf to render dynamic HTML.

To run this app:
  *Ensure you have postgreSQL installed on your computer.
  *Clone this repo.
  *Modify the application.properties file to use the correct databaseURL, name, and password.
  *Run `./gradlew bootRun` This will start a local server on port 8080 which you can view in your browser on http://localhost:8080/

The app rendered on the server has a home page, a songs page, and an albums page. The albums page renders each Album in the database. Click the Add an Album button to view a form that lets you add a new album to the database. Click the View button to view details about a specific album, and add songs to it.
The Songs page shows all songs that have been added to the database.