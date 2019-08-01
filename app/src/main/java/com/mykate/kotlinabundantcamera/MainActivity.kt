package com.mykate.kotlinabundantcamera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //    实现点击事件接口
    override fun onClick(p0: View?) {
        if (p0 != null) {
            if (p0.id == R.id.btn) {
                Toast.makeText(this, "点击了按钮", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "点击失败", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, "p0 is null", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.text = "kotlin的setText"
//        以下的点击方式要比实现接口的方式更舒服一些
        btn.setOnClickListener { btnOnClickView() }
    }

    private fun btnOnClickView() {
        Toast.makeText(this, "通过方法点击了按钮", Toast.LENGTH_LONG).show()
        var intent = Intent()
//        以下的跳转不是很懂,双冒号,反射？
        intent.setClass(this, TextActivity::class.java)
        startActivity(intent)

    }
}
