package example

import javax.persistence.EntityManager

trait UserRepositoryJPAComponent extends UserRepositoryComponent {
  val em: EntityManager

  def userLocator = new UserLocatorJPA(em)
  def userUpdater = new UserUpdaterJPA(em)

  class UserLocatorJPA(em: EntityManager) extends UserLocator {
    def findAll = em.createQuery("from User", classOf[User]).getResultList
  }

  class UserUpdaterJPA(em:EntityManager) extends UserUpdater {
    def save(user: User) = {
      transactionally {
        em.persist(user)
      }
    }
  }

  def transactionally[T](f: => T) = {
    val tx = em.getTransaction
    tx.begin()
    val ret = f
    tx.commit()

    ret
  }
}
