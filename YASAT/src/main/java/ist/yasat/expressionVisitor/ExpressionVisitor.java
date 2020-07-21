package ist.yasat.expressionVisitor;

import ist.yasat.model.*;

public class ExpressionVisitor implements Visitor {
    private final Expression expr;

    public ExpressionVisitor(Expression expression) {
        expr = expression;
    }

    @Override
    public boolean visit(ArithmeticOperation e) {
        e.getMembers().add(expr);
        return true;
    }

    @Override
    public boolean visit(FunctionCall e) {
        e.getMembers().add(expr);
        return true;
    }

    @Override
    public boolean visit(Expression e) {
        e.getMembers().add(expr);
        return true;
    }

    @Override
    public boolean visit(Assignment e) {
        if (e.getVariable() == null)
            expr.accept(new AssignmentVisitor(e));
        else
            e.setValue(expr);
        return true;
    }

    @Override
    public boolean visit(ReturnStatement stmt) {
        stmt.setExpression(expr);
        return true;
    }

    @Override
    public boolean visit(Variable var) {
        return true;
    }

    @Override
    public boolean visit(Constant constant) {
        return true;
    }

}
