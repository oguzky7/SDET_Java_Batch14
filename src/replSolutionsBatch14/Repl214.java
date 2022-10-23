package Repl214;

class Main {
    public static void main(String[] args) {
        int grade = 91;
        if (grade > 90) {
            System.out.println(new SyntaxStudentException("You are an exceptionally awesome student"));
        } else {
            System.out.println(new SyntaxStudentException("You are a great student"));
        }
    }
}

class SyntaxStudentException extends RuntimeException {
    SyntaxStudentException(String errorMessage) {
        super(errorMessage);
    }
}