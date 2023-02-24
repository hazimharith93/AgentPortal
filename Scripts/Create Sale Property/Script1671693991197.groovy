import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sit-agent.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'ecard2')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'I8ct9xjMh1xo+Bl/G9QX/Q==')

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/span_my properties'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/button_Add Property'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Co-Broke_coBroke'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_New(Developer Unit)_Property Listing'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Sale_Property For'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Commercial_Listing Category'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Residential Land', true)

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__name'), 'Test Residential Land')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/textarea_Test123'), 'Test123')

WebUI.scrollToElement(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/label_Memo'), 
    30)

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/textarea_Test Nemo'), 
    'Test Nemo')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__vendorPercentage'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__purchaserPercentage'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__coBrokeAddress'), 
    'Test Co Broke Address')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__line1'), 'Test address line 1')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__postcode'), '240110')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/select_StateJohorKedahKelantanMelakaNegeri _ee4b0a'), 
    'Wilayah Persekutuan Kuala Lumpur', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/select_AreaAmpangAmpang HilirBandar Damai P_1ed93d'), 
    'Batu Caves', true)

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_RM_price'), '12300000')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input__landArea'), '2800')

WebUI.scrollToElement(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/label_Description'), 
    30)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/select_TenureFreeholdLease TenancyLeasehold_6238e3'), 
    'Lease Tenancy', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/select_Land Title TypeAgriculturalCommercia_336098'), 
    'Agricultural', true)

WebUI.scrollToElement(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/h5_Facilities'), 
    30)

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_BBQ_BBQ'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Jacuzzi_Jacuzzi'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Wading Pool_Wading Pool'))

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Parking_Parking'))

WebUI.scrollToElement(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/button_Publish'), 
    30)

'Upload picture'
WebUI.verifyElementText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/div_Drag and drop some images here, or clic_f7aae8'), 
    'Drag and drop some images here, or click to select images')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Video Link_videoOriLink'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/input_Virtual Reality (VR)_vrLink'), 
    '123')

WebUI.click(findTestObject('Object Repository/Create Sale Property/Page_The Next Six Agent (SIT)/button_Publish'))

