package com.example.menutextuelle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var mail : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mail =findViewById(R.id.mail)
        registerForContextMenu(mail)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contextemenu,menu)
        if (menu!=null){
            menu.setHeaderTitle("ContextMenu")
        }
    }
}