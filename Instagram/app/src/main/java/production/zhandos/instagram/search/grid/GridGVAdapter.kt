package production.zhandos.instagram.search.grid


import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView
import production.zhandos.instagram.R


class ImageAdapter(private var context: Context? = null) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return list[position].toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView?

        if (convertView == null) {
            imageView = ImageView(context)
            imageView.layoutParams = AbsListView.LayoutParams(85, 85)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }

        imageView.setImageResource(list[position])

        imageView.layoutParams.width = 650
        imageView.layoutParams.height = 650
        return imageView
    }


    private var list = mutableListOf(
        R.drawable.a, R.drawable.b, R.drawable.c,
        R.drawable.d, R.drawable.g, R.drawable.e,
        R.drawable.f, R.drawable.h, R.drawable.space,
        R.drawable.a, R.drawable.b, R.drawable.c,
        R.drawable.d, R.drawable.g, R.drawable.e,
        R.drawable.f, R.drawable.h, R.drawable.space)

}