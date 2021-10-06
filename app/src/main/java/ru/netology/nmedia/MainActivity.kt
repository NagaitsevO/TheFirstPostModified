package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.netology.nmedia.dto.Post

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val post = Post(
        id = 1,
        author = "@sample/posts.json/data/author",
        content = "@sample/posts.json/data/content",
        published = "@sample/posts.json/data/published",
        likes = Integer.parseInt("@sample/posts.json/data/likes"),
        shared = Integer.parseInt("@sample/posts.json/data/shared"),
        views = Integer.parseInt("@sample/posts.json/data/views"),
        likedByMe = false
)

        imageViewLikes.setOnClickListener {
            if (post.likedByMe) {
                imageViewLikes.setImageResource(R.drawable.ic_baseline_favorite_24)
                post.likes++
            }
            else {
                imageViewLikes.setImageResource(R.drawable.ic_twotone_favorite_border_24)
                post.likes--
            }
        }
    }
}