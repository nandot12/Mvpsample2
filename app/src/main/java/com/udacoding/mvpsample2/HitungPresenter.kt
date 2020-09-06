package com.udacoding.mvpsample2

import com.udacoding.mvpsample2.base.BasePresenter
import com.udacoding.mvpsample2.model.HasilHitung
import com.udacoding.mvpsample2.model.HitungInterface

//todo 4
class HitungPresenter : BasePresenter<ImpMainView>,HitungInterface {

    var imp : ImpMainView? = null

    override fun hitung(a : Int, b : Int){
        val jml = a.plus(b)
        val model = HasilHitung(jml)
        imp?.hasilData(model)
    }

    //todo 5
    override fun attach(view: ImpMainView) {
        imp = view
    }

    override fun detach() {
        imp = null
    }
}