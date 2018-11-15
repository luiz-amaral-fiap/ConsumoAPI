package br.com.fiap.consumoapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.fiap.consumoapi.model.Pokemon
import br.com.fiap.consumoapi.model.Sprites
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        rvPokemons.adapter = ListaAdapter(listOf(
                Pokemon("Charmander", Sprites("")),
                Pokemon("Bulbasaur", Sprites("")),
                Pokemon("Squirtle", Sprites(""))
        ),this,{})
        rvPokemons.layoutManager = LinearLayoutManager(this)
    }
}
