package production.zhandos.instagram.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import production.zhandos.instagram.R
import production.zhandos.instagram.search.grid.ImageAdapter

class SearchFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        val gridView = view.findViewById<GridView>(R.id.grid_view)

        gridView.adapter = ImageAdapter(this.context)
        return view
    }
}