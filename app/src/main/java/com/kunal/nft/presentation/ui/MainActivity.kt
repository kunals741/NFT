package com.kunal.nft.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.kunal.nft.presentation.ui.screen.NFTApp
import com.kunal.nft.presentation.ui.theme.NFTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NFTTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NFTApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}