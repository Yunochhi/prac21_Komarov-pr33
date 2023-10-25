package com.example.criminalintent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class NextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_next_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            goBack()
        }
    }

    private fun goBack() {
        fragmentManager?.popBackStack()
    }

    companion object {
        private const val MESSAGE = "message"

        fun newInstance(message: String): NextFragment {
            val fragment = NextFragment()
            val bundle = Bundle()
            bundle.putString(MESSAGE, message)
            fragment.arguments = bundle
            return fragment
        }
    }
}


