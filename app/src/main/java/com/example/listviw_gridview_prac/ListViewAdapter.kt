package com.example.listviw_gridview_prac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviw_gridview_prac.R
import com.example.listviw_gridview_prac.databinding.ItemListviewBinding

class ListViewAdapter(context: Context, private val data: List<String>) :
    ArrayAdapter<String>(context, R.layout.item_listview, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView: View
        val binding: ItemListviewBinding
        if (convertView == null) {
            binding = ItemListviewBinding.inflate(LayoutInflater.from(context), parent, false)
            itemView = binding.root
            itemView.tag = binding
        } else {
            binding = convertView.tag as ItemListviewBinding
            itemView = convertView
        }
        val item = data[position]

        binding.tv1.text = item

        return itemView!!
    }
}