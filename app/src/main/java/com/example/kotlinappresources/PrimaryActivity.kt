package com.example.kotlinappresources

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.kotlinappresources.databinding.ActivityPrimaryBinding

class PrimaryActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityPrimaryBinding
    private var button: Int = 0

    @SuppressLint("ResourceAsColor", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //region SETS COLORS ON START
        binding.buttonWallet.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
        binding.buttonCards.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
        binding.buttonCredit.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
        binding.buttonLoans.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
        binding.buttonSavings.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))

        binding.buttonWallet.setTextColor(ContextCompat.getColor(this, R.color.gray))
        binding.buttonCards.setTextColor(ContextCompat.getColor(this, R.color.gray))
        binding.buttonCredit.setTextColor(ContextCompat.getColor(this, R.color.gray))
        binding.buttonLoans.setTextColor(ContextCompat.getColor(this, R.color.gray))
        binding.buttonSavings.setTextColor(ContextCompat.getColor(this, R.color.gray))
        //endregion

        binding.textAccountName.text = "@ACCOUNT"

        setClickListeners()
    }

    //region SETTING ON CLICK LISTENERS
    private fun setClickListeners() {
        binding.imageButtonOne.setOnClickListener(this)
        binding.imageButtonTwo.setOnClickListener(this)
        binding.imageButtonThree.setOnClickListener(this)

        binding.buttonCards.setOnClickListener(this)
        binding.buttonCredit.setOnClickListener(this)
        binding.buttonLoans.setOnClickListener(this)
        binding.buttonSavings.setOnClickListener(this)
        binding.buttonWallet.setOnClickListener(this)
    }
    //endregion

    @SuppressLint("ResourceAsColor")
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.imageButton_one -> {
                button = 1
                setSelectedNavigation(button)
            }

            R.id.imageButton_two -> {
                button = 2
                setSelectedNavigation(button)
            }

            R.id.imageButton_three -> {
                button = 3
                setSelectedNavigation(button)
            }
            /*
            BUTTON ORDER
            - WALLET
            - SAVINGS
            - CREDIT
            - LOANS
            - CARDS
             */
            R.id.button_wallet -> {
                button = 4
                setSelectedNavigation(button)
            }
            R.id.button_savings -> {
                button = 5
                setSelectedNavigation(button)
            }
            R.id.button_credit -> {
                button = 6
                setSelectedNavigation(button)
            }
            R.id.button_loans -> {
                button = 7
                setSelectedNavigation(button)
            }
            R.id.button_cards -> {
                button = 8
                setSelectedNavigation(button)
            }
        }
    }

    //region COLOR CHANGER
    @SuppressLint("ResourceAsColor")
    private fun setSelectedNavigation(button: Int){
        when(button){
            1 -> {
                binding.imageButtonOne.setColorFilter(ContextCompat.getColor(this, R.color.green_alternative))
                binding.imageButtonTwo.setColorFilter(ContextCompat.getColor(this, R.color.white))
                binding.imageButtonThree.setColorFilter(ContextCompat.getColor(this, R.color.white))
            }
            2 -> {
                binding.imageButtonOne.setColorFilter(ContextCompat.getColor(this, R.color.white))
                binding.imageButtonTwo.setColorFilter(ContextCompat.getColor(this, R.color.green_alternative))
                binding.imageButtonThree.setColorFilter(ContextCompat.getColor(this, R.color.white))
            }
            3 -> {
                binding.imageButtonOne.setColorFilter(ContextCompat.getColor(this, R.color.white))
                binding.imageButtonTwo.setColorFilter(ContextCompat.getColor(this, R.color.white))
                binding.imageButtonThree.setColorFilter(ContextCompat.getColor(this, R.color.green_alternative))
            }
            /*
            BUTTON ORDER
            - WALLET
            - SAVINGS
            - CREDIT
            - LOANS
            - CARDS
             */
            4 -> {
                binding.buttonWallet.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                binding.buttonSavings.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCredit.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonLoans.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCards.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))

                binding.buttonWallet.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.buttonSavings.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCredit.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonLoans.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCards.setTextColor(ContextCompat.getColor(this, R.color.gray))
            }
            5 -> {
                binding.buttonWallet.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonSavings.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                binding.buttonCredit.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonLoans.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCards.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))

                binding.buttonWallet.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonSavings.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.buttonCredit.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonLoans.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCards.setTextColor(ContextCompat.getColor(this, R.color.gray))
            }
            6 -> {
                binding.buttonWallet.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonSavings.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCredit.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                binding.buttonLoans.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCards.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))

                binding.buttonWallet.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonSavings.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCredit.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.buttonLoans.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCards.setTextColor(ContextCompat.getColor(this, R.color.gray))
            }
            7 -> {
                binding.buttonWallet.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonSavings.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCredit.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonLoans.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
                binding.buttonCards.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))

                binding.buttonWallet.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonSavings.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCredit.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonLoans.setTextColor(ContextCompat.getColor(this, R.color.white))
                binding.buttonCards.setTextColor(ContextCompat.getColor(this, R.color.gray))
            }
            8 -> {
                binding.buttonWallet.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonSavings.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCredit.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonLoans.setBackgroundColor(ContextCompat.getColor(this, R.color.gray_light))
                binding.buttonCards.setBackgroundColor(ContextCompat.getColor(this, R.color.black))

                binding.buttonWallet.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonSavings.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCredit.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonLoans.setTextColor(ContextCompat.getColor(this, R.color.gray))
                binding.buttonCards.setTextColor(ContextCompat.getColor(this, R.color.white))
            }
        }
    }
    //endregion
}