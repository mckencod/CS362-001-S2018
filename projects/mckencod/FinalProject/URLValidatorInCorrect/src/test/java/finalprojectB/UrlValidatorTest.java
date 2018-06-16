
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }



   public void testManualTest()
   {
     String val1 = null;
     String val2 = "ftp://foo.bar.com/";
     String val3 = "foo.bar.com";

     UrlValidator urltest = new UrlValidator();

     assertTrue(urltest.isValid(val2));
     assertFalse(urltest.isValid(val1));
     assertFalse(urltest.isValid(val3));
   }


   public void testYourFirstPartition()
   {
     String val1 = null;
     String val2 = "www.google.com";
     String val3 = "google.com";

    UrlValidator urltest = new UrlValidator();

     assertTrue(urltest.isValid(val2));
     assertFalse(urltest.isValid(val1));
     assertFalse(urltest.isValid(val3));
   }

   public void testYourSecondPartition(){
     String val1 = null;
     String val2 = "www.yahoo.com";
     String val3 = "yahoo.com";

    UrlValidator urltest = new UrlValidator();

     assertTrue(urltest.isValid(val2));
     assertFalse(urltest.isValid(val1));
     assertFalse(urltest.isValid(val3));

   }

   public void testIsValid()
   {
     String val1 = null;
     String val2 = "ftp://foo.bar.com/";
     String val3 = "foo.bar.com";
     String[] schemes = {"http", "https"};

     UrlValidator urltest = new UrlValidator();
     UrlValidator urltest2 = new UrlValidator(schemes);
     UrlValidator urltest3 = new UrlValidator(1);

     assertTrue(urltest.isValid(val2));
     assertFalse(urltest.isValid(val1));
     assertFalse(urltest.isValid(val3));

     assertTrue(urltest2.isValid(val2));
     assertFalse(urltest2.isValid(val1));
     assertFalse(urltest2.isValid(val3));

     assertTrue(urltest3.isValid(val2));
     assertFalse(urltest3.isValid(val1));
     assertFalse(urltest3.isValid(val3));

   }



}
