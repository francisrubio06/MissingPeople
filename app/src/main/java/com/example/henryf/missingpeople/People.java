package com.example.henryf.missingpeople;

/**
 * Created by Francisco Rubio on 5/15/2016.
 */
public class People {
    private String nombre;
    private int idDrawable;

    public People(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static People[] ITEMS = {
            new People("Nombre 1", R.drawable.i1),
            new People("Nombre 2", R.drawable.i2),
            new People("Nombre 3", R.drawable.i3),
            new People("Nombre 4", R.drawable.i4),
            new People("Nombre 5", R.drawable.i5),
            new People("Nombre 6", R.drawable.i6),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return People
     */
    public static People getItem(int id) {
        for (People item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
