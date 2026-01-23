package operations.array.occurence;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import operations.array.ArrayOperationInputData;
import operations.array.occurence.OccurrenceCheckOperation;

/* compiled from: None.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J3\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loperations/array/occurence/None;", "Loperation/FunctionalLogicOperation;", "Loperations/array/occurence/OccurrenceCheckOperation;", "()V", "check", "", WebsocketGatewayConstants.DATA_KEY, "Loperations/array/occurence/OccurrenceCheckInputData;", "evaluator", "LLogicEvaluator;", "evaluateLogic", "expression", "getOperationDefault", "", "mappingOperation", "", "", "expressionValues", "", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class None implements FunctionalLogicOperation, OccurrenceCheckOperation {
    public static final None INSTANCE = new None();

    private None() {
    }

    public Object checkOccurrence(Object obj, Object obj2, LogicEvaluator logicEvaluator) {
        return OccurrenceCheckOperation.DefaultImpls.checkOccurrence(this, obj, obj2, logicEvaluator);
    }

    @Override // operations.array.ArrayOperation
    public ArrayOperationInputData createOperationInput(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return OccurrenceCheckOperation.DefaultImpls.createOperationInput(this, list, obj, logicEvaluator);
    }

    @Override // operations.array.ArrayOperation
    public /* bridge */ /* synthetic */ Object getOperationDefault(Map map, List list) {
        return getOperationDefault((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }

    @Override // operations.array.NoInitialValueOperation
    public Object invokeArrayOperation(Object obj, Object obj2, LogicEvaluator logicEvaluator, Function2<? super ArrayOperationInputData, ? super LogicEvaluator, ? extends Object> function2) {
        return OccurrenceCheckOperation.DefaultImpls.invokeArrayOperation(this, obj, obj2, logicEvaluator, function2);
    }

    @Override // unwrap.EvaluatingUnwrapper
    public List<Object> unwrapDataByEvaluation(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return OccurrenceCheckOperation.DefaultImpls.unwrapDataByEvaluation(this, list, obj, logicEvaluator);
    }

    public boolean unwrapValueAsBoolean(Object obj) {
        return OccurrenceCheckOperation.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    @Override // operation.FunctionalLogicOperation
    public Object evaluateLogic(Object expression, Object data, LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return checkOccurrence(expression, data, evaluator);
    }

    @Override // operations.array.ArrayOperation
    public Boolean getOperationDefault(Map<String, ? extends Object> mappingOperation, List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        return Boolean.TRUE;
    }

    @Override // operations.array.occurence.OccurrenceCheckOperation
    public Object check(OccurrenceCheckInputData data, LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Iterator<T> it = data.getOperationData().iterator();
        while (it.hasNext()) {
            if (INSTANCE.unwrapValueAsBoolean(evaluator.evaluateLogic(data.getMappingOperation(), it.next()))) {
                return Boolean.FALSE;
            }
        }
        return data.getOperationDefault();
    }
}
