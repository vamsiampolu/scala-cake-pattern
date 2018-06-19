package example

import javax.persistence.Persistence

object Application {
  val userServiceComponent = new DefaultUserServiceComponent with UserRepositoryJPAComponent {
    val em = Persistence.createEntityManagerFactory("example").createEntityManager()
  }

  val userService = userServiceComponent.userService
}
