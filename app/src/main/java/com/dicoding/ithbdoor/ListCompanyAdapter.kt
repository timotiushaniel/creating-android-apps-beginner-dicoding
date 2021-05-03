package com.dicoding.ithbdoor

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*
import kotlin.collections.ArrayList

class ListCompanyAdapter(private val listCompanies: ArrayList<Company>): RecyclerView.Adapter<ListCompanyAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_joblist, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val company = listCompanies[position]

        Glide.with(holder.itemView.context)
            .load(company.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = company.name
        holder.tvField.text = company.field
        holder.tvLocation.text = company.location

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailJob::class.java)

            moveDetail.putExtra(DetailJob.EXTRA_NAME, company.name)
            moveDetail.putExtra(DetailJob.EXTRA_FIELD, company.field)
            moveDetail.putExtra(DetailJob.EXTRA_PHOTO, company.photo)
            moveDetail.putExtra(DetailJob.EXTRA_LOCATION, company.location)
            moveDetail.putExtra(DetailJob.EXTRA_DETAIL, company.detail)
            moveDetail.putExtra(DetailJob.EXTRA_SENDEMAIL,company.sendEmail)

            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listCompanies.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvField: TextView = itemView.findViewById(R.id.tv_item_field)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_item_location)
    }

}