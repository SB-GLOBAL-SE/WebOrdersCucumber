package WebOrders;

import com.smartbear.testleft.HttpException;
import com.smartbear.testleft.InvocationException;
import com.smartbear.testleft.ObjectTreeNodeNotFoundException;
import com.smartbear.testleft.testobjects.*;
import com.smartbear.testleft.testobjects.web.*;

/**
 * The page 'Web Orders Login' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
 */
class LoginPageModel {
    private WebPage page;

    public LoginPageModel(WebPage page) {
        this.page = page;
    }

    /**
     * A text box with the label 'Username:'.
     */
    public TextEdit getUserNameEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectIdentifier = "username";
        }}, 3);
    }

    /**
     * A password box with the label 'Password:'.
     */
    public TextEdit getPasswordEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectIdentifier = "password";
        }}, 3);
    }

    /**
     * The 'Login' button.
     */
    public Button getLoginButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(Button.class, new WebElementPattern(){{
            ObjectIdentifier = "button";
        }}, 3);
    }

    /**
     * Pauses the test execution until the web page is downloaded. The page loading timeout is specified by the TestLeft.Options.WebTesting.PageLoadTimeout value (the default value is 1 minute).
     *
     * @return The URL of the page or resource that was loaded last on the page. If the web page does not contain frames and the page was loaded successfully, the wait method returns the page's URL. If the page contains frames, the method returns the URL of the page that was last loaded in a frame. If the loading was not successful or the page had not finished loading before the timeout elapsed, the method returns an empty String.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    String waitForLoadComplete() throws InvocationException, HttpException
    {
        return page.waitForLoadComplete();
    }
}

/**
 * The page 'Web Orders' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx
 */
class NewOrderPageModel {
    private WebPage page;

    public NewOrderPageModel(WebPage page) {
        this.page = page;
    }

    /**
     * A combo box with the following items: 'MyMoney', 'FamilyAlbum', 'ScreenSaver'.
     */
    public ComboBox getProductCombo() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(ComboBox.class, new WebElementPattern(){{
            ObjectType = "Select";
            ObjectIdentifier = "ddlProduct";
        }}, 7);
    }

    /**
     * A text box with the label 'Quantity:*'.
     */
    public TextEdit getQuantityEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtQuantity";
        }}, 7);
    }

    /**
     * A text box with the label 'Customer name:*'.
     */
    public TextEdit getCustomerNameEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtName";
        }}, 7);
    }

    /**
     * A text box with the label 'Street:*'.
     */
    public TextEdit getAddressEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Street:*";
        }}, 7);
    }

    /**
     * A text box with the label 'City:*'.
     */
    public TextEdit getCityEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "City:*";
        }}, 7);
    }

    /**
     * A text box with the label 'State:'.
     */
    public TextEdit getCountryEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "State:";
        }}, 7);
    }

    /**
     * A text box with the label 'Zip:*'.
     */
    public TextEdit getZipEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Zip:*";
        }}, 7);
    }

    /**
     * The 'Visa' radio button.
     */
    public RadioButton getVisaCardButton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectLabel = "Visa";
        }}, 9);
    }

    /**
     * The 'MasterCard' radio button.
     */
    public RadioButton getMasterCardRadio() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectLabel = "MasterCard";
        }}, 9);
    }

    /**
     * The 'American Express' radio button.
     */
    public RadioButton getAmericanExpressCardRadio() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectLabel = "American Express";
        }}, 9);
    }

    /**
     * A text box with the label 'Card Nr:*'.
     */
    public TextEdit getCardNumber() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Card Nr:*";
        }}, 7);
    }

    /**
     * A text box with the label 'Expire date (mm/yy):*'.
     */
    public TextEdit getDateEdit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectLabel = "Expire date (mm/yy):*";
        }}, 7);
    }

    /**
     * The link 'Process'.
     */
    public WebElement getInsertLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "InsertButton";
        }}, 8);
    }

    /**
     * The 'Reset' button.
     */
    public Button getResetbuttonReset() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(Button.class, new WebElementPattern(){{
            ObjectType = "ResetButton";
        }}, 8);
    }

    /**
     * Pauses the test execution until the web page is downloaded. The page loading timeout is specified by the TestLeft.Options.WebTesting.PageLoadTimeout value (the default value is 1 minute).
     *
     * @return The URL of the page or resource that was loaded last on the page. If the web page does not contain frames and the page was loaded successfully, the wait method returns the page's URL. If the page contains frames, the method returns the URL of the page that was last loaded in a frame. If the loading was not successful or the page had not finished loading before the timeout elapsed, the method returns an empty String.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    String waitForLoadComplete() throws InvocationException, HttpException
    {
        return page.waitForLoadComplete();
    }
}

/**
 * The page 'List of All Orders' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
 */
class OrdersPageModel {
	private WebPage page;
	
	public OrdersPageModel(WebPage page) {
		this.page = page;
	}

	/**
	 * List of All Orders grid
	 */
	public WebTable getOrdersTable() throws ObjectTreeNodeNotFoundException, HttpException {
            return page.find(WebTable.class, new WebElementPattern(){{
	        ObjectType = "Table"; 
	        ObjectIdentifier = "orderGrid"; 
            }}, 7);
	}

    /**
     * Pauses the test execution until the web page is downloaded. The page loading timeout is specified by the TestLeft.Options.WebTesting.PageLoadTimeout value (the default value is 1 minute).
     *
     * @return The URL of the page or resource that was loaded last on the page. If the web page does not contain frames and the page was loaded successfully, the wait method returns the page's URL. If the page contains frames, the method returns the URL of the page that was last loaded in a frame. If the loading was not successful or the page had not finished loading before the timeout elapsed, the method returns an empty String.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    String waitForLoadComplete() throws InvocationException, HttpException
    {
        return page.waitForLoadComplete();
    }
}

/**
 * Application 'Web Orders'.
 */
class WebOrdersAppModel {
    private WebBrowser browser;

    public WebOrdersAppModel(WebBrowser browser) {
        this.browser = browser;
    }

	/**
	 * The page 'Web Orders Login' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
	 */
	public LoginPageModel getLoginPage() throws ObjectTreeNodeNotFoundException, HttpException {
		return new LoginPageModel(browser.find(WebPage.class, new WebPagePattern(){{
			URL = "*/WebOrders/login.aspx";
		}}));
	}

    /**
     * The page 'New Order' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx
     */
    public NewOrderPageModel getNewOrderPage() throws ObjectTreeNodeNotFoundException, HttpException {
        return new NewOrderPageModel(browser.find(WebPage.class, new WebPagePattern() {{
            URL = "*/WebOrders/Process.aspx";
            Visible = true;
        }}));
    }

    /**
     * The page 'List of All Orders' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
     */
    public OrdersPageModel getOrdersPage() throws ObjectTreeNodeNotFoundException, HttpException {
        return new OrdersPageModel(browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/Default.aspx";
            Visible = true;
        }}));
    }

    /**
     * The link 'View all orders' refers to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx
     */
    public WebElement getViewAllOrdersLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            contentText = "View all orders";
        }}, 4);
    }

    /**
     * The link 'View all products' refers to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx
     */
    public WebElement getViewAllProductsLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            contentText = "View all products";
        }}, 4);
    }

    /**
     * The link 'Order' refers to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx
     */
    public WebElement getAddNewOrderLink() throws ObjectTreeNodeNotFoundException, HttpException {
        return browser.find(WebPage.class, new WebPagePattern(){{
            URL = "*/WebOrders/*.aspx";
            Visible = true;
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            contentText = "Order";
        }}, 4);
    }

    /**
     * Closes the process by sending the WM_CLOSE message to its main window and waits until the process is closed or the specified time limit is reached.
     *
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close() throws InvocationException, HttpException
    {
        browser.close();
    }
}


/**
 * A web browser.
 */
class Browser {
    private WebBrowser browser;

    public Browser(WebBrowser browser) {
        this.browser = browser;
    }

    /**
     * The page 'Web Orders' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Process.aspx
     */
    public PageWebOrders getPageWebOrders1() throws ObjectTreeNodeNotFoundException, HttpException {
        return new PageWebOrders((WebPage) browser.find(WebPage.class, new WebPagePattern(){{
            URL = "http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Process.aspx" +
                    "";
        }}));
    }

    /**
     * The page 'Web Orders Login' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete11%2fweborders%2fDefault.aspx
     */
    public PageWebOrdersLogin getPageWebOrdersLogin() throws ObjectTreeNodeNotFoundException, HttpException {
        return new PageWebOrdersLogin((WebPage) browser.find(WebPage.class, new WebPagePattern(){{
            URL = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx*";
        }}));
    }

    /**
     * The page 'Web Orders' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/
     */
    public PageWebOrders2 getPageWebOrders2() throws ObjectTreeNodeNotFoundException, HttpException {
        return new PageWebOrders2((WebPage) browser.find(WebPage.class, new WebPagePattern(){{
            URL = "http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/";
        }}));
    }

    /**
     * Closes the process by sending the WM_CLOSE message to its main window and waits until the process is closed or the specified time limit is reached.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close() throws InvocationException, HttpException {
        browser.close();
    }

    /**
     * Closes the process by sending the WM_CLOSE message to its main window and waits until the process is closed or the specified time limit is reached.
     * @param waitTimeout A time limit to wait until the process is closed.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close(int waitTimeout) throws InvocationException, HttpException {
        browser.close(waitTimeout);
    }
}


/**
 * The page 'Web Orders' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Process.aspx
 */
class PageWebOrders {
    private WebPage page;

    public PageWebOrders(WebPage page) {
        this.page = page;
    }

    /**
     * The link 'Logout'.
     */
    public WebElement getLinkLogout() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "logout";
        }}, 5);
    }

    /**
     * The link 'View all orders' refers to http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Default.aspx
     */
    public WebElement getLinkViewAllOrders() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            href = "http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Default.aspx" +
                    "";
        }}, 3);
    }

    /**
     * The link 'View all products' refers to http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Products.aspx
     */
    public WebElement getLinkViewAllProducts() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            href = "http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Products.asp" +
                    "x";
        }}, 3);
    }

    /**
     * The link 'Order' refers to http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Process.aspx
     */
    public WebElement getLinkOrder() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            href = "http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/Process.aspx" +
                    "";
        }}, 3);
    }

    /**
     * A combo box with the following items: 'MyMoney', 'FamilyAlbum', 'ScreenSaver'.
     */
    public ComboBox getSelectProduct() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(ComboBox.class, new WebElementPattern(){{
            ObjectType = "Select";
        }}, 6);
    }

    /**
     * A text box with the label 'Quantity:*'.
     */
    public TextEdit getTextboxQuantity() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtQuantity";
        }}, 6);
    }

    /**
     * A text box with the label 'Price per unit:'.
     */
    public TextEdit getTextboxPricePerUnit() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtUnitPrice";
        }}, 6);
    }

    /**
     * A text box with the label 'Discount:'.
     */
    public TextEdit getTextboxDiscount() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtDiscount";
        }}, 6);
    }

    /**
     * A text box with the label 'Total:'.
     */
    public TextEdit getTextboxTotal() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtTotal";
        }}, 6);
    }

    /**
     * The 'Calculate' button.
     */
    public Button getSubmitbuttonCalculate() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(Button.class, new WebElementPattern(){{
            ObjectType = "SubmitButton";
        }}, 6);
    }

    /**
     * A text box with the label 'Customer name:*'.
     */
    public TextEdit getTextboxCustomerName() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "txtName";
        }}, 6);
    }

    /**
     * A text box with the label 'Street:*'.
     */
    public TextEdit getTextboxStreet() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "TextBox2";
        }}, 6);
    }

    /**
     * A text box with the label 'City:*'.
     */
    public TextEdit getTextboxCity() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "TextBox3";
        }}, 6);
    }

    /**
     * A text box with the label 'State:'.
     */
    public TextEdit getTextboxState() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "TextBox4";
        }}, 6);
    }

    /**
     * A text box with the label 'Zip:*'.
     */
    public TextEdit getTextboxZip() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "TextBox5";
        }}, 6);
    }

    /**
     * The 'Visa' radio button.
     */
    public RadioButton getRadiobuttonVisa() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectIdentifier = "cardList_0";
        }}, 8);
    }

    /**
     * The 'MasterCard' radio button.
     */
    public RadioButton getRadiobuttonMastercard() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectIdentifier = "cardList_1";
        }}, 8);
    }

    /**
     * The 'American Express' radio button.
     */
    public RadioButton getRadiobuttonAmericanExpress() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(RadioButton.class, new WebElementPattern(){{
            ObjectType = "RadioButton";
            ObjectIdentifier = "cardList_2";
        }}, 8);
    }

    /**
     * A text box with the label 'Card Nr:*'.
     */
    public TextEdit getTextboxCardNr() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "TextBox6";
        }}, 6);
    }

    /**
     * A text box with the label 'Expire date (mm/yy):*'.
     */
    public TextEdit getTextboxExpireDateMmYy() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
            ObjectIdentifier = "TextBox1";
        }}, 6);
    }

    /**
     * The link 'Process'.
     */
    public WebElement getLinkInsertbutton() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "InsertButton";
        }}, 7);
    }

    /**
     * The 'Reset' button.
     */
    public Button getResetbuttonReset() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(Button.class, new WebElementPattern(){{
            ObjectType = "ResetButton";
        }}, 7);
    }

    /**
     * Closes the page's tab in the browser.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close() throws InvocationException, HttpException {
        page.close();
    }
}


/**
 * The page 'Web Orders Login' with the address http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete11%2fweborders%2fDefault.aspx
 */
class PageWebOrdersLogin {
    private WebPage page;

    public PageWebOrdersLogin(WebPage page) {
        this.page = page;
    }

    /**
     * A text box with the label 'Username:'.
     */
    public TextEdit getTextboxUsername() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "Textbox";
        }}, 2);
    }

    /**
     * A password box with the label 'Password:'.
     */
    public TextEdit getPasswordboxPassword() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(TextEdit.class, new WebElementPattern(){{
            ObjectType = "PasswordBox";
        }}, 2);
    }

    /**
     * The 'Login' button.
     */
    public Button getSubmitbuttonLogin() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(Button.class, new WebElementPattern(){{
            ObjectType = "SubmitButton";
        }}, 2);
    }

    /**
     * Closes the page's tab in the browser.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close() throws InvocationException, HttpException {
        page.close();
    }
}


/**
 * The page 'Web Orders' with the address http://secure.smartbearsoftware.com/samples/testcomplete11/weborders/
 */
class PageWebOrders2 {
    private WebPage page;

    public PageWebOrders2(WebPage page) {
        this.page = page;
    }

    /**
     * The link 'Check All'.
     */
    public WebElement getLinkBtncheckall() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "btnCheckAll";
        }}, 4);
    }

    /**
     * The link 'Uncheck All'.
     */
    public WebElement getLinkBtnuncheckall() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Link";
            ObjectIdentifier = "btnUncheckAll";
        }}, 4);
    }

    /**
     * A table with 9 rows and the following columns: ' ', 'Name', 'Product', ....
     */
    public WebTable getTableOrdergrid() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(WebTable.class, new WebElementPattern(){{
            ObjectType = "Table";
            ObjectIdentifier = "orderGrid";
        }}, 5);
    }

    /**
     * The 'Delete Selected' button.
     */
    public Button getSubmitbuttonDeleteSelected() throws ObjectTreeNodeNotFoundException, HttpException {
        return page.find(WebElement.class, new WebElementPattern(){{
            ObjectType = "Form";
            idStr = "aspnetForm";
        }}).find(Button.class, new WebElementPattern(){{
            ObjectType = "SubmitButton";
        }}, 4);
    }

    /**
     * Closes the page's tab in the browser.
     * @throws InvocationException Will be thrown if invocation fails.
     * @throws HttpException       Will be thrown if there are network problems.
     */
    public void close() throws InvocationException, HttpException {
        page.close();
    }
}