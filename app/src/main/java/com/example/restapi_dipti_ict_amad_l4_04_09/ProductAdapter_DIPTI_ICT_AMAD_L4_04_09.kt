package com.example.restapi_dipti_ict_amad_l4_04_09

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter_DIPTI_ICT_AMAD_L4_04_09(private val productDIPTIICTAMADL40409s: List<Product_DIPTI_ICT_AMAD_L4_04_09>) : RecyclerView.Adapter<ProductAdapter_DIPTI_ICT_AMAD_L4_04_09.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item_dipti_ict_amad_l4_04_09, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productDIPTIICTAMADL40409s[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return productDIPTIICTAMADL40409s.size
    }

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView = itemView.findViewById(R.id.imageTxt)
        private val productName: TextView = itemView.findViewById(R.id.NameTxt)
        private val productPrice: TextView = itemView.findViewById(R.id.priceTxt)
        private val productDescription: TextView =itemView.findViewById(R.id.descriptionTxt)
        private val updatedAt: TextView= itemView.findViewById(R.id.updatedAt)

        fun bind(productDIPTIICTAMADL40409: Product_DIPTI_ICT_AMAD_L4_04_09) {
            Glide.with(itemView)
                .load(productDIPTIICTAMADL40409.images[0])
                .into(productImage)
            productName.text = productDIPTIICTAMADL40409.title
            productPrice.text = "$${productDIPTIICTAMADL40409.price}"
            productDescription.text = productDIPTIICTAMADL40409.description
            updatedAt.text= productDIPTIICTAMADL40409.updatedAt
        }
    }
}