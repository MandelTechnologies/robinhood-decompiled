package operations.array;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import operations.array.NoInitialValueOperation;

/* compiled from: Map.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J8\u0010\u000e\u001a\u0004\u0018\u00010\u0005*\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0014"}, m3636d2 = {"Loperations/array/Map;", "Loperation/FunctionalLogicOperation;", "Loperations/array/NoInitialValueOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluator", "LLogicEvaluator;", "mapOrEmptyList", "", "operationInput", "Loperations/array/ArrayOperationInputData;", "mapValue", "evaluatedValue", "mappingOperation", "", "", "operationDefault", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Map implements FunctionalLogicOperation, NoInitialValueOperation {
    public static final Map INSTANCE = new Map();

    private Map() {
    }

    @Override // operations.array.ArrayOperation
    public ArrayOperationInputData createOperationInput(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return NoInitialValueOperation.DefaultImpls.createOperationInput(this, list, obj, logicEvaluator);
    }

    @Override // operations.array.ArrayOperation
    public Object getOperationDefault(java.util.Map<String, ? extends Object> map, List<? extends Object> list) {
        return NoInitialValueOperation.DefaultImpls.getOperationDefault(this, map, list);
    }

    @Override // operations.array.NoInitialValueOperation
    public Object invokeArrayOperation(Object obj, Object obj2, LogicEvaluator logicEvaluator, Function2<? super ArrayOperationInputData, ? super LogicEvaluator, ? extends Object> function2) {
        return NoInitialValueOperation.DefaultImpls.invokeArrayOperation(this, obj, obj2, logicEvaluator, function2);
    }

    @Override // unwrap.EvaluatingUnwrapper
    public List<Object> unwrapDataByEvaluation(List<? extends Object> list, Object obj, LogicEvaluator logicEvaluator) {
        return NoInitialValueOperation.DefaultImpls.unwrapDataByEvaluation(this, list, obj, logicEvaluator);
    }

    /* compiled from: Map.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: operations.array.Map$evaluateLogic$1 */
    /* synthetic */ class C473741 extends FunctionReferenceImpl implements Function2<ArrayOperationInputData, LogicEvaluator, List<? extends Object>> {
        C473741(Object obj) {
            super(2, obj, Map.class, "mapOrEmptyList", "mapOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<Object> invoke(ArrayOperationInputData p0, LogicEvaluator p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((Map) this.receiver).mapOrEmptyList(p0, p1);
        }
    }

    @Override // operation.FunctionalLogicOperation
    public Object evaluateLogic(Object expression, Object data, LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return invokeArrayOperation(expression, data, evaluator, new C473741(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> mapOrEmptyList(ArrayOperationInputData operationInput, LogicEvaluator evaluator) {
        List<Object> operationData = operationInput.getOperationData();
        if (operationData == null) {
            operationData = CollectionsKt.emptyList();
        }
        List<Object> list = operationData;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapValue(evaluator, it.next(), operationInput.getMappingOperation(), operationInput.getOperationDefault()));
        }
        return arrayList;
    }

    private final Object mapValue(LogicEvaluator logicEvaluator, Object obj, java.util.Map<String, ? extends Object> map, Object obj2) {
        Object objEvaluateLogic;
        return (map == null || (objEvaluateLogic = logicEvaluator.evaluateLogic(map, obj)) == null) ? obj2 : objEvaluateLogic;
    }
}
