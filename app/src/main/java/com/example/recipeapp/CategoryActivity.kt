package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_posts.*
const val EXTRA_CATEGORY = "EXTRA_CATEGORY"
class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        btnBreakfast.setOnClickListener {
            val intent = Intent(this, PostsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, "Breakfast")
            startActivity(intent)
        }

        btnLunch.setOnClickListener {
            val intent = Intent(this, PostsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, "Lunch")
            startActivity(intent)
        }

        btnDinner.setOnClickListener {
            val intent = Intent(this, PostsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, "Dinner")
            startActivity(intent)
        }

        btnDrink.setOnClickListener {
            val intent = Intent(this, PostsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, "Drink")
            startActivity(intent)
        }

        btnSnack.setOnClickListener {
            val intent = Intent(this, PostsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, "Snack")
            startActivity(intent)
        }

        btnBaking.setOnClickListener {
            val intent = Intent(this, PostsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, "Baking")
            startActivity(intent)
        }
    }
}