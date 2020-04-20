package com.example.terapanimvo.ui.magang

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.terapanimvo.JurusanActivity
import com.example.terapanimvo.R
import kotlinx.android.synthetic.main.magang_fragment.*

class MagangFragment : Fragment() {

    companion object {
        fun newInstance() = MagangFragment()
    }

    private lateinit var viewModel: MagangViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.magang_fragment, container, false)
        val cardJurusan = root.findViewById(R.id.cardJurusan) as CardView

//        cardPerusahaan.setOnClickListener {
//            startActivity(Intent(this, IdentitasActivity::class.java))
//        }
        cardJurusan.setOnClickListener {
            startActivity(Intent(activity, JurusanActivity::class.java))
        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(MagangViewModel::class.java)
        // TODO: Use the ViewModel
    }

}