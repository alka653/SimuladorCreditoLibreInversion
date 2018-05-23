package libreinversionvariable;

import java.text.NumberFormat;

/**
 *
 * @author Adriann Sanchez
 */
public class Logic {

    public static boolean validate_int(String value){
        boolean ret = true;
        try { 
            if(value == ""){
                value = "0";
            }
            int val = Integer.parseInt(value); 
            ret = true;
            if(!validade_no_null(val)) ret = false;
        } catch(NumberFormatException e) { 
            ret = false; 
        }
        return ret;
    }
    public static float random(float tasa_interes, String btn_group_option, int cuota_inicial){
        if(btn_group_option == "variable"){
            if(cuota_inicial == 0){
                tasa_interes -= 3;
            }
            Double numero_aleatorio = (double) (Math.random()*1);
            if((numero_aleatorio >= 0 && numero_aleatorio < 0.023) || (numero_aleatorio >= 0.5 && numero_aleatorio < 0.523)){
                tasa_interes += 1;
            }
            if((numero_aleatorio >= 0.023 && numero_aleatorio < 0.45) || (numero_aleatorio >= 0.523 && numero_aleatorio < 0.545)){
                tasa_interes += 0.9;
            }
            if((numero_aleatorio >= 0.045 && numero_aleatorio < 0.068) || (numero_aleatorio >= 0.545 && numero_aleatorio < 0.568)){
                tasa_interes += 0.8;
            }
            if((numero_aleatorio >= 0.068 && numero_aleatorio < 0.091) || (numero_aleatorio >= 0.568 && numero_aleatorio < 0.591)){
                tasa_interes += 0.7;
            }
            if((numero_aleatorio >= 0.091 && numero_aleatorio < 0.114) || (numero_aleatorio >= 0.591 && numero_aleatorio < 0.614)){
                tasa_interes += 0.6;
            }
            if((numero_aleatorio >= 0.114 && numero_aleatorio < 0.136) || (numero_aleatorio >= 0.614 && numero_aleatorio < 0.636)){
                tasa_interes += 0.5;
            }
            if((numero_aleatorio >= 0.136 && numero_aleatorio < 0.159) || (numero_aleatorio >= 0.636 && numero_aleatorio < 0.659)){
                tasa_interes += 0.4;
            }
            if((numero_aleatorio >= 0.159 && numero_aleatorio < 0.182) || (numero_aleatorio >= 0.659 && numero_aleatorio < 0.682)){
                tasa_interes += 0.3;
            }
            if((numero_aleatorio >= 0.182 && numero_aleatorio < 0.205) || (numero_aleatorio >= 0.682 && numero_aleatorio < 0.705)){
                tasa_interes += 0.2;
            }
            if((numero_aleatorio >= 0.205 && numero_aleatorio < 0.227) || (numero_aleatorio >= 0.705 && numero_aleatorio < 0.727)){
                tasa_interes += 0.1;
            }
            if((numero_aleatorio >= 0.227 && numero_aleatorio < 0.250) || (numero_aleatorio >= 0.727 && numero_aleatorio < 0.773)){
                tasa_interes += 0;
            }
            if((numero_aleatorio >= 0.273 && numero_aleatorio < 0.295) || (numero_aleatorio >= 0.773 && numero_aleatorio < 0.795)){
                tasa_interes -= 0.1;
            }
            if((numero_aleatorio >= 0.295 && numero_aleatorio < 0.318) || (numero_aleatorio >= 0.795 && numero_aleatorio < 0.818)){
                tasa_interes -= 0.2;
            }
            if((numero_aleatorio >= 0.318 && numero_aleatorio < 0.341) || (numero_aleatorio >= 0.818 && numero_aleatorio < 0.841)){
                tasa_interes -= 0.3;
            }
            if((numero_aleatorio >= 0.341 && numero_aleatorio < 0.364) || (numero_aleatorio >= 0.841 && numero_aleatorio < 0.864)){
                tasa_interes -= 0.4;
            }
            if((numero_aleatorio >= 0.364 && numero_aleatorio < 0.386) || (numero_aleatorio >= 0.864 && numero_aleatorio < 0.886)){
                tasa_interes -= 0.5;
            }
            if((numero_aleatorio >= 0.386 && numero_aleatorio < 0.409) || (numero_aleatorio >= 0.886 && numero_aleatorio < 0.909)){
                tasa_interes -= 0.6;
            }
            if((numero_aleatorio >= 0.409 && numero_aleatorio < 0.432) || (numero_aleatorio >= 0.909 && numero_aleatorio < 0.932)){
                tasa_interes -= 0.7;
            }
            if((numero_aleatorio >= 0.432 && numero_aleatorio < 0.455) || (numero_aleatorio >= 0.932 && numero_aleatorio < 0.955)){
                tasa_interes -= 0.8;
            }
            if((numero_aleatorio >= 0.455 && numero_aleatorio < 0.477) || (numero_aleatorio >= 0.955 && numero_aleatorio < 0.977)){
                tasa_interes -= 0.9;
            }
            if((numero_aleatorio >= 0.477 && numero_aleatorio < 0.5) || (numero_aleatorio >= 0.977 && numero_aleatorio <= 1)){
                tasa_interes -= 1;
            }
            if(tasa_interes < 3 || tasa_interes > 10){
                if(tasa_interes < 3){
                    return (float) (tasa_interes + 1);
                }
                return (float) (tasa_interes - 1.5);
            }
        }
        return tasa_interes;
    }
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    public static boolean validade_no_null(int value){
        if(value == 0) return false;
        return true;
    }
    public static String[] calc_cuota(double valor_inicial, int numero_cuota, float tasa_interes, String btn_group_option, int cuota_inicial){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double interes = redondearDecimales(random(tasa_interes, btn_group_option, cuota_inicial), 2);
        double factor_valor_presente = 1 / (1 + (double) (interes / 100));
        double valor_intereses = valor_inicial * (interes / 100);
        double valor_cuota = (double) (valor_inicial * ((interes / 100) / (1 - Math.pow((double) factor_valor_presente, (double) numero_cuota))));
        double valor_base = valor_cuota - valor_intereses;
        double saldo = valor_inicial - valor_base;
        String arreglo[] = new String[11];
        arreglo[0] = Double.toString(interes)+" %";
        arreglo[1] = formatter.format(valor_intereses);
        arreglo[2] = formatter.format(valor_base);
        arreglo[3] = formatter.format(valor_cuota);
        arreglo[4] = formatter.format(saldo);
        arreglo[5] = Double.toString(interes);
        arreglo[6] = Double.toString(saldo);
        arreglo[7] = Double.toString(valor_intereses);
        arreglo[8] = Double.toString(valor_cuota);
        arreglo[9] = Double.toString(interes);
        arreglo[10] = Double.toString(valor_base);
        return arreglo;
    }
}
