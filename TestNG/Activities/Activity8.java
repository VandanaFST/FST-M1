<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="SeleniumTests" parallel="classes">
    <test name="SuiteTests">
        <parameter name="username" value="admin"></parameter>
        <parameter name="password" value="password"></parameter>
            <classes>
                <class name="activities.Activity1" />
                <class name="activities.Activity2" />
                <class name="activities.Activity3" />
                <class name="activities.Activity5" />
                <class name="activities.Activity6" />
                <class name="activities.Activity7" />
            </classes>
        </test>
    </suite>
