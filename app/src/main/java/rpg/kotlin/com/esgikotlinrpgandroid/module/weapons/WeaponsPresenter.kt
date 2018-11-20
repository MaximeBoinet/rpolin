package rpg.kotlin.com.esgikotlinrpgandroid.module.weapons

import data.DataProvider
import rpg.kotlin.com.esgikotlinrpgandroid.data.model.Weapon
import rpg.kotlin.com.esgikotlinrpgandroid.module.common.BasePresenter

/**
 * Created on 11/11/2018 by cyrilicard
 *
 */
class WeaponsPresenter(private val view: WeaponsInterface) : BasePresenter() {

    private var choosingWeapon: Weapon? = null

    override fun onCreated() {
        super.onCreated()
        view.fillWeaponsList(DataProvider.prepareListOfWeapons())
    }

    fun onWeaponClick(weapon: Weapon) {
        choosingWeapon = weapon
        view.fillWeaponDetailsView(weapon)
    }

    fun onValidateClick() {
        choosingWeapon?.let {
            DataProvider.saveWeapon(it)
            view.handleValidateAction()
        }
    }

}