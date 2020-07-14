package com.example.hellokittyinformation.ui

import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.fragment.app.Fragment
import com.example.hellokittyinformation.R
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_timer.*


class TimerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_timer, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var stopTime : Long = 0

        /*startBtn을 눌렀을 때 발생하는 이벤트-> 타이머가 작동*/
        startBtn.setOnClickListener{

            chronometer.base = SystemClock.elapsedRealtime() + stopTime
            chronometer.start();
            startBtn.visibility = View.GONE
            pauseBtn.visibility = View.VISIBLE

        }

        /*pauseBtn을 눌렀을 때 발생하는 이벤트-> 타이머가 잠시 멈춤*/
        pauseBtn.setOnClickListener{

            stopTime = chronometer.base - SystemClock.elapsedRealtime()
            chronometer.stop()
            startBtn.visibility = View.VISIBLE
            pauseBtn.visibility = View.GONE
        }

        /*resetBtn을 눌렀을 때 발생하는 이벤트-> 타이머가 처음부터 재시작*/
        resetBtn.setOnClickListener {

            chronometer.base = SystemClock.elapsedRealtime()
            stopTime = 0
            chronometer.stop();
            startBtn.visibility = View.VISIBLE
            pauseBtn.visibility = View.GONE

        }

    }

}


