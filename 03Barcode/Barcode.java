public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//or zip contains a non digit
//_zip and _checkDigit are initialized.
  public Barcode(String zip) {
  if(zip.length() > 4) {
	    _zip = zip;
	}
	else {
	    throw new IllegalArgumentException("Wrong length");
	}
    try {
	    _checkDigit = checkSum();
	} 
	catch(NumberFormatException e) {
	    throw new IllegalArgumentException("contains a non digit");
	}
    }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
  Barcode twin = new Barcode(_zip);
  twin._checkDigit = _checkDigit;
  return twin;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
  	int result = 0;
  	for (int i = 0; i < _zip.length(); i++){
  		result += Integer.valueOf(String.valueOf(_zip.charAt(i)));
  	}
	return result;
  }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
  	String result = _zip + _checkDigit + "   " + pbc(_zip + _checkDigit);
  	return result;
  }


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
  	String a = _zip + _checkDigit;
  	String b = other._zip + other._checkDigit;
	return a.compareTo(b);
	}

    public static String pbc(String zip) {
	String result = "";
	String code = zip;
	for(int i = 0; i < 6; i++){
	    switch(code.charAt(i)){
	    case '1': result += ":::||";
			break;
	    case '2': result += "::|:|";
			break;
	    case '3': result += "::||:";
			break;
	    case '4': result += ":|::|";
			break;
	    case '5': result += ":|:|:";
			break;
	    case '6': result += ":||::";
			break;
	    case '7': result += "|:::|";
			break;
	    case '8': result += "|::|:";
			break;
	    case '9': result += "|:|::";
			break;
		case '0': result += "||:::";
			break;
	    }
	}
	return "|" + result + "|";
    }

    public static String toZip(String code){
    	String result = "";
    	if((code.length() != 32) || (code.charAt(0) != '|') || (code.charAt(31) != '|')){
    		throw new IllegalArgumentException("problem with the string of code being inputted");
    	}
    	else{
    		try{
    	for(int i = 1; i < code.length() - 1; i++){
			switch(code.substring(i,i+5)){
		case ":::||": result += "1";
		    break;
		case "::|:|": result += "2";
		    break;
		case "::||:": result += "3";
		    break;
		case ":|::|": result += "4";
		    break;
		case ":|:|:": result += "5";
		    break;
		case ":||::": result += "6";
		    break;
		case "|:::|": result += "7";
		    break;
		case "|::|:": result += "8";
		    break;
		case "|:|::": result += "9";
		    break;
		case "||:::": result += "0";
		    break;
		}
    	}
    		}
    	catch(NumberFormatException e){
    		throw new IllegalArgumentException("non-barcode characters are used or encoded integers are invalid");
    	}
    	if(!(result.substring(0,6).equals(result.charAt(6)))){
    		throw new IllegalArgumentException();
    	}
    	return result;
    }
}
}
