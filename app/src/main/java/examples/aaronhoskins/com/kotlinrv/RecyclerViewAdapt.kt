package examples.aaronhoskins.com.kotlinrv

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item.view.*

class RecyclerViewAdapt(val carList : ArrayList<Car>)
    : RecyclerView.Adapter<RecyclerViewAdapt.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(p0.context)
                .inflate(R.layout.item,
                    p0,
                    false))
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.tvCarMake.text = carList[p1].carMake
        p0.tvCarModel.text = carList[p1].carModel
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvCarMake = view.tvMake
        val tvCarModel = view.tvModel
    }
}