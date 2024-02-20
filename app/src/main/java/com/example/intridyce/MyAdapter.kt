package com.example.intridyce

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.intridyce.databinding.ItemBinding

class MyAdapter(val Items: MutableList<ItemData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    interface ItemClick{
        fun onClick(view: View, position: Int)
    }

    var itemClick:ItemClick? = null
    inner class MyViewHolder(val binding : ItemBinding):RecyclerView.ViewHolder(binding.root){
        val imageView = binding.imgItem
        val nicknameView = binding.tvNickname
        val nameView = binding.tvName
        val priceView = binding.tvPrice
        val chatView = binding.tvChat
        val likecount = binding.tvHeart
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun getItemCount(): Int {
        return Items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.setOnClickListener{itemClick?.onClick(it,position)
        }
        holder.imageView.setImageResource(Items[position].Image)
        holder.nicknameView.text = Items[position].nickname
        holder.nameView.text = Items[position].name
        holder.priceView.text = Items[position].Price.toString()
        holder.likecount.text = Items[position].Like.toString()
        holder.likecount.text = Items[position].interestCnt.toString()
        holder.chatView.text = Items[position].Chat.toString()
    }

}