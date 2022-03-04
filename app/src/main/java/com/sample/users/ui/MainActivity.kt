package com.sample.users.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.sample.users.R
import com.sample.users.db.User
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        btn_insert.setOnClickListener {
            val user = User(userName = edt_user.text.toString())
            viewModel.insertUser(user)
        }

        viewModel.userData.observe(this) {
            txt_users.text =""
            it.forEach {
                txt_users.append(it.userName +"\n ")
            }
        }
    }
}
