package com.example.kotlinappresources

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.kotlinappresources.databinding.FragmentOverviewBinding

class OverviewFragment : Fragment(), OnClickListener {

    private lateinit var binding: FragmentOverviewBinding
    private lateinit var intent: Intent

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOverviewBinding.inflate(inflater, container, false)

        intent = Intent(activity, VouchersActivity::class.java)

        binding.cardVouchers.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.card_vouchers -> {
                startActivity(intent)
            }
        }
    }
}