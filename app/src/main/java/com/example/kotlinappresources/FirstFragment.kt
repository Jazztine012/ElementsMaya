package com.example.kotlinappresources

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.kotlinappresources.databinding.ActivityMainBinding
import com.example.kotlinappresources.databinding.FragmentFirstBinding

class FirstFragment : Fragment(), OnClickListener {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.editTextPasswordInput.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

        return view
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.editText_passwordInput -> {
                TODO()
            }
        }
    }
}