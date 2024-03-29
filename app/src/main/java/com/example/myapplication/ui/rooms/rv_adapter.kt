package com.example.myapplication.ui.rooms

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.RvWingBinding

class rv_adapter(var datalist: ArrayList<rv_model>,var context: Context):RecyclerView.Adapter<rv_adapter.MyViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var binding=RvWingBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return  datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.wingname.text=datalist.get(position).wingname
    }
    inner class MyViewHolder(var binding: RvWingBinding): RecyclerView.ViewHolder(binding.root)
    fun setData(newDataList: List<rv_model>) {
        var dataList = newDataList
        notifyDataSetChanged()
    }

}