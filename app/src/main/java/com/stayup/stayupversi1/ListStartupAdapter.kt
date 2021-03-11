package com.stayup.stayupversi1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListStartupAdapter(private val listStartup: ArrayList<Startup>) :
        RecyclerView.Adapter<ListStartupAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Startup)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
                LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_startup, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val Startup = listStartup[position]

        Glide.with(holder.itemView.context)
                .load(Startup.image)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)

        holder.tvName.text = Startup.name
        holder.tvDetail.text = Startup.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listStartup[holder.adapterPosition])

        }
    }

    override fun getItemCount(): Int {
        return listStartup.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}