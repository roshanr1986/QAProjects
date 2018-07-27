package commonLibs.contracts;

import org.openqa.selenium.WebElement;

public interface Itextbox {

    public void setText(WebElement element, String text) throws Exception;

    public void clearText(WebElement element) throws Exception;
}
