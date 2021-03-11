package com.stayup.stayupversi1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvStartups: RecyclerView
    private var list: ArrayList<Startup> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvStartups = findViewById(R.id.rv_startups)
        rvStartups.setHasFixedSize(true)

        list.addAll(StartupsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvStartups.layoutManager = LinearLayoutManager(this)
        val listStartupAdapter = ListStartupAdapter(list)
        rvStartups.adapter = listStartupAdapter

        listStartupAdapter.setOnItemClickCallback(object: ListStartupAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Startup) {
                showSelectedStartup(data)
            }
        })
    }

    private fun showSelectedStartup(startup: Startup) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, startup.name)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, startup.detail)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_IMAGE, startup.image)
        startActivity(moveWithDataIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}