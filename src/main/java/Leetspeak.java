import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Leetspeak {
  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String text = request.queryParams();

      model.put("text", text);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

    public static String isLeetspeak(String word) {
    word = word.toLowerCase();
    for (Integer i=0; i <= word.length(); i++){
      word = word.replaceAll("o", "0");
      word = word.replaceAll("e", "3");
      word = word.replaceAll("i", "1");
      if (word.startsWith("s")){
        word = word.replaceAll("s", "z");
        word = word.replaceFirst("z", "s");
      } else {
        word = word.replaceAll("s", "z");
      }
      word = word.replaceAll(" z", " s");
    }
    return word;
  }
}
