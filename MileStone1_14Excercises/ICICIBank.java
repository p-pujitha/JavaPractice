/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
a) Create a class called GeneralBank which acts as base class for all banks. This class has functionality getSavingInterestRate and getFixedInterestRate methods,
which return the saving a/c rate of interest and fixed account rate of interest the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make it abstract.
b) Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the methods from base class. ICICI - Savings 4% Fixed 8.5% and KotMBank. - Savings 6% Fixed 9%
c) Create a main method to test the above classes. Try one by one and absorb your finding. a) ICICIBank object reference instantiated with ICICIBank class.
b) KotMBank object reference instantiated with KotMBank class.
c) GeneralBank object reference instantiated with KotMBank class.
d) GeneralBank object reference instantiated with ICICIBank class.

 */
public class ICICIBank  extends GeneralBank{
    double getSavingInterestRate(){
        return 4.0;
    }
    double getFixedInterestRate(){
        return 8.5;
    }
}
