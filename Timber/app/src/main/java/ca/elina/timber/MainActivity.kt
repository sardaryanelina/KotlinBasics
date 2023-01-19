package ca.elina.timber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import ca.elina.timber.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.i("MainActivity", "Default Android Logging API: onCreate called")

        Timber.tag("LifeCycles")
        Timber.d("Activity Created")
        Timber.i("Timber Logging API: onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "Default Android Logging API: onStart called")
        Timber.i("Timber Logging API: onStart called")
    }
}
