package ist.gt.gastBuilder;

import ist.gt.model.Assignment;
import ist.gt.model.Expression;
import ist.gt.model.Variable;

//TODO Add more cases if they apply
public interface ValueTrackingInterface {
    void track(Assignment assignment);

    void track(Expression expression);
    
    void track(Variable variable);
}