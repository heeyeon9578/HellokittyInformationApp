package com.example.hellokittyinformation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.hellokittyinformation.R
import kotlinx.android.synthetic.main.fragment_info.*

/**
 * A simple [Fragment] subclass.
 */
class InfoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //spinner에 표시할 아이탬
        var list_of_items = arrayOf("♡이름♡", "♡역사♡", "♡키티의 가족♡", "♡키티의 친구♡","♡관련 사업♡")

        //spinner에서 아이템을 선택하였을때 보여줄 summary
        var list_of_summary = arrayOf("헬로키티: 일본의 캐릭터 회사 산리오에서 1974년에 출시한 오리지널 캐릭터. 일본의 대표 캐릭터이자 대중문화의 상징 중 하나로, 현재까지도 전세계 사람들에게 많은 사랑을 받고 있는 캐릭터이다. 전세계 미디어믹스 총 수입 2위(860억 달러)의 포켓몬스터 다음가는 괴물콘텐츠로 전 세계 미디어 믹스 프랜차이즈 규모, 현재 헬로키티의 판권 추정치(총 자산 가치)는 무려 20조가 넘으며, 각종 굿즈 및 엔터테인먼트 사업, 그리고 콜라보레이션 등의 라이센스 사업으로 해마다 약 4조원 이상을 벌고 있다.",
            "최초로 키티를 탄생시킨 사람은 산리오의 디자이너였던 시미즈 유코(清水侑子)키티의 생모였지만 키티를 만든지 얼마 되지 않아서 산리오를 떠나게 되었다. 이후 2대 요네쿠보 세츠코(米窪節子)키티의 유모를 거쳐 3대 디자이너인 야마구치 유코(山口裕子)키운 엄마에 이르러 지금의 이미지와 위상이 정립되었다. 미디어에서는 사실상 야마구치 유코를 키티의 어머니로 부른다. 낳은 정 보다는 기른 정이 더 크다",
            "미미 화이트,조지 화이트,메리 화이트,앤서니 화이트,마거릿 화이트,타이니 참,챠미 키티,슈가",
            "디어 다니엘, 캐시, 몰리, 주디, 조이, 로티,로리, 팀&타미, 피피, 티피, 트레이시, 조디, 토마스",
            "무기[9], 약물[10][11], 담배[12] 빼고는 모든 것이 키티 제품으로 나왔다.고 할 정도로 상상을 초월하는 규모의 캐릭터 상품 시장이 형성되어 있다. 키티 와인이 나오면서 키티 술[13]까지 나왔다. 사람이 쓸 수 있는 물건의 거의 대다수를 차지하고 있는 것이다. 마음만 먹으면 헬로키티 제품으로 일상 생활을 도배하는 게 가능하며, 이렇게 다양한 상품 시장 덕에 키티 물건 몇 개만 사도 매니아가 될 수 있다.")


        //어답터 설정 - 안드로이드에서 제공하는 어답터를 연결
        spinner.adapter =
            ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_dropdown_item, list_of_items)

        //아이템 선택 리스너
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(p0: AdapterView<*>?) {
                println("알고싶은 정보를 클릭하세요.")
            }

            //아이템을 선택하였을 때
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                println("당신이 알고 싶은 정보는 " + list_of_items[position] + "입니다.")
                //선택한 정보에 대해 알려준다.
                tv_summary.text = list_of_summary[position]
            }
        }

    }
}



