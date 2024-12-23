package com.example.kelompok_kalian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
      private lateinit var rvName : RecyclerView
    private var list : ArrayList<Model> = arrayListOf()
    private var title : String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        rvName = findViewById(R.id.rv_heroes)
        rvName.setHasFixedSize(true)

        list.addAll(ModelData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when(itemId){
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode Cardview"
                showRecyclerCard()
            }
        }
    }

    private fun showRecyclerCard() {
        rvName.layoutManager = LinearLayoutManager(this)
        val listNameAdapter = CardAdapter(list)
        rvName.adapter = listNameAdapter

        listNameAdapter.setOnItemClickCallback(object  : CardAdapter.OnItemClickCallback{
            override fun onItemCLicked(data: Model) {
                showSelectedHero(data)
            }

        })
    }

    private fun showRecyclerGrid() {
        rvName.layoutManager = GridLayoutManager(this, 2)
        val listNameAdapter = GridAdapter(list)
        rvName.adapter = listNameAdapter

        listNameAdapter.setOnItemClickCallback(object  : GridAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Model) {
                showSelectedHero(data)
            }


        })
    }

    private fun showRecyclerList() {
        rvName.layoutManager = LinearLayoutManager(this)
        val listNameRowAdapter = RowAdapter(list)
        rvName.adapter = listNameRowAdapter

        listNameRowAdapter.setOnItemCLickCallback(object  : RowAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Model) {
               showSelectedHero(data)
            }


        })
    }

    private fun showSelectedHero(data: Model) {
        Toast.makeText(this, "Kamu memilih" + data.name, Toast.LENGTH_SHORT).show()
    }
}
