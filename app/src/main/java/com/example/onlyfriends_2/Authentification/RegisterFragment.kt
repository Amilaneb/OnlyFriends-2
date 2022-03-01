package com.example.onlyfriends_2.Authentification

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlyfriends_2.R
import com.example.onlyfriends_2.UserActivityFragmentInteraction
import com.example.onlyfriends_2.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    lateinit var binding: FragmentRegisterBinding
    var interactor: UserActivityFragmentInteraction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        interactor = context as? UserActivityFragmentInteraction
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.alreadyBtn.setOnClickListener {
            interactor?.showLogin()
        }
        binding.validateBtn.setOnClickListener{
            interactor?.makeRequest(
                binding.email.text.toString(),
                binding.password.text.toString(),
                null,
                null,
                true
            )
        }
    }
}