package com.cotlin.helloandroid

import android.os.Bundle
import com.highcapable.betterandroid.ui.component.activity.AppBindingActivity
import com.cotlin.helloandroid.databinding.ActivityMainBinding

class MainActivity : AppBindingActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Gán text vào TextView (có sẵn trong binding)
        binding.messageText.text = "Hello! App runs successfully!"
    }
}
