package funzioni;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andeg
 */
public class Fornitori {

    private int idFornitore;
    private String ragioneSociale;
    private String partitaIva;
    private String telefono;
    private String email;
    private String prodotto;
    private double prezzoUnitario;
    private int scontoPercentuale;
    private int tempoConsegnaGiorni;

    public Fornitori(int idFornitore, String ragioneSociale, String partitaIva,
            String telefono, String email, String prodotto,
            double prezzoUnitario, int scontoPercentuale,
            int tempoConsegnaGiorni) {

        this.setIdFornitore(idFornitore);
        this.setRagioneSociale(ragioneSociale);
        this.setPartitaIva(partitaIva);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setProdotto(prodotto);
        this.setPrezzoUnitario(prezzoUnitario);
        this.setScontoPercentuale(scontoPercentuale);
        this.setTempoConsegnaGiorni(tempoConsegnaGiorni);
    }
    
    public Fornitori() {

        this.setIdFornitore(0);
        this.setRagioneSociale("");
        this.setPartitaIva("");
        this.setTelefono("");
        this.setEmail("");
        this.setProdotto("");
        this.setPrezzoUnitario(0.0);
        this.setScontoPercentuale(0);
        this.setTempoConsegnaGiorni(0);
    }
    

    

    public int getIdFornitore() {
        return idFornitore;
    }

    public void setIdFornitore(int idFornitore) {

        if (idFornitore < 0) {
            throw new IllegalArgumentException("Invalid Supplier ID");
        }

        this.idFornitore = idFornitore;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {

        if (ragioneSociale == null || ragioneSociale.trim().isEmpty()) {
            throw new IllegalArgumentException("Mandatory company name");
        }

        this.ragioneSociale = ragioneSociale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {

        if (partitaIva == null || partitaIva.trim().isEmpty()) {
            throw new IllegalArgumentException("VAT number required");
        }

        if (partitaIva.length() != 11) {
            throw new IllegalArgumentException("VAT number must have 11 characters");
        }

        this.partitaIva = partitaIva;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number required");
        }

        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email required");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        this.email = email;
    }

    public String getProdotto() {
        return prodotto;
    }

    public void setProdotto(String prodotto) {

        if (prodotto == null || prodotto.trim().isEmpty()) {
            throw new IllegalArgumentException("Mandatory product");
        }

        this.prodotto = prodotto;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {

        if (prezzoUnitario <= 0) {
            throw new IllegalArgumentException("Price not valid");
        }

        this.prezzoUnitario = prezzoUnitario;
    }

    public int getScontoPercentuale() {
        return scontoPercentuale;
    }

    public void setScontoPercentuale(int scontoPercentuale) {

        if (scontoPercentuale < 0 || scontoPercentuale > 100) {
            throw new IllegalArgumentException("Discount not valid");
        }

        this.scontoPercentuale = scontoPercentuale;
    }

    public int getTempoConsegnaGiorni() {
        return tempoConsegnaGiorni;
    }

    public void setTempoConsegnaGiorni(int tempoConsegnaGiorni) {

        if (tempoConsegnaGiorni < 0) {
            throw new IllegalArgumentException("Invalid delivery time");
        }

        this.tempoConsegnaGiorni = tempoConsegnaGiorni;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "Supplier ID=" + idFornitore +
                ", Company name=" + ragioneSociale +
                ", VAT number=" + partitaIva +
                ", Phone number=" + telefono +
                ", Email=" + email +
                ", Product=" + prodotto +
                ", Unit price=" + prezzoUnitario +
                ", Discount=" + scontoPercentuale +
                ", Delivery time=" + tempoConsegnaGiorni +
                '}';
    }
}

