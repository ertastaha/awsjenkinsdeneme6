package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.MyDriver;


public class AmazonPage {
    public AmazonPage() {

        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;
}

