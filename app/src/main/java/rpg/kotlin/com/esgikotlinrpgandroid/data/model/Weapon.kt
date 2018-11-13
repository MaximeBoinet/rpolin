package rpg.kotlin.com.esgikotlinrpgandroid.data.model

import rpg.kotlin.com.esgikotlinrpgandroid.R

/**
 * Created on 11/11/2018 by cyrilicard
 *
 */
sealed class Weapon(open val id: Int, open val weaponName: String, open val icon: Int)

data class Dagger(
    override val id: Int = 1,
    override val weaponName: String = "Dague",
    override val icon: Int = R.drawable.ic_dagger
) : Weapon(id, weaponName, icon)

data class Sword(
    override val id: Int = 2,
    override val weaponName: String = "Épée",
    override val icon: Int = R.drawable.ic_sword
) : Weapon(id, weaponName, icon)

data class Axe(
    override val id: Int = 3,
    override val weaponName: String = "Hache",
    override val icon: Int = R.drawable.ic_axe
) : Weapon(id, weaponName, icon)

data class Bow(
    override val id: Int = 4,
    override val weaponName: String = "Arc",
    override val icon: Int = R.drawable.ic_archery,
    var nbOfArrow: Int = 20
) : Weapon(id, weaponName, icon)

data class MagicWand(
    override val id: Int = 5,
    override val weaponName: String = "Baguette magique",
    override val icon: Int = R.drawable.ic_magic_wand,
    val magicDamage: Int = 30
) : Weapon(id, weaponName, icon)

/*enum class Weapon (val id : Int, val weaponName : String){
  DAGGER(1, "dague"),
  SWORD(2, "épée"),
  AXE(3, "hache"),
  BOW(4, "arc"),
  MAGIC_WAND(5, "baguette magique"),
  NONE(0, "");

  companion object {
    fun getById(id : Int) : Weapon {
      for (weaponChoice in Weapon.values()) {
        if (weaponChoice.id == id) return weaponChoice
      }
      return NONE
    }
  }
}*/
