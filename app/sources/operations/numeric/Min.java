package operations.numeric;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import operations.numeric.DoubleTypeSensitiveOperation;

/* compiled from: Min.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Loperations/numeric/Min;", "Loperation/StandardLogicOperation;", "Loperations/numeric/DoubleTypeSensitiveOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Min implements StandardLogicOperation, DoubleTypeSensitiveOperation {
    public static final Min INSTANCE = new Min();

    private Min() {
    }

    public Double doubleResultOrNull(Object obj, Function1<? super List<Double>, Double> function1) {
        return DoubleTypeSensitiveOperation.DefaultImpls.doubleResultOrNull(this, obj, function1);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        return doubleResultOrNull(expression, new Function1<List<? extends Double>, Double>() { // from class: operations.numeric.Min.evaluateLogic.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Double invoke2(List<Double> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.minOrNull((Iterable) it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(List<? extends Double> list) {
                return invoke2((List<Double>) list);
            }
        });
    }
}
