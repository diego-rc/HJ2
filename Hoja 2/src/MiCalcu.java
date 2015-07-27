/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author diego_000
 */
public class MiCalcu implements Calculadora {
    
    protected String cadena;
    protected Stack<Integer> data;
    
    public MiCalcu(){
        data=new StackVector<>();
    }
    
    public MiCalcu(int var){
        data=new StackVector<>(var);
    }
    
    @Override
    public void setString(String linea){
        cadena = linea;
    }
    
    @Override
    public int getResultado(){
        return data.peek();
    }
    
    @Override
    public void meterVector(){
        this.calcularVector();
    }
    
}
