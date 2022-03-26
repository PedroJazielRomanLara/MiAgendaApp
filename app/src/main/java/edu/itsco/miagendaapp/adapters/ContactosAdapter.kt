package edu.itsco.miagendaapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.itsco.miagendaapp.modelos.contacto
import edu.itsco.miagendaapp.R

class ContactosAdapter (private val listaContactos:ArrayList<contacto>):
    RecyclerView.Adapter<ContactosAdapter.ViewHolder>(){

    class ViewHolder (view:View): RecyclerView.ViewHolder(view){
        val lbnombre:TextView
        val lbtelefono:TextView

        init {
            lbnombre = view.findViewById(R.id.lb_nombre)
            lbtelefono = view.findViewById(R.id.lb_telefono)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactosAdapter.ViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.contacto_item,
            parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactosAdapter.ViewHolder, position: Int) {
        holder.lbnombre.text = listaContactos[position].nombre
        holder.lbtelefono.text = listaContactos[position].telefono
    }

    override fun getItemCount(): Int {
        return listaContactos.size
    }

    fun addContacto(contacto:contacto){
        listaContactos.add(contacto)
        notifyDataSetChanged()
    }
}