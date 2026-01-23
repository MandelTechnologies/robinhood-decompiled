package operations.array;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import operations.array.ArrayOperation;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: Reduce.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Loperations/array/Reduce;", "Loperation/FunctionalLogicOperation;", "Loperations/array/ArrayOperation;", "<init>", "()V", "Loperations/array/ArrayOperationInputData;", "operationInput", "", "initialValue", "LLogicEvaluator;", "evaluator", "reduceOrInitial", "(Loperations/array/ArrayOperationInputData;Ljava/lang/Object;LLogicEvaluator;)Ljava/lang/Object;", "accumulator", "evaluatedValue", "", "", "mappingOperation", "reduceValue", "(LLogicEvaluator;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "current", "toReduceIterationData", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;LLogicEvaluator;)Ljava/lang/Object;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Reduce implements FunctionalLogicOperation, ArrayOperation {
    public static final Reduce INSTANCE = new Reduce();

    private Reduce() {
    }

    @Override // operations.array.ArrayOperation
    public ArrayOperationInputData createOperationInput(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return ArrayOperation.DefaultImpls.createOperationInput(this, list, obj, logicEvaluator);
    }

    @Override // operations.array.ArrayOperation
    public Object getOperationDefault(java.util.Map<String, ? extends Object> map, List<? extends Object> list) {
        return ArrayOperation.DefaultImpls.getOperationDefault(this, map, list);
    }

    @Override // unwrap.EvaluatingUnwrapper
    public List<Object> unwrapDataByEvaluation(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return ArrayOperation.DefaultImpls.unwrapDataByEvaluation(this, list, obj, logicEvaluator);
    }

    @Override // operation.FunctionalLogicOperation
    public Object evaluateLogic(Object expression, Object data, LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> asList = AnyUtils.getAsList(expression);
        Reduce reduce = INSTANCE;
        return reduce.reduceOrInitial(reduce.createOperationInput(asList, data, evaluator), ListUtils3.thirdOrNull(asList), evaluator);
    }

    private final Object reduceOrInitial(ArrayOperationInputData operationInput, Object initialValue, LogicEvaluator evaluator) {
        List<Object> operationData = operationInput.getOperationData();
        if (operationData != null) {
            Iterator<T> it = operationData.iterator();
            Object objReduceValue = initialValue;
            while (it.hasNext()) {
                objReduceValue = INSTANCE.reduceValue(evaluator, objReduceValue, it.next(), operationInput.getMappingOperation());
                if (objReduceValue == null) {
                    return operationInput.getOperationDefault();
                }
            }
            if (objReduceValue != null) {
                return objReduceValue;
            }
        }
        return initialValue;
    }

    private final Object reduceValue(LogicEvaluator logicEvaluator, Object obj, Object obj2, java.util.Map<String, ? extends Object> map) {
        if (map != null) {
            return logicEvaluator.evaluateLogic(map, INSTANCE.toReduceIterationData(obj, obj2));
        }
        return null;
    }

    private final java.util.Map<String, Object> toReduceIterationData(Object accumulator, Object current) {
        return MapsKt.mapOf(Tuples4.m3642to("accumulator", accumulator), Tuples4.m3642to("current", current));
    }
}
