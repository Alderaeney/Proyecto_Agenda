import java.util.ArrayList;

public class Pagina {

    private int dia;
    private int mes;
    private ArrayList<Cita> citas;

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.citas = new ArrayList<>();
    }

    public void anadirCita(Cita c){
        this.citas.add(c);
    }

    public void borrarCita(Cita c){
        for (Cita d :
                this.citas) {
            if (d.getHora() == d.getHora() && d.getMinutos() == c.getMinutos()) {
                this.citas.remove(d);
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
}
