package operations.array;

import defpackage.LogicEvaluator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import operations.array.ArrayOperation;
import utils.AnyUtils;

/* compiled from: NoInitialValueOperation.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Loperations/array/NoInitialValueOperation;", "Loperations/array/ArrayOperation;", "invokeArrayOperation", "", "expression", "operationData", "evaluator", "LLogicEvaluator;", "arrayOperation", "Lkotlin/Function2;", "Loperations/array/ArrayOperationInputData;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface NoInitialValueOperation extends ArrayOperation {
    Object invokeArrayOperation(Object expression, Object operationData, LogicEvaluator evaluator, Function2<? super ArrayOperationInputData, ? super LogicEvaluator, ? extends Object> arrayOperation);

    /* compiled from: NoInitialValueOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static ArrayOperationInputData createOperationInput(NoInitialValueOperation noInitialValueOperation, List<? extends Object> expressionValues, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return ArrayOperation.DefaultImpls.createOperationInput(noInitialValueOperation, expressionValues, obj, evaluator);
        }

        public static Object getOperationDefault(NoInitialValueOperation noInitialValueOperation, java.util.Map<String, ? extends Object> map, List<? extends Object> expressionValues) {
            Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
            return ArrayOperation.DefaultImpls.getOperationDefault(noInitialValueOperation, map, expressionValues);
        }

        public static List<Object> unwrapDataByEvaluation(NoInitialValueOperation noInitialValueOperation, List<? extends Object> expression, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return ArrayOperation.DefaultImpls.unwrapDataByEvaluation(noInitialValueOperation, expression, obj, evaluator);
        }

        public static Object invokeArrayOperation(NoInitialValueOperation noInitialValueOperation, Object obj, Object obj2, LogicEvaluator evaluator, Function2<? super ArrayOperationInputData, ? super LogicEvaluator, ? extends Object> arrayOperation) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            Intrinsics.checkNotNullParameter(arrayOperation, "arrayOperation");
            return arrayOperation.invoke(noInitialValueOperation.createOperationInput(AnyUtils.getAsList(obj), obj2, evaluator), evaluator);
        }
    }
}
