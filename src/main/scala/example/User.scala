package example

import beans.BeanProperty
import javax.persistence.{GeneratedValue, Id, Entity}

@Entity
class User{
  @BeanProperty
  @Id
  @GeneratedValue
  var id: java.lang.Long = _

  @BeanProperty
  var firstName: String = _

  @BeanProperty
  var lastName: String = _
}
