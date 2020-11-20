package kr.co.neoplus.pizzaorderpractice_20201115.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kotlinx.android.synthetic.main.fragment_myinfo.*
import kr.co.neoplus.pizzaorderpractice_20201115.EditNickNameActivity
import kr.co.neoplus.pizzaorderpractice_20201115.R

class MyInfo : Fragment() {

    val REQ_FOR_DATA = 1000
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_myinfo, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Glide.with(context!!).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoX6lhTZKutDXlSB0r6828aCbXuxj91BgHUg&usqp=CAU").into(myPhoto)

        //닉네임 변경 화면으로 가기
        changeNickName.setOnClickListener {

            val myIntent = Intent(context!!, EditNickNameActivity::class.java)


            startActivityForResult(myIntent, REQ_FOR_DATA)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_FOR_DATA){
            val newInputData = data?.getStringExtra("newData")
            myNickName.text = newInputData
        }
    }
}