package operations.numeric.compare;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import operation.StandardLogicOperation;
import operations.numeric.compare.RangeComparingOperation;
import utils.AnyUtils;

/* compiled from: LessThanOrEqualTo.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Loperations/numeric/compare/LessThanOrEqualTo;", "Loperation/StandardLogicOperation;", "Loperations/numeric/compare/RangeComparingOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class LessThanOrEqualTo implements StandardLogicOperation, RangeComparingOperation {
    public static final LessThanOrEqualTo INSTANCE = new LessThanOrEqualTo();

    private LessThanOrEqualTo() {
    }

    @Override // operations.ComparingOperation
    public boolean compareListOfTwo(List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
        return RangeComparingOperation.DefaultImpls.compareListOfTwo(this, list, function2);
    }

    public boolean compareOrBetween(List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
        return RangeComparingOperation.DefaultImpls.compareOrBetween(this, list, function2);
    }

    @Override // operations.ComparableUnwrapStrategy
    public List<Comparable<?>> unwrapAsComparable(Comparable<?> comparable, Comparable<?> comparable2) {
        return RangeComparingOperation.DefaultImpls.unwrapAsComparable(this, comparable, comparable2);
    }

    @Override // operations.ComparableUnwrapStrategy
    public List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(Comparable<?> comparable, Comparable<?> comparable2) {
        return RangeComparingOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(this, comparable, comparable2);
    }

    @Override // operations.BooleanUnwrapStrategy
    public Boolean unwrapValueAsBoolean(Object obj) {
        return RangeComparingOperation.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        return Boolean.valueOf(compareOrBetween(AnyUtils.getAsList(expression), new Function2<Integer, Integer, Boolean>() { // from class: operations.numeric.compare.LessThanOrEqualTo.evaluateLogic.1
            public final Boolean invoke(int i, int i2) {
                return Boolean.valueOf(i <= i2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2) {
                return invoke(num.intValue(), num2.intValue());
            }
        }));
    }
}
