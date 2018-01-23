package Chpater1;

import java.util.Hashtable;

/**
 * Created by YangHC on 2018-01-23.
 */
public class Problem1_1 {
    private String str;

    public boolean hasDuplicatedWord() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            if(hashtable.get(temp)==null){
                hashtable.put(temp,0);
            }else{
                System.out.println("중복 문자 존재");
                return true;
            }
        }
        System.out.println("중복 문자 존재하지 않음");
        return false;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
