public  class PeselAuthentication {


    private static int supportTab[] = {
            9, 7, 3, 1, 9, 7, 3, 1, 9, 7
    };


    public static boolean checkCorrectness(String pesel){

        if(!isLengthOK(pesel)) {
            System.out.println("ERROR! Kod PESEL ma niepoprawną długość");
            return false;
        }
        if(!isDigits(pesel)){
            System.out.println("ERROR! Podany pesel zawiera niedozwolone znaki");
            return false;
        }

        int[]numericalPesel = getNumericalPesel(pesel);
        int temp = getControlSum(numericalPesel);
        if(temp%10==numericalPesel[10]) {
            return true;
        }else
            return false;
    }

    public static boolean isDigits(String pesel){
        if(!pesel.matches("-?\\d+(\\.\\d+)?")){
            return false;
        }
        return true;
    }


    public static  int[] getNumericalPesel(String pesel){


        char chars[] = pesel.toCharArray();
        int peselNumeric[] = new int[pesel.length()];

        for(int i=0;i<pesel.length();i++) {
            peselNumeric[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        return peselNumeric;
    }

    public static int getControlSum(int[] peselNumeric){

        int controlSum=0;
        for(int i = 0; i<supportTab.length;i++){
            controlSum+=supportTab[i]*peselNumeric[i];
        }

        return controlSum;
    }

    public static boolean isLengthOK(String pesel){

        if(pesel.length()==11)
            return true;
        else
            return false;
    }

}
