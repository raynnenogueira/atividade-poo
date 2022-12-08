package sobrescrita;

public class Estagiario extends Funcionario{

    @Override
    public double getSalario(int horas){
        return horas*50;
    }
}
