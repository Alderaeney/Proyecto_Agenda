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

    public void borrarCita(int hora, int minutos){
        if (this.getCitas().size() == 1){
            if (this.getCitas().get(0).getHora() == hora && this.getCitas().get(0).getMinutos() == minutos){
                this.getCitas().clear();
            }
        } else {
            for (Cita d :
                    this.citas) {
                if (d.getHora() == hora && d.getMinutos() == minutos) {
                    this.citas.remove(d);
                }
            }
        }
    }

    public Cita buscarCita(int hora, int minutos){
        Cita busqueda = null, temp;
        int cont = 0;
        boolean encontrado = false;

        while (cont < this.citas.size() && !encontrado){
            temp = this.citas.get(cont++);
            if (temp.getHora() == hora && temp.getMinutos() == minutos){
                busqueda = temp;
                encontrado = true;
            }
        }
        return busqueda;
    }

    public void leerPagina(){
        StringBuilder st = new StringBuilder(this.getDia() + "/" + this.getMes() + "\n");
        if (this.citas.isEmpty()){
            st.append("La página está en blanco.\n");
        } else {
            for (Cita c :
                    this.citas) {
                st.append(c.leerCita());
            }
            System.out.println(st.toString());
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
