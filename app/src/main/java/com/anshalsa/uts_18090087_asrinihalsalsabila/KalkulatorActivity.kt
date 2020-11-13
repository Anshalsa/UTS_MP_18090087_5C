package com.anshalsa.uts_18090087_asrinihalsalsabila

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Kalkulator"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val txtNumber1 = findViewById<EditText>(R.id.id_angka)
        val txtNumber2 = findViewById<EditText>(R.id.id_angka1)
        val txtHasil = findViewById<EditText>(R.id.txt_hasil)

        val btnTambah = findViewById<Button>(R.id.btn_tambah)
        val btnKurangi = findViewById<Button>(R.id.btn_kurang)
        val btnBagi = findViewById<Button>(R.id.btn_bagi)
        val btnKali = findViewById<Button>(R.id.btn_kali)
        val btnKembali = findViewById<Button>(R.id.btn_keluar)

        btnTambah.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.tambah(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKurangi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kurang(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.bagi(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kali(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKembali.setOnClickListener {
            onBackPressed()
        }


    }

    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    fun bagi(a: Double, b: Double): Double {
        return a / b
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}