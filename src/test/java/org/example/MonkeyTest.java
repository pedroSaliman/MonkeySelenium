package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class MonkeyTest
{


  static   WebDriver driver;
    @BeforeTest
    public void setup(){
    driver= WebDriverManager.chromiumdriver().create();
    driver = new ChromeDriver();

}
@Test
public void MonkeyTestAutomation(){
        driver.get("https://naveenautomationlabs.com/opencart/");
        driver.manage().window().maximize();
        act();
}

public static   void act(){

    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeAsyncScript("\n" +
            "    javascript: (function() {\n" +
            "    function callback() {\n" +
            "        gremlins.createHorde({\n" +
            "            species: [gremlins.species.clicker(),gremlins.species.toucher(),gremlins.species.formFiller(),gremlins.species.scroller(),gremlins.species.typer()],\n" +
            "            mogwais: [gremlins.mogwais.alert(),gremlins.mogwais.fps(),gremlins.mogwais.gizmo()],\n" +
            "            strategies: [gremlins.strategies.distribution(),gremlins.strategies.allTogether(),gremlins.strategies.bySpecies()]\n" +
            "        }).unleash();\n" +
            "    }\n" +
            "    var s = document.createElement(\"script\");\n" +
            "    s.src = \"https://unpkg.com/gremlins.js\";\n" +
            "    if (s.addEventListener) {\n" +
            "        s.addEventListener(\"load\", callback, false);\n" +
            "    } else if (s.readyState) {\n" +
            "        s.onreadystatechange = callback;\n" +
            "    }\n" +
            "    document.body.appendChild(s);\n" +
            "    })()");
}
}
