package kr.co.neoplus.pizzaorderpractice_20201115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kr.co.neoplus.pizzaorderpractice_20201115.datas.PizzaStore

class ViewPizzaStoreDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)

        setupEvents()
        setValues()
    }
    override fun setupEvents() {
    }

    override fun setValues() {

        val pizzaStore = intent.getSerializableExtra("pizzaStoreData") as PizzaStore
        storeNameTxt.text = pizzaStore.name
        phoneNoTxt.text = pizzaStore.phoneNo
        Glide.with(mContext).load(pizzaStore.logoURL).into(pizzaLogoImg)


    }
}