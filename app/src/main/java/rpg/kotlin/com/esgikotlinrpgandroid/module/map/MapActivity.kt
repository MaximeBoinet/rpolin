package rpg.kotlin.com.esgikotlinrpgandroid.module.map

import rpg.kotlin.com.esgikotlinrpgandroid.R
import rpg.kotlin.com.esgikotlinrpgandroid.module.common.BaseActivity

class MapActivity: BaseActivity(layoutRes = R.layout.activity_map), MapInterface {

    private val presenter = MapPresenter(this)

    override fun getPresenter() = presenter

    override fun fillRoomData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBackRpg() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}