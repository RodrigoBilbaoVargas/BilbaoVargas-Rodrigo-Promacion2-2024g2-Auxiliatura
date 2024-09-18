package math;

public class App {
    public static void main(String[] args) throws Exception {
        VectorOperation operation = new VectorOperation();

        
        Vector a = new Vector(28, 45);
        Vector b = new Vector(8, 41);

        
        Integer resultSum = operation.add(25, 5);

    
        Integer resultSub = operation.subtract(25, 5);

     
        Integer resultMul = operation.multiply(25, 5);

       
        Vector vectorSum = operation.add(a, b);

       
        Vector vectorSub = operation.subtract(a, b);

        
        Vector vectorMul = operation.multiply(a, 2);

     
        operation.print(resultSum);
        operation.print(resultSub);
        operation.print(resultMul);
        operation.print(vectorSum);
        operation.print(vectorSub);
        operation.print(vectorMul);
    }
}