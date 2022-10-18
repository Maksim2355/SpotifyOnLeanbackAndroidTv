package com.provotorov.spotifyleanback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.*
import com.provotorov.spotifyleanback.header.IconHeaderItemPresenter

class BrowseSpotifyFragment : BrowseSupportFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareScreen()
    }

    private fun prepareScreen() {
        setHeaderPresenterSelector(object : PresenterSelector() {
            override fun getPresenter(item: Any?): Presenter {
                return IconHeaderItemPresenter()
            }
        })
        isHeadersTransitionOnBackEnabled = true

        val listAdapter = ArrayObjectAdapter(ListRowPresenter())
        adapter = listAdapter
    }
}