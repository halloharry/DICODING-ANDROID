package com.example.gituser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gituser.databinding.ActivityDetailBinding

class ActivityDetail : AppCompatActivity() {

    private lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val githubUser =
            intent.getParcelableExtra<UserModel>(USER_EXTRA) as UserModel

        detailBinding.apply {
            tvUsername.text = getString(R.string.get_username, githubUser.username)
            tvName.text = githubUser.name
            imgPhoto.setImageResource(githubUser.photoProfile)
            tvCompany.text = githubUser.company
            tvLocation.text = githubUser.location
            tvRepository.text = githubUser.repository
            tvFollowers.text = githubUser.followers
            tvFollowing.text = githubUser.following
        }
    }

    companion object {
        const val USER_EXTRA = "extra_user"
    }
}