package br.com.fiap.consumoapi

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.fiap.consumoapi.model.Pokemon
import kotlinx.android.synthetic.main.activity_search.view.*

class ListaAdapter(
        val pokemons: List<Pokemon>,
        val context: Context,
        val listener:(Pokemon) -> Unit):RecyclerView.Adapter<ListaAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.pokemon_item,parent,false)
        return ViewHolder()
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindView(pokemon: Pokemon,
                     listener: (Pokemon) -> Unit) = with(itemView) {
            itemView.tvPokemon.text = pokemon.name
            setOnClickListener{listener(pokemon)}
        }

    }
}