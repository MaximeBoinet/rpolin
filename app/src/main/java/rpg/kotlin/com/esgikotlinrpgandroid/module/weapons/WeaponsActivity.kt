package rpg.kotlin.com.esgikotlinrpgandroid.module.weapons

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_weapons.*
import rpg.kotlin.com.esgikotlinrpgandroid.R
import rpg.kotlin.com.esgikotlinrpgandroid.data.model.*
import rpg.kotlin.com.esgikotlinrpgandroid.module.common.BaseActivity

/**
 * Created on 11/11/2018 by cyrilicard
 *
 */
class WeaponsActivity : BaseActivity(layoutRes = R.layout.activity_weapons), WeaponsInterface {

  private val presenter = WeaponsPresenter(this)

  private lateinit var adapter: WeaponAdapter

  override fun getPresenter() = presenter

  override fun onCreated() {
    initAdapter()
    super.onCreated()
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
  }

  private fun initAdapter() {
    adapter = WeaponAdapter { weapon -> presenter.onWeaponClick(weapon) } // can be converted in method reference !
    val linearLayoutManager = LinearLayoutManager(this)
    linearLayoutManager.stackFromEnd = true
    weapons_recycler_view.layoutManager = linearLayoutManager
    weapons_recycler_view.adapter = adapter
  }

  override fun fillWeaponsList(weapons: List<Weapon>) {
    adapter.fillWeaponsList(weapons)
  }

  override fun fillWeaponDetailsView(weapon: Weapon) {
    weapons_picto_imv.setImageResource(weapon.icon)

    val bonus = when (weapon) {
      is Dagger, is Sword, is Axe -> ""
      is Bow -> getString(R.string.nb_of_arrow, weapon.nbOfArrow)
      is MagicWand -> getString(R.string.nb_of_magic_damage, weapon.magicDamage)
    }
    weapons_information_txv.text = getString(R.string.weapon_details, weapon.id.toString(), weapon.weaponName,
        bonus) //complete with more details
  }

  override fun handleValidateAction() {
    val result = Intent()
    //result.putExtra(EXTRA_TASK_DESCRIPTION, taskDescription)
    setResult(Activity.RESULT_OK, result)
    finish()
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.menu_weapons, menu)
    return super.onCreateOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    item?.let {
      val id = item.itemId

      when (id) {
        R.id.menu_validate -> presenter.onValidateClick()
        android.R.id.home -> {
          finish()
          return true
        }
      }
    }
    return super.onOptionsItemSelected(item)
  }
}
