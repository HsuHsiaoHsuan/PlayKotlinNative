package idv.freeman.playkotlinnative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import idv.freeman.mpp.helloKotlinMpp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", helloKotlinMpp())
    }
}
