package operations.array;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import operations.array.NoInitialValueOperation;
import operations.logic.unwrap.TruthyUnwrapStrategy;

/* compiled from: Filter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J6\u0010\u000f\u001a\u00020\u0010*\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0016"}, m3636d2 = {"Loperations/array/Filter;", "Loperation/FunctionalLogicOperation;", "Loperations/array/NoInitialValueOperation;", "Loperations/logic/unwrap/TruthyUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluator", "LLogicEvaluator;", "filterOrEmptyList", "", "operationInput", "Loperations/array/ArrayOperationInputData;", "filterValue", "", "evaluatedValue", "mappingOperation", "", "", "operationDefault", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Filter implements FunctionalLogicOperation, NoInitialValueOperation, TruthyUnwrapStrategy {
    public static final Filter INSTANCE = new Filter();

    private Filter() {
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

    public boolean unwrapValueAsBoolean(Object obj) {
        return TruthyUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    /* compiled from: Filter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: operations.array.Filter$evaluateLogic$1 */
    /* synthetic */ class C473731 extends FunctionReferenceImpl implements Function2<ArrayOperationInputData, LogicEvaluator, List<? extends Object>> {
        C473731(Object obj) {
            super(2, obj, Filter.class, "filterOrEmptyList", "filterOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<Object> invoke(ArrayOperationInputData p0, LogicEvaluator p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((Filter) this.receiver).filterOrEmptyList(p0, p1);
        }
    }

    @Override // operation.FunctionalLogicOperation
    public Object evaluateLogic(Object expression, Object data, LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return invokeArrayOperation(expression, data, evaluator, new C473731(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> filterOrEmptyList(ArrayOperationInputData operationInput, LogicEvaluator evaluator) {
        List<Object> operationData = operationInput.getOperationData();
        if (operationData == null) {
            operationData = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : operationData) {
            if (INSTANCE.filterValue(evaluator, obj, operationInput.getMappingOperation(), operationInput.getOperationDefault())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean filterValue(LogicEvaluator logicEvaluator, Object obj, java.util.Map<String, ? extends Object> map, Object obj2) {
        Object objEvaluateLogic;
        if (map != null && (objEvaluateLogic = logicEvaluator.evaluateLogic(map, obj)) != null) {
            obj2 = objEvaluateLogic;
        }
        return unwrapValueAsBoolean(obj2);
    }
}
