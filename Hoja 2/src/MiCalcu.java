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
    protected boolean error;
    
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
        error=this.calcularVector();
        if(!error){
            System.out.println("Error");
            System.out.print("Valores en el Stack"+data);
        }
    }
    
    @Override
    public boolean calcularVector(){
        boolean flag=true;
        
        cadena.replace(" ","");
        for(int i=0; i==cadena.length(); i++){
            String car=cadena.substring(i, i+1);
            if (car.equals("0")||car.equals("1")||car.equals("2")||car.equals("3")||car.equals("4")||car.equals("5")||car.equals("6")||car.equals("7")||car.equals("8")||car.equals("9")){
                data.push(Integer.parseInt(car));
            }
            else if(car.equals("*")||car.equals("+")||car.equals("-")||car.equals("/")){
                if (data.size()<2){
                    flag=false;
                    i=cadena.length();
                }
                else{
                    int dat1;
                    int dat2;
                    dat2=data.pop();
                    dat1=data.pop();
                    if(car.equals("+")){
                        data.push(dat1+dat2);
                    }
                    else if(car.equals("*")){
                        data.push(dat1*dat2);
                    }
                    else if(car.equals("-")){
                        data.push(dat1-dat2);
                    }
                    else if(car.equals("/")){
                        if(dat2==0){
                            flag=false;
                            i=cadena.length();
                            data.push(dat1);
                            data.push(dat2);
                        }
                        else{
                            data.push(dat1/dat2);
                        }
                    }
                    
                }
            }
            else{
                flag=false;
                i=cadena.length();
            }
        }
        
        if(data.size()>1){
            System.out.println("Advertencia: quedaron valores sin operar en la calculadora");
        }
        
        return flag;
    }
    
}
