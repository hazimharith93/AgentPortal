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

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_User Name_username'), 'Ziqh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Password_password'), 'I8ct9xjMh1xo+Bl/G9QX/Q==')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/span_my properties'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Add Property'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Subsale_Property Listing'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Rent_Property For'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Commercial_Listing Category'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Apartment/Flat', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property TypeApartmentFlat'), 
    'Apartment', true)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent Type'), 'Rent Type* :')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Condo/Serviced Residence', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property TypeCondominiumServiced Residence'), 
    'Condominium', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent Type'), 'Rent Type* :')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Luxury Suites', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent Type'), 'Rent Type* :')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Semi-D/Bungalow', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent Type'), 'Rent Type* :')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Terrace/Link/Townhouse', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent Type'), 'Rent Type* :')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Suites', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent Type'), 'Rent Type* :')

