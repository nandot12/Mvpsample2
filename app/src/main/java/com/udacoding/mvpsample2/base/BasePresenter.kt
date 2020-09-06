package com.udacoding.mvpsample2.base


//todo 1
interface BasePresenter<in N> {

    fun attach(view : N)
    fun detach()
}