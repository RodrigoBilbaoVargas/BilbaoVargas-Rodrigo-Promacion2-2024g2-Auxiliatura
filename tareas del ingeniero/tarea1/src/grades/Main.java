package grades;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de GradeManager
        GradeManager gradeManager = new GradeManager();
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    // Mostrar el menú al usuario
			    System.out.println("\nMenu:");
			    System.out.println("1. Add grade");
			    System.out.println("2. View average grade");
			    System.out.println("3. View number of passing grades");
			    System.out.println("4. Exit");
			    System.out.println("5. Remove grade");
			    System.out.print("Choose an option: ");
			    // Leer la opción elegida por el usuario
			    Integer choice = scanner.nextInt();

			    switch (choice) {
			        case 1:
			            // Agregar una nueva nota
			            System.out.print("Enter a grade: ");
			            Double grade = scanner.nextDouble();
			            gradeManager.addGrade(grade);
			            break;
			        case 2:
			            System.out.println("Average grade: " + gradeManager.calculateAverage());
			            break;
			        case 3:
			            System.out.println("Number of passing grades: " + gradeManager.countPassingGrades());
			            break;
			        case 4:
			            System.out.println("Exiting the program.");
			            System.exit(0);
			        case 5:
			            System.out.println("Remove grade by:");
			            System.out.println("1. Value");
			            System.out.println("2. Position");
			            System.out.print("Choose an option: ");
			            Integer removeChoice = scanner.nextInt();
			            switch (removeChoice) {
			                case 1:
			                    System.out.print("Enter the grade value to remove: ");
			                    Double gradeToRemove = scanner.nextDouble();
			                    if (gradeManager.removeGradeByValue(gradeToRemove)) {
			                        System.out.println("Grade removed successfully.");
			                    } else {
			                        System.out.println("Grade not found.");
			                    }
			                    break;
			                case 2:
			                    System.out.print("Enter the position of the grade to remove (0-based): ");
			                    int indexToRemove = scanner.nextInt();
			                    if (gradeManager.removeGradeByIndex(indexToRemove)) {
			                        System.out.println("Grade removed successfully.");
			                    } else {
			                        System.out.println("Invalid position.");
			                    }
			                    break;
			                default:
			                    System.out.println("Invalid option.");
			            }
			            break;
			        default:
			            System.out.println("Invalid option. Please try again.");
			    }
			}
		}
    }
}