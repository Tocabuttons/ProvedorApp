package com.example.provedorapp.clases;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class Categoria {

    private int id;
    private String categoria;
    private String img;

    public Categoria() {
    }

    public Categoria(int id) {
        this.id = id;
    }

    public Categoria(int id, String categoria, String img) {
        this.id = id;
        this.categoria = categoria;
        this.img = img;
    }

    @NonNull
    @Override
    public String toString() {
        return categoria;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        Categoria c2 = (Categoria) obj;
        return id == c2.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public static DiffUtil.ItemCallback<Categoria> itemCallback = new DiffUtil.ItemCallback<Categoria>() {
        @Override
        public boolean areItemsTheSame(@NonNull Categoria oldItem, @NonNull Categoria newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Categoria oldItem, @NonNull Categoria newItem) {
            return false;
        }

    };
}
