class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int ans = 0;

        try {
            ans = switch(operation) {
                case "+" -> operand1 + operand2;
                case "*" -> operand1 * operand2;
                case "/" -> operand1 / operand2;
                default -> throw new
                    IllegalOperationException("Operation '" + operation + "' does not exist");
            };
        } catch (ArithmeticException exception) {
            throw new IllegalOperationException("Division by zero is not allowed", exception);
        }

        return operand1 + " " + operation + " " + operand2 + " = " + ans;
    }
}
