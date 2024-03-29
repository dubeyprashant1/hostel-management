package com.example.myapplication.ui.rooms

object rv_constant {
    private lateinit var dataList: ArrayList<rv_model>
    fun getData():ArrayList<rv_model>{

        dataList= ArrayList<rv_model>()
        dataList.add(rv_model("Lalita"))
        dataList.add(rv_model("Kalpana Chawla"))
        dataList.add(rv_model("Mother Teresa"))
        dataList.add(rv_model("Sarojini Naidu"))
        dataList.add(rv_model("Kasturba"))
        return dataList
    }
}