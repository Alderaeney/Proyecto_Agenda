public class Agenda {

    private int ano;
    private Pagina[] paginas;
    private Pagina paginaAbierta;

    public Agenda(int ano) {
        this.ano = ano;
        this.paginas = new Pagina[365];
    }



    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public Pagina getPaginaAbierta() {
        return paginaAbierta;
    }

    public void setPaginaAbierta(Pagina paginaAbierta) {
        this.paginaAbierta = paginaAbierta;
    }
}
