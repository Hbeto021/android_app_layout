package br.com.android_app_layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_frame_layout.*

class FrameLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)

        frame_layout_next_icon.setOnClickListener {
            if(frame_layout_background_one.visibility == View.VISIBLE) {
                frame_layout_background_one.visibility = View.GONE
                frame_layout_background_two.visibility = View.VISIBLE
            } else {
                frame_layout_background_one.visibility = View.VISIBLE
                frame_layout_background_two.visibility = View.GONE
            }
        }

        frame_layout_info_icon.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(getString(R.string.frame_layout_title))
            builder.setMessage(getString(R.string.frame_layout_description))
            builder.setPositiveButton(getString(R.string.dialog_positive_button)) { _, _ ->}
            val dialog = builder.create()
            dialog.show()
        }
    }
}
