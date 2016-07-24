package Golovach_courses.Lection1_5;

public class Parser_q {
    public static int eval(String expr) {
        if (expr.startsWith("(") && expr.endsWith(")")) {
            return eval(expr.substring(1, expr.length() - 1));
        } else if (expr.startsWith("(") && !expr.endsWith(")")) {
            throw new RuntimeException("If expr start with '(' then MDS");
        } else {
            int pos = 0;
            while (pos < expr.length() - 1) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos++;

                } else {
                    int leftOperand = Integer.valueOf(expr.substring(0, pos));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr.substring(pos + 1));
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;

                    }
                }
            }
                return Integer.valueOf(expr);


        }

    }

}
