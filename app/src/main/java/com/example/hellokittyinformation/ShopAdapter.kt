package com.example.hellokittyinformation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shop_list.view.*

//ShopAdapter 클래스 선언
class ShopAdapter(val context:Context, val shop_DataArray: ArrayList<ShopData>): RecyclerView.Adapter<ShopAdapter.ItemViewHolder>(){

    //어댑터에서 관리하는 아이템의 개수를 반환
    override fun getItemCount() = ShopData.values().size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopAdapter.ItemViewHolder {
        val adapterView=
            LayoutInflater.from(parent.context).inflate(R.layout.shop_list, parent, false)

        return ItemViewHolder(adapterView)
    }//end of onCreateViewHolder

    //뷰홀더에 데이터를 바인딩
    override fun onBindViewHolder(holder: ShopAdapter.ItemViewHolder, position: Int) {

        //데이터 바인딩
        holder.bindShopData(ShopData.values()[position])


    }//end of onBindViewHolder

    //뷰홀더 클래스 선언
    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //아이템뷰에 ShopData 데이터 바인딩
        fun bindShopData(shopData: ShopData){
            itemView.tv_item_shop.text = shopData.shop
            itemView.tv_item_info.text=shopData.shopDetail
            itemView.img_shop.setImageResource(shopData.imgRes)
            itemView.tv_item_url.text=shopData.shopUrl


        }//end of bindShopData
    }//end of ItemViewHolder
}//end of ShopAdapter