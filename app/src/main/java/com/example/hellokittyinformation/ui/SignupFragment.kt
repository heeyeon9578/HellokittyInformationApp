package com.example.hellokittyinformation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hellokittyinformation.R
import kotlinx.android.synthetic.main.fragment_signup.view.*

class SignupFragment : Fragment() {

    //SignupFragment에 출력할 뷰를 생성하여 반환
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_signup, container, false)

        //fragment_signup_btn 버튼 클릭 이벤트 처리
        rootView.fragment_signup_btn.setOnClickListener {
            //NavController를 이용하여  navigate() 인자로 전달된 action의 destination으로 이동
            findNavController().navigate(R.id.action_signupFragment_to_infoFragment)
        }
        return rootView
    }
}
