package rpg.kotlin.com.esgikotlinrpgandroid.module.common.view

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

/**
 * Created on 13/11/2018 by cyrilicard
 *
 */
class KotlinView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0,
    defStyleRes: Int = 0) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

/*  class KotlinView : View {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
      ...
    }

  }*/

/*  init {
    initAttrs(attrs)
    applyAttrs()
  }

  private fun initAttrs(attrs: AttributeSet?) {
    attrs?.let {
      val a = context.theme.obtainStyledAttributes(attrs, R.styleable.ProfileImageView, 0, 0)
      if (a.hasValue(R.styleable.ProfileImageView_image)) {
        imageResource = a.getResourceId(R.styleable.ProfileImageView_image, 0)
      }

      if (a.hasValue(R.styleable.ProfileImageView_text)) {
        imageText = a.getString(R.styleable.ProfileImageView_text)
      }

      if (a.hasValue(R.styleable.ProfileImageView_textSize)) {
        textSize = a.getDimensionPixelSize(R.styleable.ProfileImageView_textSize, textSize)
      }
      a.recycle()
    }
  }


  private fun applyAttrs() {

  }*/

}
