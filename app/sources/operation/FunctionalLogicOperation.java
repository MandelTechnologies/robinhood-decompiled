package operation;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import kotlin.Metadata;

/* compiled from: FunctionalLogicOperation.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Loperation/FunctionalLogicOperation;", "", "evaluateLogic", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluator", "LLogicEvaluator;", "operations-api"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface FunctionalLogicOperation {
    Object evaluateLogic(Object expression, Object data, LogicEvaluator evaluator);
}
