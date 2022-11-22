package com.example.madpractical9_20012021073

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.example.madpractical9_20012021073.databinding.SmsItemViewBinding
import android.view.ViewGroup
import android.widget.ArrayAdapter

class SMSViewAdapter(context: Context, private val array:ArrayList<SMSView>):
    ArrayAdapter<SMSView>(context,array.size,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val currentSms:SMSView?=getItem(position)
        val binding= SmsItemViewBinding.inflate(LayoutInflater.from(context))
        binding.textviewPhoneNo.text=currentSms!!.phoneno
        binding.textviewMessage.text=currentSms!!.massage
        return binding.root
    }
}