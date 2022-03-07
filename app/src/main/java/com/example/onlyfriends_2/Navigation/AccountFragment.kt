package com.example.onlyfriends_2.Navigation

import android.content.Context
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

    override fun onAttach(context: Context) {
        super.onAttach(context)
        interactor = context as? EditProfilActivityFragmentInteraction
    }

}

