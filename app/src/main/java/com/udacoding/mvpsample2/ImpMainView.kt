package com.udacoding.mvpsample2

import com.udacoding.mvpsample2.base.BaseView
import com.udacoding.mvpsample2.model.HasilHitung

//todo 3
interface ImpMainView : BaseView {

    fun hasilData(model : HasilHitung)

}