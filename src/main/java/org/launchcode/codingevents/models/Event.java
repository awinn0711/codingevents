package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 50, message = "Description is too long")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email")
    private String contactEmail;

    @NotNull(message = "Location cannot be null")
    @NotBlank(message = "Location cannot be blank")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    private String location;

    @AssertTrue(message = "Attendee registration is required")
    private boolean hasRegistration;

    @Positive(message = "Need more attendees")
    private Integer attendees;

    public Event() {
        this.id = nextId;
        nextId ++;
    };
    public Event(String name, String description, String contactEmail, String location, boolean hasRegistration, Integer attendees) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.hasRegistration = hasRegistration;
        this.attendees = attendees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isHasRegistration() {
        return hasRegistration;
    }

    public void setHasRegistration(boolean hasRegistration) {
        this.hasRegistration = hasRegistration;
    }

    public Integer getAttendees() {
        return attendees;
    }

    public void setAttendees(Integer attendees) {
        this.attendees = attendees;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
