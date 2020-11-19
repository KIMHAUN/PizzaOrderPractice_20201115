package kr.co.neoplus.pizzaorderpractice_20201115

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kr.co.neoplus.pizzaorderpractice_20201115.BuildConfig.DEBUG
import kr.co.neoplus.pizzaorderpractice_20201115.datas.PizzaStore

class ViewPizzaStoreDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)
        setValues()
        setupEvents()
    }
    override fun setupEvents() {
       // val pizzaStore = intent.getSerializableExtra("pizzaStoreData") as PizzaStore


    }

    override fun setValues() {

        val pizzaStore = intent.getSerializableExtra("pizzaStoreData") as PizzaStore
        storeNameTxt.text = pizzaStore.name
        phoneNoTxt.text = pizzaStore.phoneNo
        Glide.with(mContext).load(pizzaStore.logoURL).into(pizzaLogoImg)

        callBtn.setOnClickListener {
            //Log.DEBUG("call button click")
            val pl = object : PermissionListener{
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:"+pizzaStore.phoneNo)
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext, "권한이 거부되어 통화연결이 불가능합니다.", Toast.LENGTH_SHORT).show()
                }
            }

            TedPermission.with(mContext)
                    .setPermissionListener(pl)
                    .setDeniedMessage("전화 권한을 거부하면 연결이 불가합니다.")
                    .setPermissions(android.Manifest.permission.CALL_PHONE)
                    .check()
        }


    }
}