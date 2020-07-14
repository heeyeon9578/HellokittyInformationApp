package com.example.hellokittyinformation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hellokittyinformation.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    //HomeFragment에 출력할 뷰를 생성하여 반환
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        /* 로그인 버튼을 눌렀을 때 이벤트 처리 */
        rootView.btn_signin.setOnClickListener {

            /*  NavController를 이용하여  navigate() 인자로 전달된 action의 destination으로 이동
                - homeFragment에서 signinFragment로 이동
            */
            findNavController().navigate(R.id.action_homeFragment_to_signinFragment)
        }

        /* 회원가입 버튼을 눌렀을 때 이벤트 처리 */
        rootView.btn_signup.setOnClickListener {
            //homeFragment에서 signupFragment 화면으로 이동
            findNavController().navigate(R.id.action_homeFragment_to_signupFragment)
        }
        return rootView
    }
}//end of HomeFragment

