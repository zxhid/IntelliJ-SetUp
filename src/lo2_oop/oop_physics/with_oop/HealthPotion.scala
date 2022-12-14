package lo2_oop.oop_physics.with_oop

import lo2_oop.oop_physics.PhysicsVector


class HealthPotion(potionLocation: PhysicsVector, val volume: Int) extends GameObject(potionLocation) {

  override def objectMass(): Double = {
    val massPerVolume: Double = 7.0
    volume * massPerVolume
  }

  override def use(player: Player): Unit = {
    player.health = (player.health + this.volume).min(player.maxHealth)
  }

  override def toString: String = {
    "location: " + this.location + "; volume: " + volume
  }

  override def equals(obj: Any): Boolean = {
    obj match {
      case hp: HealthPotion => this.volume == hp.volume
      case _ => false
    }
  }

}
