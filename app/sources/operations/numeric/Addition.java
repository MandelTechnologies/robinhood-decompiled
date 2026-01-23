package operations.numeric;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import operations.numeric.DoubleTypeSensitiveOperation;
import operations.numeric.unwrap.StrictUnwrapStrategy;

/* compiled from: Addition.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, m3636d2 = {"Loperations/numeric/Addition;", "Loperation/StandardLogicOperation;", "Loperations/numeric/DoubleTypeSensitiveOperation;", "Loperations/numeric/unwrap/StrictUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Addition implements StandardLogicOperation, DoubleTypeSensitiveOperation, StrictUnwrapStrategy {
    public static final Addition INSTANCE = new Addition();

    private Addition() {
    }

    public Double doubleResultOrNull(Object obj, Function1<? super List<Double>, Double> function1) {
        return DoubleTypeSensitiveOperation.DefaultImpls.doubleResultOrNull(this, obj, function1);
    }

    public List<Object> unwrapValue(Object obj) {
        return StrictUnwrapStrategy.DefaultImpls.unwrapValue(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        return doubleResultOrNull(unwrapValue(expression), new Function1<List<? extends Double>, Double>() { // from class: operations.numeric.Addition.evaluateLogic.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Double invoke2(List<Double> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Double.valueOf(CollectionsKt.sumOfDouble(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(List<? extends Double> list) {
                return invoke2((List<Double>) list);
            }
        });
    }
}
