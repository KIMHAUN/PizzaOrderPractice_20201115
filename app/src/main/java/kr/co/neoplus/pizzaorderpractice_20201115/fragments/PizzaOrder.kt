package kr.co.neoplus.pizzaorderpractice_20201115.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kr.co.neoplus.pizzaorderpractice_20201115.R
import kr.co.neoplus.pizzaorderpractice_20201115.adapters.PizzaStoreAdapter
import kr.co.neoplus.pizzaorderpractice_20201115.datas.PizzaStore

class PizzaOrder : Fragment() {
    var pizzaStoreList = ArrayList<PizzaStore>()
    lateinit var mPizzaStoreAdapter: PizzaStoreAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }
}