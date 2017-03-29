package doxygendemo;

/**
 * \class TestClass
 * \author Grant
 * \version 1.0
 * \brief A simple class with 3 attributes, 1 constructor, 1 method, and 3 gets/sets
 */
public class TestClass {

    private int testInt;
    private String testStr;
    private char testChr;

    /**
     * \fn TestClass
     * \brief Constructor for the TestClass Class
     * \param testInteger an integer fill the testInt attribute
     * \param testString a string to fill the testStr attribute
     * \param testChar a character to fill the testChr attribute 
     */
    public TestClass(int testInteger, String testString, char testChar)
    {
        testInt = testInteger;
        testStr = testString;
        testChr = testChar;
    }
    
    /**
    * \fn testMethod
    * \brief Compares two integers
    * \param arg1 An integer to be compared
    * \param arg2 The second integer to be compared
    * \returns A yes or no depending on the result of the compare
    */
    public String testMethod(int arg1, int arg2)
    {
        String ret /** return value */;
        if(arg1 == arg2)
        {
            ret = "Yes";
        }
        else
        {
            ret = "No";
        }
        
        return ret;
    }
    
    /**
     * \fn getInt
     * \returns the integer attribute from the class
     */
    public int getInt()
    {
        return testInt;
    }
    
    /**
     * \fn getString
     * \returns the string attribute from the class
     */
    public String getString()
    {
        return testStr;
    }
    
    /**
     * \fn getChar
     * \returns the character attribute from the class 
     */
    public char getChar()
    {
        return testChr;
    }
    
    /**
     * \fn setInt
     * \param yourInteger integer to replace the integer attribute with
     */
    public void setInt(int yourInteger)
    {
        testInt = yourInteger;
    }
    
    /**
     * \fn setString
     * \param yourString string to replace the string attribute with
     */
    public void setString(String yourString)
    {
        testStr = yourString;
    }
    
    /**
     * \fn setChar
     * \param yourChar character to replace the character attribute with
     */
    public void setChar(char yourChar)
    {
        testChr = yourChar;
    }
}
