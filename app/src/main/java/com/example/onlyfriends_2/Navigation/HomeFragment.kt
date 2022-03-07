package com.example.onlyfriends_2.Navigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlyfriends_2.PostAdapter
import com.example.onlyfriends_2.R
import com.example.onlyfriends_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var items : List<String> = listOf("https://d2r83x5xt28klo.cloudfront.net/5425_eZ1Z7xDI8e3xIKon_b.jpg", "https://www.jhlacrocon.com/pub/media/catalog/product/cache/72a6d53dc5882e7dd1632db308d11b00/c/m/cm6640_20210613174252040.jpg")
        loadList(items)
    }
    private fun loadList(items: List<String>) {
        Log.d("list", "load list")
        binding.posts.layoutManager = LinearLayoutManager(requireActivity())
        val adapter = PostAdapter(items)
        binding.posts.adapter = adapter
    }
}

