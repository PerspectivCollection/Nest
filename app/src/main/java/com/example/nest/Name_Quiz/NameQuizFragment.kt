package com.example.nest.Name_Quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.nest.model.Bird

class NameQuizFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?


    ): View? {





        Toast.makeText(context, "${Bird.getBird().get(1).name}", Toast.LENGTH_LONG).show()




















        return view
}

}