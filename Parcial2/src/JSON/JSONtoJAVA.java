package JSON;

import Excepciones.Menor1990Excepcion;
import Excepciones.UserNameRepetido;
import Modulos.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashSet;

public class JSONtoJAVA {
    public JSONtoJAVA() {
    }

    public void J2J(ClaseEnvoltorioGenerica<String, Usuario<Rol>> CEG) {
        String jsonResponse=JsonUtiles.leer("src/JSON/datos");
        try {
            JSONArray jsonArray=new JSONArray(jsonResponse);
            for (int i=0;i<jsonArray.length();i++)
            {
                JSONObject jsonObject1=jsonArray.getJSONObject(i);
                String id,email,apiKey,userName,createdAt,updatedAt;
                id=jsonObject1.getString("id");
                email=jsonObject1.getString("email");
                apiKey=jsonObject1.getString("apiKey");
                userName=jsonObject1.getString("username");
                createdAt=jsonObject1.getString("createdAt");
                updatedAt=jsonObject1.getString("updatedAt");

                JSONArray jsonArrayRoles=jsonObject1.getJSONArray("roles");
                HashSet<Rol> roles=new HashSet<>();
                for (int j=0;j<jsonArrayRoles.length();j++)
                {
                    Rol rol=new Rol(jsonArrayRoles.getString(j));
                    roles.add(rol);
                }

                JSONObject jsonObject2= jsonObject1.getJSONObject("profile");
                JSONObject jsonObjectLocation=jsonObject2.getJSONObject("location");

                Location location=new Location(jsonObjectLocation.getDouble("long"),
                        jsonObjectLocation.getDouble("lat"));

                Perfil perfil=new Perfil(jsonObject2.getString("dob"),jsonObject2.getString("name"),
                        jsonObject2.getString("about"),jsonObject2.getString("address"),
                        jsonObject2.getString("company"),location);
                Usuario<Rol> usuario=new Usuario<>(roles,perfil,id,email,apiKey,userName,createdAt,updatedAt);
                //AGREGO USUARIO
                CEG.agregar(usuario,userName);
            }
        } catch (JSONException | UserNameRepetido e) {
            System.out.println(e.getMessage());
        }
    }
}
