package grades;


	import java.util.ArrayList;

	public class GradeManager {
	    
	    // Variable para almacenar las notas utilizando ArrayList
	    private ArrayList<Double> grades;

	    // Constructor que inicializa el ArrayList
	    public GradeManager() {
	        grades = new ArrayList<>();
	    }

	    // Método para agregar una nueva nota
	    public void addGrade(Double grade) {
	        grades.add(grade);
	    }

	    // Método para calcular el promedio de las notas
	    public Double calculateAverage() {
	        Double sum = 0.0;
	        for (Double grade : grades) {
	            sum += grade;
	        }
	        
	        return grades.isEmpty() ? 0.0 : sum / grades.size();
	    }

	    // Método para contar el número de aprobados (notas >= 50)
	    public Integer countPassingGrades() {
	        Integer count = 0;
	        for (Double grade : grades) {
	            if (grade >= 50.0) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Método para eliminar una nota por su valor
	    public boolean removeGradeByValue(Double grade) {
	        return grades.remove(grade);
	    }

	    // Método para eliminar una nota por su posición
	    public boolean removeGradeByIndex(int index) {
	        if (index >= 0 && index < grades.size()) {
	            grades.remove(index);
	            return true;
	        }
	        return false;
	    }
	}


