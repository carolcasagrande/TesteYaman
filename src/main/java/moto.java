public class moto {
    public String cor;
    public String modelo;
    public String marca;
    public Integer ano;
    public Double velocidadeMaxima;

    public Boolean alarmeLigado;

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Integer getAno(){
        return this.ano;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public Double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }

    public Double getAlarmeLigado(){
        return this.alarmeLigado;
    }

    public void setAlarmeLigado(Double alarmeLigado) { this.alarmeLigado = alarmeLigado; }

    public moto(String cor, String modelo, String marca, Integer ano){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }


}
