package br.com.android_app_layout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_go_to_linear_layout.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }

        button_go_to_relative_layout.setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }

        button_go_to_frame_layout.setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }

        button_go_to_constraint_layout.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }

    }
}
