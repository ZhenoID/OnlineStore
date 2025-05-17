# OnlineStore

1) I used
  * pring MVC (for the web layer)
  
  * Hibernate (JPA) (for data persistence)
  
  * Spring Security (for authentication and role-based authorization)
  
  * Thymeleaf (for view templates)
  
  * PostgreSQL (as the database)

2) User Registration
  * A registration form (register.html) is shown.
  
  * On submission, MainController.processRegister() is called.
  
  * UserServiceImpl.register() is invoked -> it saves the user to the database via UserDAO.

3) Login
  * Handled by Spring Security via .formLogin().

  * /login is the login page (automatically shown if not authenticated).
    
  * On successful login, user is redirected to /index

4) Roles
  * User (can only see the database)
  * Admin (can add new data in databae) 




