package com.udacoding.mvpsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.udacoding.mvpsample2.base.BaseActivity
import com.udacoding.mvpsample2.model.HasilHitung

class MainActivity : BaseActivity(),ImpMainView {

    private var presenter :HitungPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




       // sesi.nando

        presenter = HitungPresenter()


        var a = 12
        var b = 34
        presenter?.hitung(a,b)

    }

    override fun hasilData(model: HasilHitung) {

        //tampilin ke view
    }

    //todo 6
    override fun onAttachView() {
        presenter?.attach(this)
    }

    override fun onDetachView() {
        presenter?.detach()
    }

    override fun onStop() {
        super.onStop()
        onDetachView()
    }

    override fun onStart() {
        super.onStart()
        onAttachView()
    }
}