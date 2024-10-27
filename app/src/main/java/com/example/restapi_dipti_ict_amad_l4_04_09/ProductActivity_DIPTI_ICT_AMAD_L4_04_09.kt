package com.example.restapi_dipti_ict_amad_l4_04_09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductActivity_DIPTI_ICT_AMAD_L4_04_09 : AppCompatActivity() {
    private lateinit var productViewModelDIPTIICTAMADL40409: ProductViewModel_DIPTI_ICT_AMAD_L4_04_09
    private lateinit var productAdapterDIPTIICTAMADL40409: ProductAdapter_DIPTI_ICT_AMAD_L4_04_09
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_dipti_ict_amad_l4_04_09)
        productViewModelDIPTIICTAMADL40409 = ViewModelProvider(this).get(ProductViewModel_DIPTI_ICT_AMAD_L4_04_09::class.java)
        productAdapterDIPTIICTAMADL40409 = ProductAdapter_DIPTI_ICT_AMAD_L4_04_09(emptyList())

        val refreshBtn: FloatingActionButton = findViewById(R.id.refresh)

        refreshBtn.setOnClickListener {
            startActivity(Intent(this, ProductActivity_DIPTI_ICT_AMAD_L4_04_09::class.java))
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.productRV)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productAdapterDIPTIICTAMADL40409

        productViewModelDIPTIICTAMADL40409.products.observe(this, Observer { products ->
            products?.let {
                productAdapterDIPTIICTAMADL40409 = ProductAdapter_DIPTI_ICT_AMAD_L4_04_09(it)
                recyclerView.adapter = productAdapterDIPTIICTAMADL40409
            }
        })
    }
}