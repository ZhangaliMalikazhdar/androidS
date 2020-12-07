package com.example.mvpapplication.contract

interface ContractInterface {
    interface View{
        fun initView()
        fun updateViewData()
    }
    interface Presenter{
        fun incrementValue()
        fun decrementCounter()
        fun multCounter()
        fun getCounter(): String
    }
    interface Model{
        fun getCounter():Int
        fun incrementCounter()
        fun decrementCounter()
        fun multCounter()
    }
}