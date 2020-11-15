package kr.co.neoplus.pizzaorderpractice_20201115.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.neoplus.pizzaorderpractice_20201115.fragments.MyInfo
import kr.co.neoplus.pizzaorderpractice_20201115.fragments.PizzaOrder

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> PizzaOrder()
            else-> MyInfo()
        }
    }
}