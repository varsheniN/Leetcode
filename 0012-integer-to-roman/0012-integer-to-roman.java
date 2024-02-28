class Solution {
    public String intToRoman(int num) {
        String ones[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
      String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
     String hndrs[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String thns[]={"","M","MM","MMM"};
    return thns[num/1000]+hndrs[(num%1000)/100]+tens[(num%100)/10]+ones[num%10];
    }
}