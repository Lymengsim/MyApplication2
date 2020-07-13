package com.example.myapplication2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

public class ProductsViewHolder extends RecyclerView.ViewHolder {

    private TextView productName;
    private TextView productPrice;
    private TextView productCode;
    private TextView expiredDate;
    private SimpleDraweeView imgProduct;

    public ProductsViewHolder(@NonNull View itemView) {
        super(itemView);

        productName = itemView.findViewById(R.id.txt_productName);
        productPrice = itemView.findViewById(R.id.txt_productPrice);
        productCode = itemView.findViewById(R.id.txt_productCode);
        expiredDate = itemView.findViewById(R.id.txt_expiredDate);
        imgProduct = itemView.findViewById(R.id.img_product);

    }

    public  void bind(Product product){
        productName.setText((product.getProductName()));
        productPrice.setText( product.getPrice()+"");
        productCode.setText(product.getCode());
        expiredDate.setText(product.getExpiredDate()+"");
        imgProduct.setImageURI(product.getImageProduct());
    }
}
