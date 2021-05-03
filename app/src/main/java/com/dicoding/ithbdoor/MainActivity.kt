package com.dicoding.ithbdoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlace: RecyclerView
    private var list: ArrayList<Company> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlace = findViewById(R.id.rv_joblist)
        rvPlace.setHasFixedSize(true)

        list.addAll(CompaniesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlace.layoutManager = LinearLayoutManager(this)
        val listCompanyAdapter = ListCompanyAdapter(list)
        rvPlace.adapter = listCompanyAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                aboutMePage()
            }
        }
    }

    private fun aboutMePage(){
        val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
        startActivity(moveIntent)
    }

}