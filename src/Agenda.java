public class Agenda {

    private int ano;
    private Pagina[] paginas;
    private Pagina paginaAbierta;

    public Agenda(int ano) {
        this.ano = ano;
        if (ano % 4 == 0){
            inicializa(true);
        } else inicializa(false);
    }

    private void inicializa(boolean b){
        this.paginas = new Pagina[b ? 366 : 365];
        int dia = 0;
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 1);
        }
        for (int i = 1; i <= (b ? 29 : 28) ; i++) {
            paginas[dia++] = new Pagina(i, 2);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 3);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 4);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 5);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 6);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 7);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 8);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 9);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 10);
        }
        for (int i = 1; i <= 30; i++) {
            paginas[dia++] = new Pagina(i, 11);
        }
        for (int i = 1; i <= 31; i++) {
            paginas[dia++] = new Pagina(i, 12);
        }
    }

    public Pagina buscarPagina(int dia, int mes){
        Pagina busqueda = null, temp;
        int cont = 0;
        boolean encontrado = false;

        while (cont < paginas.length && !encontrado){
            temp = paginas[cont++];
            if (temp.getDia() == dia && temp.getMes() == mes){
                busqueda = temp;
                encontrado = true;
            }
        }
        return busqueda;
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
