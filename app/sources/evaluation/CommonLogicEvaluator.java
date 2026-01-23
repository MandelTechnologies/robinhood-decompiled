package evaluation;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.JsonLogicException;
import defpackage.LogicEvaluator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import operation.StandardLogicOperation;

/* compiled from: CommonLogicEvaluator.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J$\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\"\u0010\u000e\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Levaluation/CommonLogicEvaluator;", "LLogicEvaluator;", "operations", "Levaluation/LogicOperations;", "(Levaluation/LogicOperations;)V", "evaluateLogic", "", "expression", "", "", WebsocketGatewayConstants.DATA_KEY, "executeExpression", "logic", "executeOperation", "getOperation", "Loperation/StandardLogicOperation;", "operator", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CommonLogicEvaluator implements LogicEvaluator {
    private final LogicOperations operations;

    public CommonLogicEvaluator(LogicOperations operations2) {
        Intrinsics.checkNotNullParameter(operations2, "operations");
        this.operations = operations2;
    }

    @Override // defpackage.LogicEvaluator
    public Object evaluateLogic(Map<String, ? extends Object> expression, Object data) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return executeExpression(expression, data);
    }

    private final Object executeExpression(Object logic, Object data) {
        if (!(logic instanceof List)) {
            if (!(logic instanceof Map)) {
                return logic;
            }
            Map<?, ?> map = (Map) logic;
            return map.isEmpty() ? data : executeOperation(map, data);
        }
        Iterable iterable = (Iterable) logic;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(executeExpression(it.next(), data));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    private final Object executeOperation(Map<?, ?> logic, Object data) throws JsonLogicException {
        Object objExecuteExpression;
        Object objFirstOrNull = CollectionsKt.firstOrNull(logic.keySet());
        Object obj = logic.get(objFirstOrNull);
        if (CollectionsKt.contains(this.operations.getFunctionalOperations().keySet(), objFirstOrNull)) {
            FunctionalLogicOperation functionalLogicOperation = this.operations.getFunctionalOperations().get(objFirstOrNull);
            if (functionalLogicOperation != null) {
                return functionalLogicOperation.evaluateLogic(obj, data, this);
            }
            return null;
        }
        StandardLogicOperation operation2 = getOperation(this.operations.getStandardOperations(), objFirstOrNull);
        if (!(obj instanceof List)) {
            objExecuteExpression = obj instanceof Map ? executeExpression(obj, data) : executeExpression(obj, data);
        } else {
            Iterable iterable = (Iterable) obj;
            objExecuteExpression = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                objExecuteExpression.add(executeExpression(it.next(), data));
            }
        }
        return operation2.evaluateLogic(objExecuteExpression, data);
    }

    private final StandardLogicOperation getOperation(Map<String, ? extends StandardLogicOperation> map, Object obj) throws JsonLogicException {
        StandardLogicOperation standardLogicOperation = map.get(obj);
        if (standardLogicOperation != null) {
            return standardLogicOperation;
        }
        throw new JsonLogicException("Operation " + obj + " not found.");
    }
}
