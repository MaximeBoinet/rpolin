package rpg.kotlin.com.esgikotlinrpgandroid.module.weapons

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_weapon.view.*
import rpg.kotlin.com.esgikotlinrpgandroid.R
import rpg.kotlin.com.esgikotlinrpgandroid.data.model.Weapon
import rpg.kotlin.com.esgikotlinrpgandroid.misc.inflate

class WeaponAdapter(private var weaponListener: (Weapon) -> Unit) : RecyclerView.Adapter<WeaponAdapter.WeaponViewHolder>() {

  private var weapons: List<Weapon> = mutableListOf()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeaponViewHolder {
    return WeaponViewHolder(parent.inflate(R.layout.item_weapon))
  }

  override fun getItemCount() = weapons.size


  override fun onBindViewHolder(holder: WeaponViewHolder, position: Int) {
    val weapon = weapons[position]

    with(holder) {
      picto.setImageResource(weapon.icon)
      name.text = weapon.weaponName

      container.setOnClickListener { weaponListener.invoke(weapon) }
    }
  }

  fun fillWeaponsList(weapons: List<Weapon>) {
    this.weapons = weapons
    notifyDataSetChanged()
  }


  inner class WeaponViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var container: View = view.weapon_container
    var picto: ImageView = view.weapon_picto_imv
    var name: TextView = view.weapon_name_txv
  }
}
