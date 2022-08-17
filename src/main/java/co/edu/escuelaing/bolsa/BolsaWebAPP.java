/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.escuelaing.bolsa;

import static spark.Spark.*;

/**
 *
 * @author cristian.forero-m
 */
public class BolsaWebAPP {

    public static void main(String[] args) {
        port(getPort());
        
        get("/hello", (req, res) -> {
            
            return "Hello Heroku";
        });
        get("/intraday",(req,res) -> {
            res.type("application/json");
            return HttpConnectionExample.HttpApi();
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}
