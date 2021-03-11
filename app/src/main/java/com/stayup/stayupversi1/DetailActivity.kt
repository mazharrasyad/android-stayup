package com.stayup.stayupversi1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Get Data
        val tvDataReceivedName: TextView = findViewById(R.id.tv_data_received_name)
        val tvDataReceivedDetail: TextView = findViewById(R.id.tv_data_received_detail)
        val ivDataReceivedImage: ImageView = findViewById(R.id.iv_data_received_image)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        val bundle = intent.extras
        if (bundle != null) {
            val image = bundle.getInt(EXTRA_IMAGE)
            ivDataReceivedImage.setImageResource(image)
        }

        tvDataReceivedName.text = name
        tvDataReceivedDetail.text = detail

        // Action Bar Back
        val actionbar = supportActionBar
        actionbar!!.title = "Startup $name"
        actionbar.setDisplayHomeAsUpEnabled(true)

        // Share
        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, intent.getStringExtra(EXTRA_DETAIL))
                    type = "text/plain"
                }

                val shareIntent =
                    Intent.createChooser(sendIntent, intent.getStringExtra(EXTRA_NAME))
                startActivity(shareIntent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_favorite -> {
                if (item.title.equals("Non Favorite")) {
                    item.setTitle("Favorite")
                    item.setIcon(R.drawable.ic_action_favorite)
                } else{
                    item.setTitle("Non Favorite")
                    item.setIcon(R.drawable.ic_action_favorite_border)
                }
            }
        }

        return super.onOptionsItemSelected(item)
    }
}