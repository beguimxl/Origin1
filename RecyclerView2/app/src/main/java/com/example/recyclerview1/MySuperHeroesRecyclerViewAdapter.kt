package com.example.recyclerview1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


import com.example.recyclerview1.SuperHeroesFragment.OnListFragmentInteractionListener
import com.example.recyclerview1.dummy.DummyContent.DummyItem

import kotlinx.android.synthetic.main.fragment_superheroes.view.*
import kotlinx.android.synthetic.main.fragment_superheroes_list.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MySuperHeroesRecyclerViewAdapter(

    private val activity: MainActivity,
    private val mValues: ArrayList<HashMap<String, Any>>
   // private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MySuperHeroesRecyclerViewAdapter.ViewHolder>() {

//    private val mOnClickListener: View.OnClickListener
//
//    init {
//        mOnClickListener = View.OnClickListener { v ->
//            val item = v.tag as DummyItem
//            // Notify the active callbacks interface (the activity, if the fragment is attached to
//            // one) that an item has been selected.
//            mListener?.onListFragmentInteraction(item)
//        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_superheroes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
      //  holder.mIdView.text = item.id
        holder.mContentView.text = item["names"].toString()
        holder.mPower.text = item["powers"].toString()
        holder.mGender.text = item["genders"].toString()

        holder.mView.setOnClickListener {
            Toast.makeText(activity, item["names"].toString(), Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
       // val mIdView: TextView = mView.item_number
        val mContentView: TextView = mView.names
        val mPower: TextView = mView.powers
        val mGender: TextView = mView.genders


//        override fun toString(): String {
//            return super.toString() + " '" + mContentView.text + "'"
//        }
    }
}
