package rpg.kotlin.com.esgikotlinrpgandroid.module.weapons

import rpg.kotlin.com.esgikotlinrpgandroid.data.model.Weapon

/**
 * Created on 11/11/2018 by cyrilicard
 *
 */
interface WeaponsInterface {
  fun fillWeaponsList(weapons: List<Weapon>)
  fun fillWeaponDetailsView(weapon: Weapon)
  fun handleValidateAction()
}