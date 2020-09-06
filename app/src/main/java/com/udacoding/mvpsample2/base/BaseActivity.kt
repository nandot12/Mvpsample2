package com.udacoding.mvpsample2.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    protected var c : Context ? = null
    protected var sesi : Session? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        c = this

        sesi = Session()

    }


}


class Session{
    companion object {
        var nando: String? = null

    }

}