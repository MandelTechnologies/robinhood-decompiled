package array;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import unwrap.EvaluatingUnwrapper;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: Find.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Larray/Find;", "Loperation/FunctionalLogicOperation;", "Lunwrap/EvaluatingUnwrapper;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluator", "LLogicEvaluator;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class Find implements FunctionalLogicOperation, EvaluatingUnwrapper {
    public static final Find INSTANCE = new Find();

    private Find() {
    }

    @Override // unwrap.EvaluatingUnwrapper
    public List<Object> unwrapDataByEvaluation(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return EvaluatingUnwrapper.DefaultImpls.unwrapDataByEvaluation(this, list, obj, logicEvaluator);
    }

    @Override // operation.FunctionalLogicOperation
    public Object evaluateLogic(Object expression, Object data, LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> asList = AnyUtils.getAsList(expression);
        List<Object> listUnwrapDataByEvaluation = INSTANCE.unwrapDataByEvaluation(asList, data, evaluator);
        Map<String, ? extends Object> mappingOperationOrNull = ListUtils3.getMappingOperationOrNull(asList);
        if (mappingOperationOrNull != null && listUnwrapDataByEvaluation != null) {
            for (Object obj : listUnwrapDataByEvaluation) {
                if (Intrinsics.areEqual(evaluator.evaluateLogic(mappingOperationOrNull, obj), Boolean.TRUE)) {
                    return obj;
                }
            }
        }
        return null;
    }
}
