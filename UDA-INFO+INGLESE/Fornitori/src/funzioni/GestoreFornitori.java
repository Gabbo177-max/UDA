package funzioni;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author andeg
 */
public class GestoreFornitori {
    private ArrayList<Fornitori> fornitori = new ArrayList<>();

    public ArrayList<Fornitori> getFornitori() {
        return fornitori;
    }

    public void aggiungi(Fornitori f) {
        fornitori.add(f);
    }

    public void svuota() {
        fornitori.clear();
    }

    public ArrayList<Fornitori> getByProdotto(String prodotto) {
        ArrayList<Fornitori> risultato = new ArrayList<>();

        for (Fornitori f : fornitori) {
            if (f.getProdotto().equalsIgnoreCase(prodotto)) {
                risultato.add(f);
            }
        }
        return risultato;
    }

    public ArrayList<Fornitori> migliorPrezzo(String prodotto) {
        ArrayList<Fornitori> lista = new ArrayList<Fornitori>();

        for (Fornitori f : fornitori) {
            if (f.getProdotto().equalsIgnoreCase(prodotto)) {
                lista.add(f);
            }
        }
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).getPrezzoUnitario() > lista.get(j + 1).getPrezzoUnitario()) {

                    Fornitori temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }
}

