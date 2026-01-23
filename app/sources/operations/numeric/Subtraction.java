package operations.numeric;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import operation.StandardLogicOperation;
import operations.numeric.unwrap.LenientUnwrapStrategy;

/* compiled from: Subtraction.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"Loperations/numeric/Subtraction;", "Loperation/StandardLogicOperation;", "Loperations/numeric/unwrap/LenientUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", "", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "minusOrNull", "first", "second", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Subtraction implements StandardLogicOperation, LenientUnwrapStrategy {
    public static final Subtraction INSTANCE = new Subtraction();

    private Subtraction() {
    }

    public List<Double> unwrapValueAsDouble(Object obj) {
        return LenientUnwrapStrategy.DefaultImpls.unwrapValueAsDouble(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Double evaluateLogic(Object expression, Object data) {
        List<Double> listUnwrapValueAsDouble = unwrapValueAsDouble(expression);
        int size = listUnwrapValueAsDouble.size();
        if (size != 0) {
            if (size == 1) {
                Double d = (Double) CollectionsKt.first((List) listUnwrapValueAsDouble);
                if (d != null) {
                    return Double.valueOf(-d.doubleValue());
                }
            } else {
                return INSTANCE.minusOrNull((Double) CollectionsKt.first((List) listUnwrapValueAsDouble), listUnwrapValueAsDouble.get(1));
            }
        }
        return null;
    }

    private final Double minusOrNull(Double first, Double second) {
        if (first == null || second == null) {
            return null;
        }
        return Double.valueOf(first.doubleValue() - second.doubleValue());
    }
}
