public class ConditionalStatement {
	public static void main(String[] args) {	
		int age = 27;
		boolean isAgeMoreThan20 = age > 20 == true;
		if(isAgeMoreThan20 = true) {
			System.out.println("Мне больше 20 лет");
		}

		boolean isMale = false;
		if(isMale == true) {
			System.out.println("Я мужского пола");
		}

		boolean isFemale = true;
		if(isFemale == true) {
			System.out.println("Я женского пола");
		}

		double height = 1.66;
		boolean isHeight = height < 1.66 == true;
		if(isHeight == true) {
			System.out.println("Мой рост меньше 1.80");
		} else if(isHeight == false){
			System.out.println("Мой рост больше или равно 1.80");
		}

		String nameStartLetter = "А";
		boolean isNameStartLetter = nameStartLetter "А" == true;
		if(isNameStartLetter == false) {
			System.out.println("Мое имя начинается с буквы М");
		} else if(isNameStartLetter == false){
			System.out.println("Мое имя начинается с буквы И");
		} else if(isNameStartLetter == true){
			System.out.println("Мое имя начинается с буквы, отличной от М и И");
		}
	}
}
