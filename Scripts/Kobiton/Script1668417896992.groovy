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

Mobile.startApplication('/Users/khang.dang/Desktop/New Folder With Items/APK/ExpenseAppVer1.0.apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email'), 'test@perfecto.com', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 'test123', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - About'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No expenses found.Click  to create'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.scrollToText('Version 1.4 - beta')

Mobile.closeApplication()

