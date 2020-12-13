package com.code.ezarsatria.mylistview

import android.view.View
import android.widget.ImageView
import android.widget.TextView

private class ViewHolder internal constructor(view: View) {
    private val txtName: TextView = view.findViewById(R.id.txt_name)
    private val txtDescription: TextView = view.findViewById(R.id.txt_description)
    private val imgPhoto: ImageView = view.findViewById(R.id.img_photo)
    internal fun bind(hero: Hero) {
        txtName.text = hero.name
        txtDescription.text = hero.description
        imgPhoto.setImageResource(hero.photo)
    }
}