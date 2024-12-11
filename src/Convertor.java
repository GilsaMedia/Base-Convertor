public class Convertor extends AlphabetValues {
    private int num;
    private int base;
    private String convertedNum;

    public Convertor(int num, int base) {
        this.num = num;
        this.base = base;
        checkBase();
    }
    
    private void checkBase() {
        if (getBase() == 2) {
            binary();
        }
        else if (getBase() < 36 && getBase() > 1 && getBase() != 10) {
            notBinary();
        } else if (getBase() == 10) {
            System.out.println("I'm only converting numbers from base 10");
            setConvertedNum(String.valueOf(getNum()));
        } else System.out.println("I'm sorry but I'm not capable of converting to that base");
    }
    
    private void binary() {
        String newBaseNum = "";
        int newDivider = getNum();
        while (newDivider != 0) {
            newBaseNum += newDivider - ((newDivider / getBase()) * getBase());
            newDivider /= getBase();
        }
        newBaseNum = binaryBytes(newBaseNum);
        newBaseNum = reversedNum(newBaseNum);
        setConvertedNum(newBaseNum);
    }

    private void notBinary() {
        String newBaseNum = "";
        int newDivider = getNum();
        int crnNum;
        while (newDivider != 0) {
            crnNum = newDivider - ((newDivider / getBase()) * getBase());
            if (crnNum > 9) {
                newBaseNum += getLetterFromValue(crnNum);
            } else {
                newBaseNum += newDivider - ((newDivider / getBase()) * getBase());
            }
            newDivider /= getBase();
        }
        newBaseNum = reversedNum(newBaseNum);
        setConvertedNum(newBaseNum);
    }

    private String reversedNum(String isntReversed) {
        String reveredStr = "";
        int i = isntReversed.length();
        while (i != 0) {
            reveredStr += isntReversed.charAt(i-1);
            i--;
        }
        return reveredStr;
    }

    public int getNum() {
        return num;
    }

    public int getBase() {
        return base;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setBase(int base) {
        this.base = base;
    }

    private void setConvertedNum(String convertedNum) {
        this.convertedNum = convertedNum;
    }

    private String binaryBytes(String num) {
        while (!(num.length() % 4 == 0)) {
             num += 0;
        }
        return num;
    }

    public String getConvertedNum() {return convertedNum;}
}
