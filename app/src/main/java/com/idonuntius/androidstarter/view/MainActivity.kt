package com.idonuntius.androidstarter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.idonuntius.androidstarter.databinding.ActivityMainBinding
import com.idonuntius.androidstarter.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val textView = viewBinding.textMain
        viewModel.text.collectIn(this) {
            textView.text = it
        }
    }
}
