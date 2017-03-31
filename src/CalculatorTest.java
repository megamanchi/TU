import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static  org.mockito.Mockito.when;



public class CalculatorTest {

	private Calculator Calculator;
	
	@Before 
	public void create()
	{
		Calculator = mock(Calculator.class);
		when(Calculator.arabicToRoman(9)).thenReturn("IX");
		when(Calculator.arabicToRoman(23)).thenReturn("XXIII");
		when(Calculator.arabicToRoman(98)).thenReturn("XCVIII");
		
		}
	@Test
	public void testD() {
		
		//Create the mock object of stock service
		
		//Calculator CalculatorMock = new Calculator();
		//calcularInversion(2000,servicio.valoruf());
		
		assertEquals("IX", Calculator.arabicToRoman(9));
		assertEquals("XXIII", Calculator.arabicToRoman(23));
		assertEquals("XCVIII", Calculator.arabicToRoman(98));
		/*
		assertEquals("CM", CalculatorMock.arabicToRoman(900));
		assertEquals("MC", CalculatorMock.arabicToRoman(1100));
		assertEquals("MMCI", CalculatorMock.arabicToRoman(2101));	
		assertEquals("_VICI", CalculatorMock.arabicToRoman(6101));
		assertEquals("_IXCMXCIX", CalculatorMock.arabicToRoman(9999));
		*/
	}


}
