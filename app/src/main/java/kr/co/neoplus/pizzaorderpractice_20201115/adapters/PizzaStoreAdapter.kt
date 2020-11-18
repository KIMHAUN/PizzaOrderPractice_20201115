package kr.co.neoplus.pizzaorderpractice_20201115.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kr.co.neoplus.pizzaorderpractice_20201115.R
import kr.co.neoplus.pizzaorderpractice_20201115.datas.PizzaStore

class PizzaStoreAdapter(val mContext: Context,
                        val resId: Int,
                        val mList: ArrayList<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.pizza_list_item, null)
        }
        val row = tempRow!!

        val pizzaData = mList[position]
        //val phoneNoTxt = row.findViewById<TextView>(R.id.phoneNoTxt)
        val storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)
        val pizzaLogoImg = row.findViewById<ImageView>(R.id.pizzaLogoImg)

       // phoneNoTxt.text = pizzaData.phoneNo
        storeNameTxt.text = pizzaData.name
        val pizzaLogoURL = pizzaData.logoURL
       // pizzaLogoImg.text = pizzaData.logoURL


       Glide.with(mContext).load(pizzaLogoURL).into(pizzaLogoImg)
       // addressAndFloor.text = roomData.getFormattedFloor()
        return row
    }
}