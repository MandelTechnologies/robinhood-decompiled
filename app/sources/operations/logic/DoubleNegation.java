package operations.logic;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import operation.StandardLogicOperation;
import operations.logic.unwrap.TruthyUnwrapStrategy;
import utils.AnyUtils;

/* compiled from: DoubleNegation.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Loperations/logic/DoubleNegation;", "Loperation/StandardLogicOperation;", "Loperations/logic/unwrap/TruthyUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", "", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class DoubleNegation implements StandardLogicOperation, TruthyUnwrapStrategy {
    public static final DoubleNegation INSTANCE = new DoubleNegation();

    private DoubleNegation() {
    }

    public boolean unwrapValueAsBoolean(Object obj) {
        return TruthyUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Boolean evaluateLogic(Object expression, Object data) {
        return Boolean.valueOf(unwrapValueAsBoolean(CollectionsKt.firstOrNull((List) AnyUtils.getAsList(expression))));
    }
}
