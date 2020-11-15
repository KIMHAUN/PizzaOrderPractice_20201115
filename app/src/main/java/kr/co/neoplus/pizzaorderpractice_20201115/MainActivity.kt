package kr.co.neoplus.pizzaorderpractice_20201115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.neoplus.pizzaorderpractice_20201115.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {
    lateinit var mvpa : MainViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        pizzaViewPager.adapter = mvpa

        pizzaTabLayout.setupWithViewPager(pizzaViewPager)
    }


}