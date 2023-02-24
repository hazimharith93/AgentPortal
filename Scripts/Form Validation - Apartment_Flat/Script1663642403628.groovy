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

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Subsale'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Rent'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Commercial'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Apartment/Flat', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_Property TypeApartmentFlat'), 
    'Apartment', true)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_The Next Six Agent (SIT)/div_Build up are mandatory'), 'Build up are mandatory')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input__buildup'), '3000')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/font_Please select master property name'), 
    'Please select master property name')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/font_Type to search master property name'))

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_option Ausiaon Apartment, selected_re_b93e9c'), 
    'Apartment')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/font_Ausiaon Apartment'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.delay(4)

'Mandatory'
WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/div_Highlight is required'), 'Highlight is required')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/textarea_Highlight'), 'Highlight')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

'Mandatory'
WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/div_Monthly rent price is required'), 
    'Monthly rent price is required')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_RM_monthlyRental'), '2600')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_OccupancyOwner OccupiedTenantedUnkno_9c6ff9'), 
    'Unknown', true)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/font_Please select rent type'), 
    'Please select rent type')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/label_Entire Place'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/font_Please select bedrooms'), 'Please select bedrooms')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/select_BedroomsStudio1111222122331324414255_9bdc46'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/div_Please input number of bathroom'), 
    'Please input number of bathroom')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Studio_baths'), '2')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/div_Please input number of car park'), 
    'Please input number of car park')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Bathrooms_carParks'), '3')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/input_Land area(square feet)_landArea'), '3100')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

'Mandatory'
WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/div_Please upload images'), 'Please upload images')

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/p_Drag and drop some images here, or click _8f794f'), 
    'C:\\Users\\user\\Pictures\\Nextsix\\Propertyimage\\33.jpg')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/p_Are you sure you want to publish this property'), 
    'Are you sure you want to publish this property ?')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Okay'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Agent (SIT)/button_Not Now'))

