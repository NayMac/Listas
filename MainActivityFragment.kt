package com.example.soportecta.listas

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SeekBar

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment(), SeekBar.OnSeekBarChangeListener {


    var progreso : Int? =null
    var adaptador: ArrayAdapter<String>? = null
    var listView: ListView? = null

    var elementos = arrayOfNulls<String>(11)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val vistaRaiz =  inflater.inflate(R.layout.fragment_main, container, false)
        val seek = vistaRaiz.findViewById<SeekBar>(R.id.seekBar) as SeekBar
        progreso = seek.progress  //3
        listView = vistaRaiz.findViewById<ListView>(R.id.listView) as ListView


        calcularTablas(progreso!!)
        return vistaRaiz
    }

    fun calcularTablas(progreso:Int){
        for (i in 0..10){
            val texto = "$progreso * $i = ${progreso * i}"
            elementos.set(i,texto)
        }
        adaptador = ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,elementos)
        listView!!.adapter = adaptador

    }



    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


