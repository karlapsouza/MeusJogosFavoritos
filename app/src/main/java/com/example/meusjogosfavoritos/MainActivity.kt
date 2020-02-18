package com.example.meusjogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meusjogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvJogos.adapter = JogosAdapter(carregaJogos(), this) {
            //tempo de duração do toast Toast.LENGTH_SHORT = 3s e Toast.LENGTH_LONG = 5s
            Toast.makeText(this, it.nome, Toast.LENGTH_SHORT).show()
        }
        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun carregaJogos() : List<Jogo>{
       return listOf(
           godOfWar(),
           mortalKombat(),
           needForSpeed()
       )

    }

    private fun godOfWar() : Jogo {
        return Jogo(
            R.drawable.images,
            "God of War",
            2018,
            "Jogo toperson"
        )
    }

    private fun mortalKombat() : Jogo {
        return Jogo(
            R.drawable.mk,
            "Mortal Kombat 11",
            2018,
            "Jogo toperson 2"
        )
    }

    private fun needForSpeed() : Jogo {
        return Jogo(
            R.drawable.nfs,
            "Need For Speed",
            2018,
            "Jogo toperson 3"
        )
    }
}
