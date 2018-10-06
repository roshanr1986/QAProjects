package commonLibs.implementation;

import commonLibs.contracts.IjavaScript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptExecutor implements IjavaScript {

    private WebDriver driver;

    public javaScriptExecutor(WebDriver driver) {
        this.driver=driver;
    }

    private JavascriptExecutor getJSEngine(){

        javaScriptExecutor jsEngine = (javaScriptExecutor)driver;
        return (JavascriptExecutor) jsEngine;
    }

    @Override
    public void executeJavaScript(String scriptToExecute, WebElement element) throws Exception {
        getJSEngine().executeScript(scriptToExecute , element);
    }

    @Override
    public void scrollDown(int x, int y) throws Exception {
        String scriptToExecute=String.format("window.scrollBy(%d,%d)",x,y);
        getJSEngine().executeScript(scriptToExecute);
    }

    @Override
    public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception {
        return getJSEngine().executeScript(scriptToExecute).toString();
    }
}
