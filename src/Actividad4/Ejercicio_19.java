/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

import java.util.LinkedHashMap;
public class Ejercicio_19 {
    private LinkedHashMap<String, Integer> listaCompras = new LinkedHashMap<>();
    public Ejercicio_19() {
        listaCompras.put("Manzanas", 6);
        listaCompras.put("Leche", 4);
        listaCompras.put("Melón", 1);
        listaCompras.put("Yogurt", 6);
        listaCompras.put("Cereal", 3);
    }
    public void showShoppingList() {
        System.out.println("lista de compras:");
        for (String product : listaCompras.keySet()) {
            System.out.println("- " + product + ": " + listaCompras.get(product));
        }
    }
    public void addMilk() {
        listaCompras.put("leche", listaCompras.get("leche") + 3);
    }
    public void removeBread() {
        listaCompras.remove("melon");
    }
    public void updateYogurt() {
        listaCompras.put("Yogurt", 5);
    }
    public void addOranges() {
        listaCompras.put("naranjas", 4);
    }
    public static void main(String[] args) {
        Ejercicio_19 shoppingList = new Ejercicio_19();
        shoppingList.showShoppingList();
        shoppingList.addMilk();
        shoppingList.removeBread();
        shoppingList.updateYogurt();
        shoppingList.addOranges();
        shoppingList.showShoppingList();
    }
}
