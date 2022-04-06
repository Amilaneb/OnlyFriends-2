package com.example.onlyfriends_2.Account

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlyfriends_2.EditProfilActivityFragmentInteraction
import com.example.onlyfriends_2.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    lateinit var binding: FragmentAccountBinding
    private var interactor: EditProfilActivityFragmentInteraction?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.editBtn.setOnClickListener {
            interactor?.showEditProfil()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1000 && resultCode == Activity.RESULT_OK){
            if(data==null || data.data ==null) return
            val selectedImage = data.data
            binding.leftPicture?.setImageURI(selectedImage)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        interactor = context as? EditProfilActivityFragmentInteraction
    }

}

