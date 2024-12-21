package com.wesleyschuab.threadscoroutines

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Threads
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.wesleyschuab.threadscoroutines.databinding.ActivityMainBinding
import java.lang.Thread.currentThread
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var pararThread = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.btnAbrir.setOnClickListener {
            startActivity(
                Intent(this, SeguindaActivity::class.java)
            )
        }
        binding.btnInciar.setOnClickListener {
            runOnUiThread {
                binding.btnParar.text = " Fim da execução Tela descongelada"
            }

            // Usando a Thread que criamos
           // MinhaThread().start()

            //Usando a thread principal
          repeat(10) { indice ->
                Log.i("info_Thread", "Executando: $indice T: ${currentThread().name}")
                sleep(1000)
                binding.btnInciar.text = "Executou: $indice T: ${currentThread().name}"

            }

            // Implementando uma interface
            //Thread( MinhaRunable() ).start()

        }
        binding.btnThread.setOnClickListener {
            binding.btnParar.text = "Parar"

            // Implementando uma interface
            Thread( MinhaRunable() ).start()

        }
        binding.btnParar.setOnClickListener {
            pararThread = true
            binding.btnThread.text = "Reiniciar Execução"
            binding.btnThread.isEnabled = true
        }
    }
    inner class MinhaRunable : Runnable {
        override fun run() {

            repeat(30) { indice ->
                if (pararThread == true){
                    pararThread = false
                    return
                }
                Log.i("info_Thread", "Minha Thread: $indice T: ${currentThread().name}")
                runOnUiThread {
                    binding.btnThread.text = "Executando: $indice T: ${currentThread().name}"
                    binding.btnThread.isEnabled = false
                    if ( indice == 29){
                        binding.btnThread.text = "Reiniciar Execução"
                        binding.btnThread.isEnabled = true
                    }
                }

                sleep(1000)
            }
        }
    }
    inner class MinhaThread : Thread() {
        override fun run() {
            super.run()
            repeat(30) { indice ->
                Log.i("info_Thread", "Minha Thread: $indice T: ${currentThread().name}")
                runOnUiThread {
                    binding.btnInciar.text = "Executando: $indice T: ${currentThread().name}"
                }

                sleep(1000)
            }
        }
    }
}