package org.franciscozuccala.codetest.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.franciscozuccala.codetest.R

class UsersListActivity: AppCompatActivity(R.layout.activity_users_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, UsersListFragment())
                .commit()
        }
    }
}