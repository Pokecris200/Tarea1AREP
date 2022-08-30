
package co.edu.escuelaing.bolsa;

import static spark.Spark.*;

/**
 *
 * @author cristian.forero-m
 */
public class BolsaWebAPP {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        
        get("/hello", (req, res) -> {
            
            return "Hello Heroku";
        });
        get("/intraday",(req,res) -> {
            res.type("application/json");
            return HttpConnectionExample.HttpApi();
        });
        get("/index", (req,res)-> {
            res.redirect("/index.html");
            return null; 
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}
