import JunitWithRegex.ValidRegex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class empTest
{
    @Test
    public void testFname()
    {
        ValidRegex obF=new ValidRegex();
        assertTrue(obF.validMethodF("Alok"));
    }

    @Test
    public void testLname()
    {
        ValidRegex obL=new ValidRegex();
        assertTrue(obL.validMethodL("Barnwal"));
    }

    @Test
    public void testPhno()
    {
        ValidRegex obP=new ValidRegex();
        assertTrue(obP.validMethodPhno("+917412589630"));
    }
    @Test
    public void testMail()
    {
        ValidRegex obM=new ValidRegex();
        assertTrue(obM.validMethodMail("a@gmail.co.in"));
    }
    @Test
    public void testPWD()
    {
        ValidRegex obPWD=new ValidRegex();
        assertTrue(obPWD.validMethodPassword("aa@A1we25a"));
    }
    //with parameters
    @ParameterizedTest
    @ValueSource(strings = { "Alok" , "Gautam" , "sahil" , "sajan"})
    public void testFnameParameters(String fName)
    {
        ValidRegex obFp=new ValidRegex();
        assertTrue(obFp.validMethodF(fName));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Barnwal" , "Choski" , "kumar" , "Reddy"})
    public void testLnameParameters(String LName)
    {
        ValidRegex obFp=new ValidRegex();
        assertTrue(obFp.validMethodF(LName));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Barn@fmail.com","Kumar@yahoo.co.in"})
    public void testMailParameters(String mail)
    {
        ValidRegex obMp=new ValidRegex();
        assertTrue(obMp.validMethodMail(mail));
    }
    @ParameterizedTest
    @ValueSource(strings = {"+919876543210","+911234567890"})
    public void testPhnoParameters(String phno)
    {
        ValidRegex obMp=new ValidRegex();
        assertTrue(obMp.validMethodMail(phno));
    }
    @ParameterizedTest
    @ValueSource(strings = {"A9@wfbnf","ssfghyt543wsdvnj"})
    public void testPWDParameters(String pwd)
    {
        ValidRegex obMp=new ValidRegex();
        assertTrue(obMp.validMethodMail(pwd));
    }
    //using assertfalse
    @ParameterizedTest
    @ValueSource(strings = { "Alok" , "Gautam" , "sahil" , "sajan"})
    public void testFnameParametersAssertfalse(String fName)
    {
        ValidRegex obFp=new ValidRegex();
        assertFalse(obFp.validMethodF(fName));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Barnwal" , "Choski" , "kumar" , "Reddy"})
    public void testLnameParametersAssertfalse(String LName)
    {
        ValidRegex obFp=new ValidRegex();
        assertFalse(obFp.validMethodF(LName));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Barn@fmail.com","Kumar@yahoo.co.in"})
    public void testMailParametersAssertfalse(String mail)
    {
        ValidRegex obMp=new ValidRegex();
        assertFalse(obMp.validMethodMail(mail));
    }
    @ParameterizedTest
    @ValueSource(strings = {"+919876543210","+911234567890"})
    public void testPhnoParametersAssertfalse(String phno)
    {
        ValidRegex obMp=new ValidRegex();
        assertFalse(obMp.validMethodMail(phno));
    }
    @ParameterizedTest
    @ValueSource(strings = {"A9@wfbnf","ssfghyt543wsdvnj"})
    public void testPWDParametersAssertfalse(String pwd)
    {
        ValidRegex obMp=new ValidRegex();
        assertFalse(obMp.validMethodMail(pwd));
    }

}
