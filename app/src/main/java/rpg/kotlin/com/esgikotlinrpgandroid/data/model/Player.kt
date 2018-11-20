package data.model

import rpg.kotlin.com.esgikotlinrpgandroid.data.model.Weapon

/**
 * Created by cyrilicard on 02/09/2018.
 */
data class Player(
    val pseudo: String,
    var healthPoint: Int,
    var weapon: Weapon,
    var items: MutableList<Item>,
    var nbPotion: Int = 0,
    var nbGrenade: Int = 0,
    var nbKey: Int = 0
)