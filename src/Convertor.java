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
        else if (getBase() < 36 && getBase() > 1) {
            notBinary();
        } else System.out.println("I'm sorry but I'm not capable of converting ti that base");
    }
    
    private void binary() {
//        TODO: Need to make its always use nBytes (1Byte, 2Byte ext...)

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
        newBaseNum = reversedNumAboveTen(newBaseNum);
        setConvertedNum(newBaseNum);
    }

    private String reversedNumAboveTen(String isntReversed) {
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

    public String getConvertedNum() {
        return convertedNum;
    }
}
