package ist.yasat.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Expression extends Taintable implements Statement {
    private List<Expression> members = new ArrayList<>();
}