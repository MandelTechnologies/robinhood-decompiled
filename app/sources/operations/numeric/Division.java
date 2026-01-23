package operations.numeric;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import operations.numeric.unwrap.LenientUnwrapStrategy;

/* compiled from: Division.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Loperations/numeric/Division;", "Loperation/StandardLogicOperation;", "Loperations/numeric/unwrap/LenientUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", "", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Division implements StandardLogicOperation, LenientUnwrapStrategy {
    public static final Division INSTANCE = new Division();

    private Division() {
    }

    public List<Double> unwrapValueAsDouble(Object obj) {
        return LenientUnwrapStrategy.DefaultImpls.unwrapValueAsDouble(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Double evaluateLogic(Object expression, Object data) {
        List<Double> listUnwrapValueAsDouble = unwrapValueAsDouble(expression);
        if (listUnwrapValueAsDouble.size() < 2) {
            listUnwrapValueAsDouble = null;
        }
        if (listUnwrapValueAsDouble != null) {
            Double d = listUnwrapValueAsDouble.get(1);
            Double d2 = (Double) CollectionsKt.first((List) listUnwrapValueAsDouble);
            if (d2 != null && d != null && !Intrinsics.areEqual(d, 0.0d)) {
                return Double.valueOf(d2.doubleValue() / d.doubleValue());
            }
        }
        return null;
    }
}
