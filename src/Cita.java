public class Cita {

    private String titulo;
    private String descripcion;
    private int horaIni;
    private int horaFin;

    public Cita(String titulo, String descripcion, int horaIni, int horaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(int horaIni) {
        this.horaIni = horaIni;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}
