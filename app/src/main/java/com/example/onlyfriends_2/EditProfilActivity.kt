package com.example.onlyfriends_2

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.example.onlyfriends_2.databinding.ActivityEditProfilBinding
import com.example.onlyfriends_2.databinding.ActivityHomeBinding
import java.net.URI


class EditProfilActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEditProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        uploadedImage = binding.profilPhoto

        listenClickToAccount()
        listenClickPicture()
        }
    private var uploadedImage: ImageView? =null

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1000 && resultCode == Activity.RESULT_OK){
            if(data==null || data.data ==null) return
            val selectedImage = data.data
            uploadedImage?.setImageURI(selectedImage)
        }
    }

    private fun listenClickToAccount() {
        binding.returnToAccount.setOnClickListener {
            val intent = Intent(this@EditProfilActivity,HomeActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
    private fun listenClickPicture() {
        binding.profilPhoto.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(intent, IMAGE_CHOOSE)
        }
    }
    companion object {
        private const val IMAGE_CHOOSE = 1000;
    }
    }
