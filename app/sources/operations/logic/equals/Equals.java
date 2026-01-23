package operations.logic.equals;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import operation.StandardLogicOperation;
import operations.logic.equals.EqualsOperation;

/* compiled from: Equals.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Loperations/logic/equals/Equals;", "Loperation/StandardLogicOperation;", "Loperations/logic/equals/EqualsOperation;", "()V", "evaluateLogic", "", "expression", "", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Equals implements StandardLogicOperation, EqualsOperation {
    public static final Equals INSTANCE = new Equals();

    private Equals() {
    }

    public boolean compare(Object obj, Function2<? super Integer, ? super Integer, Boolean> function2) {
        return EqualsOperation.DefaultImpls.compare(this, obj, function2);
    }

    @Override // operations.ComparingOperation
    public boolean compareListOfTwo(List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
        return EqualsOperation.DefaultImpls.compareListOfTwo(this, list, function2);
    }

    @Override // operations.ComparableUnwrapStrategy
    public List<Comparable<?>> unwrapAsComparable(Comparable<?> comparable, Comparable<?> comparable2) {
        return EqualsOperation.DefaultImpls.unwrapAsComparable(this, comparable, comparable2);
    }

    @Override // operations.ComparableUnwrapStrategy
    public List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(Comparable<?> comparable, Comparable<?> comparable2) {
        return EqualsOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(this, comparable, comparable2);
    }

    @Override // operations.logic.unwrap.SingleNestedValueUnwrapStrategy
    public Object unwrapSingleNestedValueOrDefault(Object obj) {
        return EqualsOperation.DefaultImpls.unwrapSingleNestedValueOrDefault(this, obj);
    }

    @Override // operations.logic.unwrap.EqualsUnwrapStrategy
    public Object unwrapValue(Object obj) {
        return EqualsOperation.DefaultImpls.unwrapValue(this, obj);
    }

    @Override // operations.BooleanUnwrapStrategy
    public Boolean unwrapValueAsBoolean(Object obj) {
        return EqualsOperation.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Boolean evaluateLogic(Object expression, Object data) {
        return Boolean.valueOf(compare(expression, new Function2<Integer, Integer, Boolean>() { // from class: operations.logic.equals.Equals.evaluateLogic.1
            public final Boolean invoke(int i, int i2) {
                return Boolean.valueOf(i == i2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2) {
                return invoke(num.intValue(), num2.intValue());
            }
        }));
    }
}
