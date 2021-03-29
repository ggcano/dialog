package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.dialog.databinding.DialogCustomBinding

class CustomDialogFragment: DialogFragment() {

    private var _binding: DialogCustomBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogCustomBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.textView.text = "Hola que tal"

        _binding!!.buttonCancel.setOnClickListener {
            dismiss()
        }

        _binding!!.buttonAccept.setOnClickListener {

                val pickTextview = binding.textView.text
                val result = pickTextview.toString()
                Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
                dismiss()


        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}