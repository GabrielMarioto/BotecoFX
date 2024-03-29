
package util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class ConsultaAPI 
{
    public static String consultaCep(String cep)
    {
        
        StringBuffer dados = new StringBuffer();
        try {
            //URL url = new URL("http://apps.widenet.com.br/busca-cep/api/cep.json?code=" + cep );
            URL url = new URL("https://viacep.com.br/ws/"+cep+"/json/");
            
            URLConnection con = url.openConnection();
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setAllowUserInteraction(false);
            InputStream in = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String s = "";
            while (null != (s = br.readLine()))
                 dados.append(s);
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return dados.toString();
    }
    static public void main (String[] args)
    {
        String sjson = consultaCep("19050040");   
        JSONObject obj = new JSONObject(sjson);
        System.out.println(sjson);
        System.out.println(obj.getString("logradouro").length());
    }
}
