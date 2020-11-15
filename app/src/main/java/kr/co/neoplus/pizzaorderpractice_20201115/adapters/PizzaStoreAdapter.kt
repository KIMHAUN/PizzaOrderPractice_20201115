package kr.co.neoplus.pizzaorderpractice_20201115.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.co.neoplus.pizzaorderpractice_20201115.datas.PizzaStore

class PizzaStoreAdapter(val mContext: Context,
                        val resId: Int,
                        val mList: ArrayList<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {
}