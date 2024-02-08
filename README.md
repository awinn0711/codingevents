The purpose of this application is for a user to create and view different coding events.
The application in its current state lets users view all of the created events. Users can also create new events. Users can create event categories, view all of the categories, and view events by category. All 
events and categories are stored in a MYSQL database.

A future Person class to hold users of the app would need the following fields: 
  1. int userId
  2. String firstName
  3. String lastName
  4. String email
  5. String password

It could also have the following references:
  1. PersonProfile - a class to contain all the profile information of a user
  2. List<Event> eventsAttending to store events the user wants to attend
  3. List<Event> eventsOwned to store events the user has created
Person would have a many to many relationship with Event via eventsAttending one to many relationship with Event via eventsOwned.
