# Spring Boot User Management Application

Create a Spring Boot application for user management with the following specifications:

## Technical Requirements

- Spring Boot 3.x
- Java 17 or later
- Gradle (with Kotlin DSL)
- H2 Database
- Spring Data JPA
- Spring MVC
- Thymeleaf
- Spring Validation

## Functional Requirements

### REST API Endpoints

Implement the following REST API endpoints:
- `POST /api/users` - Create a new user
- `GET /api/users` - Retrieve all users
- `GET /api/users/{id}` - Retrieve a specific user
- `PUT /api/users/{id}` - Update a user
- `DELETE /api/users/{id}` - Delete a specific user
- `DELETE /api/users` - Delete all users

### Web Interface Requirements

Implement the following web pages using Thymeleaf:
- User listing page (`/`) - Display all users in a table with edit and delete actions
- New user form (`/users/new`) - Form to create a new user
- Edit user form (`/users/edit/{id}`) - Form to update existing user

### Data Model

User entity should contain:
- `id` (Long, auto-generated)
- `name` (String, required)
- `email` (String, required, must be valid email)
- `phone` (String, optional)

### Project Structure

Follow this package structure:
```
com.microsoft.shinyay.demo
├── controller
├── service
├── repository
├── model
├── exception
├── config
├── dto
├── util
├── security
└── properties
```

### UI Design Requirements

The web interface should include:
- Clean, responsive design
- Table for user listing
- Forms for user creation and editing
- Buttons for actions (Add, Edit, Delete)
- Confirmation dialog for delete actions
- Input validation with error messages
- Success/error feedback for user actions

### CSS Requirements

Style the following elements:
- Navigation and layout
- Tables with hover effects
- Forms with proper spacing
- Buttons with different states (primary, secondary, edit, delete)
- Input fields with focus states
- Typography and color scheme

### Configuration

Set up the following in application.properties:
- H2 database configuration with in-memory storage
- H2 console access
- JPA/Hibernate properties
- Thymeleaf cache disabled for development

## Implementation Guidelines

1. Set up the basic Spring Boot project with required dependencies
2. Implement the data model with proper validation
3. Create the repository interface extending JpaRepository
4. Implement the service layer with business logic
5. Create REST controllers for API endpoints
6. Create web controllers for Thymeleaf templates
7. Design and implement Thymeleaf templates
8. Style the UI with CSS
9. Add proper error handling
10. Test all functionality

## Additional Implementation Details

### Error Handling

Implement proper exception handling for:
- Resource not found scenarios
- Validation failures
- Database operation failures

Create a centralized error handler that:
- Returns proper HTTP status codes
- Provides meaningful error messages
- Handles both API and web interface errors

### Validation Requirements

Add the following validations:
- Name: Required, minimum 2 characters
- Email: Required, valid email format
- Phone: Optional, but if provided should match a valid phone number pattern

### Response Formats

REST API responses should follow this structure:
- Success responses: Return the entity directly
- Error responses: Include status, message, and timestamp
- Validation errors: Include field-specific error messages

### Security Considerations

Basic security setup:
- CSRF protection for web forms
- Input sanitization
- XSS protection
- Basic error message sanitization

### Testing Requirements

Include tests for:
- Repository layer
- Service layer
- Controller layer (both REST and web)
- Integration tests for complete flows

## Development Setup

### Required Tools
- JDK 17 or later
- Gradle 8.x
- Your favorite IDE (IntelliJ IDEA recommended)

### Build and Run
```bash
./gradlew clean build
./gradlew bootRun
```

### Access Points
- Web Interface: http://localhost:8080
- H2 Console: http://localhost:8080/h2-console
- API Base URL: http://localhost:8080/api

## Future Enhancements

Consider implementing:
- User authentication
- Role-based access control
- API documentation with Swagger/OpenAPI
- Pagination for user listing
- Sorting and filtering capabilities
- Audit logging
- Data export functionality

The application should follow Spring Boot best practices and provide a clean, user-friendly interface for managing user data.
