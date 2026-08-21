package aed;

public class Fecha {
    // Declaramos los atributos privados que va a tener la clase
    private Integer dia;
    private Integer mes;
    
    // El constructor recibe los valores de dia y mes y los setea como lso atributos de la clase Fecha
    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
    }

    // El metodo dia devuelve el dia de la clase fecha, que es this.dia
    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes;
    }

    public String toString() {
        return this.dia+"/"+this.mes;
    }

    // Chequeamos primos si el objeto a comparar tiene clase nula o distinta a Fecha, luego casteamos al objeto para asignarle los atributos de dia y mes
    @Override
        public boolean equals(Object otra) {
        if (otra.getClass() == null){
            return false;
        }
        else if (otra.getClass() != this.getClass()){
            return false;
        }
        else{
            Fecha otraFecha = (Fecha) otra;
            return dia == otraFecha.dia && mes == otraFecha.mes;
        }    
    }

    // Si estamos en 31 de Dic. tenemos que setear el atributo dia y mes a 1,1. Si no vemos si estamos en el ultimo dia de un mes usanto el atributo de diasEnMes, si ese es el caso entonces le sumamos 1 al mes y seteamos el dia a 1. Sino solo sumamos 1 al dia acutal
    public void incrementarDia() {
        if (this.mes == 12 && this.dia == 31){
            this.dia = 1;
            this.mes = 1;
        }
        else if (diasEnMes(this.mes) == this.dia){
            this.dia = 1;
            this.mes += 1;
        }

        else{
            this.dia += 1;
        }   
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
