package sar.microservicio.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class McService {
     private String result = "";
     private String [] arrayText;
     private StringTokenizer countPa;

     @Autowired
     ServiceGetSet srv;
     public String processText(String inputText){
          try {
               srv.setText(inputText);
               System.out.println("ini " + srv.getText());
               Thread.sleep(100);
               if (srv.getText().length() < 2) {
                    srv.setMensajeSalida("Formato inválido: el texto debe comenzar con un número seguido de '\\'");
               }
               Pattern pattern = Pattern.compile("^\\d+\\\\");
               Matcher matcher = pattern.matcher(srv.getText());
               if (matcher.find()) {
                    arrayText = inputText.split("\n");
               }
               result = "";
               for (String line : arrayText) {
                    if (line != null && !line.isEmpty()) {
                         srv.setReadLine(line);
                         if (srv.getReadLine().length() > 0) {
                              srv.setConverSub(Character.getNumericValue(srv.getReadLine().charAt(0)));
                              srv.setPlainStr(srv.getReadLine().replaceAll("[^a-zA-Z\\s]", "").trim());
                              countPa = new StringTokenizer(srv.getPlainStr());
                              srv.setCount(countPa.countTokens());
                              if (srv.getCount() == srv.getConverSub()) {
                                   result += srv.getPlainStr().toLowerCase() + '\\' + "true" + "\n";
                              } else {
                                   result += srv.getPlainStr().toLowerCase() + '\\' + "false" + "\n";
                         }
                    }
               }
          }
               srv.setMensajeSalida(result);
          } catch (Exception e) {
               System.out.println("error " + e);
          }
          return srv.getMensajeSalida();
     }
}
