package example

import scala.collection.JavaConversions._

object Main extends App {
  val userService = Application.userService

  val user: User = new User
  user.setFirstName("Mark")
  user.setLastName("Harrison")

  userService.save(user)

  val users:java.util.List[User] = userService.findAll

  if (!users.isEmpty) {
    println("I have understood the cake pattern")
    users.toList.foreach(arg => {
      println("successfully loaded " + arg.firstName + " " + arg.lastName)
    })
  } else {
    println("The code did not work, blame everything on Hibernate")
  }
}
