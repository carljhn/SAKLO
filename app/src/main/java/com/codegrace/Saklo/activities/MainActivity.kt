package com.codegrace.Saklo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.codegrace.Saklo.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {
    private var firebaseAuth: FirebaseAuth? = null
    var mAuthListener: FirebaseAuth.AuthStateListener? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeStatusBarTextColor()

        firebaseAuth = FirebaseAuth.getInstance()

        val btnAppoint = findViewById<Button>(R.id.btnAppoint)
        btnAppoint.setOnClickListener {
            val intentAppoint = Intent(this, AppointmentActivity::class.java)
            startActivity(intentAppoint)
        }
        val btnDrugs = findViewById<Button>(R.id.btnDrugs)
        btnDrugs.setOnClickListener {
            val intentDrugs = Intent(this, RemediesActivity::class.java)
            startActivity(intentDrugs)
        }
        val btnHerbal = findViewById<Button>(R.id.btnHerbal)
        btnHerbal.setOnClickListener {
            val intentHerbal = Intent(this, RemediesActivity::class.java)
            startActivity(intentHerbal)
        }

        val btnLogout = findViewById<Button>(R.id.btnSignout)
        btnLogout.setOnClickListener {
            firebaseAuth!!.signOut()
            val intentLogout = Intent(this, RegisterLoginActivity::class.java)
            startActivity(intentLogout)
        }

        mAuthListener = FirebaseAuth.AuthStateListener { firebaseAuth ->
            val user = firebaseAuth.currentUser
        }

        firebaseAuth?.addAuthStateListener(mAuthListener!!)
    }

    override fun onDestroy() {
        super.onDestroy()
        firebaseAuth?.removeAuthStateListener(mAuthListener!!)
    }

    override fun onBackPressed() {
        val user = firebaseAuth?.currentUser
        handleBackPressed(user)
    }

    private fun handleBackPressed(user: FirebaseUser?) {
        if (user != null) {
            finishAffinity()
            finish()
        } else {
            startActivity(Intent(this@MainActivity, RegisterLoginActivity::class.java))
            finish()
        }
    }

    private fun changeStatusBarTextColor() {
        val decorView: View = window.decorView
        WindowCompat.setDecorFitsSystemWindows(window, true)
        WindowInsetsControllerCompat(window, decorView).run {
            isAppearanceLightStatusBars = true
            isAppearanceLightNavigationBars = true
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }
}