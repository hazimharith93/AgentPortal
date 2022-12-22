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

WebUI.setText(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/input_User Name  Email Address_username'), 
    'cayden')

WebUI.setEncryptedText(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/input_Password_password'), 
    'H0pLMoc45+4=')

WebUI.click(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/span_my properties'))

WebUI.click(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/div_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/label_Highlight'), 30)

WebUI.setText(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/textarea_vhvhvh'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scramble')

WebUI.scrollToElement(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/button_Publish'), 30)

WebUI.click(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/button_Publish'))

WebUI.verifyElementText(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/div_Memo cannot exceed 200 word'), 
    'Memo cannot exceed 200 word')

WebUI.scrollToElement(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/label_Highlight'), 30)

WebUI.setText(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/textarea_Lorem Ipsum is simply dummy text o_514ca1'), 
    'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type a')

WebUI.scrollToElement(findTestObject('Object Repository/Agent Memo/Page_The Next Six Agent (SIT)/button_Publish'), 30)

