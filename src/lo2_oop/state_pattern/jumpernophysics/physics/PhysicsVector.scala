package lo2_oop.state_pattern.jumpernophysics.physics

/**
  * A 3-Dimension vector in the physical space. The x/y plane is parallel to the ground and the z-axis is perpendicular
  * to the ground. Gravity is applied in the negative z direction (ie. positive z is up)
  *
  * @param x-axis component of the vector
  * @param y-axis component of the vector
  * @param z-axis component of the vector
  */
class PhysicsVector(var x: Double = 0.0, var y: Double = 0.0, var z: Double = 0.0) {

  override def toString: String = {
    "(" + x + ", " + y + ", " + z + ")"
  }

}
