

/**
 *
 * @author qmarqeva
 */
public class Convert {


    public void convert(String numHex) {
        //String a Hex
        int conHex = Integer.parseInt(numHex, 16);
        //Hex a Binario
        String binary = Integer.toBinaryString(conHex);
        //Presentacion
        System.out.println(numHex + " = " + completeDigits(binary));
    }

    public String completeDigits(String binNum) {
        for (int i = binNum.length(); i < 8; i++) {
            binNum = "0" + binNum;
        }
        return binNum;
    }

    public static void main(String[] args) {

        //Numeros de Prueba
        String[] hexNums = {"1", "A1", "ef", "BA", "AA", "BB",
            "19", "01", "02", "03", "04"};
        Convert objConvert = new Convert();

        for (String num : hexNums) {
            objConvert.convert(num);
        }
    }
}
