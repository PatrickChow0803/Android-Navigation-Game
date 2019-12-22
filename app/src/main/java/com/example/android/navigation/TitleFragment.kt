package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_title.*

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        playButton.setOnClickListener {view: View ->
            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
        }

        return binding.root
    }


}
