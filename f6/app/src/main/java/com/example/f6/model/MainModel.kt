package com.example.f6.model

import com.example.f6.contract.ContractInterface

class MainModel :ContractInterface.Model{
    private var mCounter = 0
    override fun getCounter(): Int {
        return mCounter
    }

    override fun incrementCounter() {
        mCounter++
    }
}