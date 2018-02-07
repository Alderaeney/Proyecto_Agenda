public class Cita {

    private String titulo;
    private String descripcion;
    private int hora;
    private int minutos;

    public Cita(String titulo, String descripcion, int hora, int minutos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.hora = hora;
        this.minutos = minutos;
    }

    public String leerCita(){
        StringBuilder st = new StringBuilder();

        st.append("").append(this.getHora()).append(":").append(this.getMinutos()).append("-");
        st.append(this.getTitulo()).append("\n");
        st.append(this.getDescripcion()).append("\n\n");
        return st.toString();
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

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
