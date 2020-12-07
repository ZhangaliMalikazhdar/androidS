package com.example.f6.presenter

import com.example.f6.contract.ContractInterface
import com.example.f6.model.MainModel

class MainPresenter(private val _view:ContractInterface.View):ContractInterface.Presenter {
    private val model:ContractInterface.Model = MainModel()
    init {
        _view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        _view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}