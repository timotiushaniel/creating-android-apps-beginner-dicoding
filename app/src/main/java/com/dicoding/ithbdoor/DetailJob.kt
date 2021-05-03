package com.dicoding.ithbdoor

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text

class DetailJob : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_job)
        val actionbar = supportActionBar


        val imgDetailPhoto:ImageView = findViewById(R.id.img_item_photo)
        val tvSetLocation:TextView = findViewById(R.id.tv_location)
        val tvSetDetail:TextView = findViewById(R.id.tv_detail)
        val send_email:FloatingActionButton = findViewById(R.id.send_email)
        val tvSetField:TextView = findViewById(R.id.tv_item_field)


        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tLoc = intent.getStringExtra(EXTRA_LOCATION)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tField = intent.getStringExtra(EXTRA_FIELD)
        val tSendEmail = intent.getStringExtra(EXTRA_SENDEMAIL)

        send_email.setOnClickListener(){
            val sendEmailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$tSendEmail"))
            startActivity(sendEmailIntent)
        }

        actionbar!!.title =tName.toString()
        actionbar.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgDetailPhoto)
        tvSetField.text = tField
        tvSetLocation.text = tLoc + "\n"
        tvSetDetail.text = tDetail
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_FIELD = "extra_field"
        const val EXTRA_SENDEMAIL = "extra_sendemail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}