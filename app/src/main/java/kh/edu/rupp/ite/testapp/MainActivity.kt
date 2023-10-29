package kh.edu.rupp.ite.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //....................
    private fun displayFragment(fragment: Fragment){
        val fragmentTransaction= supportFragmentManager.beginTransaction()
        // Replace Fragment in lytFragment
        fragmentTransaction.replace(R.id.lytFragment, fragment)
        //Commit transaction
        fragmentTransaction.commit()
    }
}