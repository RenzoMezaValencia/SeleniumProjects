package pages;

public class GooglePage extends BasePage {

    private String searchButton = "(//input[@name='btnK'])[2]";
    private String serachTextField = "//input[@title='Buscar']";

    public GooglePage(){
        super(driver);
    }        
    
    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void sendTextGoogleSearch(String SearchText){
        sendKeysToGoogleSearch(serachTextField, SearchText);
    }
}
