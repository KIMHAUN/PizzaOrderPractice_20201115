package kr.co.neoplus.pizzaorderpractice_20201115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
       // storeNameTxt =

    }
}