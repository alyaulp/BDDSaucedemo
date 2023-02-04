package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    public static WebDriver driver;

    public OverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = (driver);
    }

    //Deklarasi element
    @FindBy(xpath = "//span[@class='title']")
    private WebElement title;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement item_total;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;


    public boolean verifyOverviewPage() {
        title.isDisplayed();
        return true;
    }

    public Float Tax() {
        // Karena tipe data tax di web adalah string kita buat variable dengan tipe string
        String strTax = tax.getText();
        // potong kalimat depan berdasarkan index, contoh:
        // T a x : <spasi> $ 3.20
        // 0 1 2 3    4    5 6
        String potongString = strTax.substring(6);
        // membuat variable Float -> ParseFloat = untuk konversi string menjadi float
        // karna tipe data string tidak bisa dibuat perhitungan
        Float floatTax = Float.parseFloat(potongString);

        // kembalikan konversi float ke func
        return floatTax;
    }


    public Float itemTotal() { // Membuat Func ItemTotal dengan return Float
        String strItemTotal = item_total.getText();
        String potongString = strItemTotal.substring(13);
        Float floatItemTotal = Float.parseFloat(potongString);

        return floatItemTotal;
    }


    // Membuat Func Penjumlahan itemTotal + Tax
    public Float Jumlah() {
        return itemTotal() + Tax();
    }

    public Float Total() {
        String strTotal = total.getText();
        String potongString = strTotal.substring(8);
        Float floatTotal = Float.parseFloat(potongString);
        return floatTotal;
    }
}
