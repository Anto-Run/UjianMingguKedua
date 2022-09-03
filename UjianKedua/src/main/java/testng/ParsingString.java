package testng;

public class ParsingString {

	public boolean parseStringToIntActual(String strX) {
		boolean isActual = true;
		try {
			int intY = Integer.parseInt(strX);
		}
		catch (Exception e){
			isActual = false;
		}
		System.out.println(isActual+"-->Hasil Actual");
		return isActual;
		
	}
	public boolean parseStringToIntExcept(String strX) {
		boolean isExcept = true;
		try {
			int intY = Integer.parseInt(strX);
		}
		catch (Exception e){
			isExcept = false;
		}
		
		System.out.println(isExcept+"-->Hasil Except");
		return isExcept;
	}
	
	public boolean parseStringToDoubleActual(String strX) {
		boolean isActual = true;
		try {
			double intY = Double.parseDouble(strX);
		}
		catch (Exception e){
			isActual = false;
		}
		System.out.println(isActual+"-->Hasil Actual");
		return isActual;
		
	}
	public boolean parseStringToDoubleExcept(String strX) {
		boolean isExcept = true;
		try {
			double intY = Double.parseDouble(strX);
		}
		catch (Exception e){
			isExcept = false;
		}
		System.out.println(isExcept+"-->Hasil Except");
		return isExcept;
	}
	public boolean parseStringToFloatActual(String strX) {
		boolean isActual = true;
		try {
			float intY = Float.parseFloat(strX);
		}
		catch (Exception e){
			isActual = false;
		}
		System.out.println(isActual+"-->Hasil Actual");
		return isActual;
		
	}
	public boolean parseStringToFloatExcept(String strX) {
		boolean isExcept = true;
		try {
			float intY = Float.parseFloat(strX);
		}
		catch (Exception e){
			isExcept = false;
		}
		System.out.println(isExcept+"-->Hasil Except");
		return isExcept;
	}
}
