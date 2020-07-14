package com.example.hellokittyinformation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hellokittyinformation.R
import com.example.hellokittyinformation.ShopAdapter
import com.example.hellokittyinformation.ShopData


/**
 * A simple [Fragment] subclass.
 */
class ShopFragment : Fragment() {

    //ShopData를 불러와 shop_DataArray에 저장
    val shop_DataArray: ArrayList<ShopData> = ArrayList()
    lateinit var recyclerView: RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        var rootView= inflater.inflate(R.layout.fragment_shop, container, false)


        recyclerView = rootView.findViewById(R.id.rv_shop!!)as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ShopAdapter(requireContext(),shop_DataArray)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    } //end of onViewCreated
}//end Of ShopFragment
