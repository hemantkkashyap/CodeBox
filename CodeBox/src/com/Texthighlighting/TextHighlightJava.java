package com.Texthighlighting;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TextHighlightJava {
    
    
    public List<String> getARraylist(){
        List<String> wordList = new ArrayList<>(Arrays.asList("import","package","class","public","static","if","for","while","else","else if","new","int"));
      return wordList;
    }
     public static Map<String,Color> getHashmap(){
      
       Map<String, Color> colorMap1 = new HashMap<>();
       String[] strrMap1 ={"import","package","class","public","static","if","for","while","else","else if","new","int"};
      Color commonValue1 = Color.BLUE;
         for (String str : strrMap1){
            colorMap1.put(str, commonValue1);
        }
          Map<String, Color> colorMap2 = new HashMap<>();
       String[] strrMap2 ={"(",")"};
      Color commonValue2 = Color.YELLOW;
         for (String str : strrMap2){
            colorMap2.put(str, commonValue2);
        }
         
         for (Map.Entry<String, Color> entry : colorMap2.entrySet()) {
            String key = entry.getKey();
            Color value = entry.getValue();
            colorMap1.put(key, value);
        }     
       return colorMap1;
}
    public static void main(String args[]){
        TextHighlightJava t = new TextHighlightJava();
getHashmap();
    }
            }
