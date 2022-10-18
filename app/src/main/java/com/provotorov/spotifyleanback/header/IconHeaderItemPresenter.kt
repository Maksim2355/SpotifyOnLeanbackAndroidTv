package com.provotorov.spotifyleanback.header

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.RowHeaderPresenter
import com.provotorov.spotifyleanback.R
import com.provotorov.spotifyleanback.header.data.IconHeaderItem

class IconHeaderItemPresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return RowHeaderPresenter.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_header_with_icon, null))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {
        val headerItem = (item as ListRow).headerItem as IconHeaderItem
        val rootView = viewHolder.view
        rootView.findViewById<ImageView>(R.id.header_iv).apply {
            setImageDrawable(ContextCompat.getDrawable(context, headerItem.iconResId))
        }
        rootView.findViewById<TextView>(R.id.header_tv).apply {
            text = headerItem.name
        }
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {
    }
}