package operations.array;

import defpackage.LogicEvaluator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import unwrap.EvaluatingUnwrapper;
import utils.ListUtils3;

/* compiled from: ArrayOperation.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016¨\u0006\u000e"}, m3636d2 = {"Loperations/array/ArrayOperation;", "Lunwrap/EvaluatingUnwrapper;", "createOperationInput", "Loperations/array/ArrayOperationInputData;", "expressionValues", "", "", "operationData", "evaluator", "LLogicEvaluator;", "getOperationDefault", "mappingOperation", "", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface ArrayOperation extends EvaluatingUnwrapper {
    ArrayOperationInputData createOperationInput(List<? extends Object> expressionValues, Object operationData, LogicEvaluator evaluator);

    Object getOperationDefault(java.util.Map<String, ? extends Object> mappingOperation, List<? extends Object> expressionValues);

    /* compiled from: ArrayOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static List<Object> unwrapDataByEvaluation(ArrayOperation arrayOperation, List<? extends Object> expression, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return EvaluatingUnwrapper.DefaultImpls.unwrapDataByEvaluation(arrayOperation, expression, obj, evaluator);
        }

        public static ArrayOperationInputData createOperationInput(ArrayOperation arrayOperation, List<? extends Object> expressionValues, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            List<Object> listUnwrapDataByEvaluation = arrayOperation.unwrapDataByEvaluation(expressionValues, obj, evaluator);
            java.util.Map<String, ? extends Object> mappingOperationOrNull = ListUtils3.getMappingOperationOrNull(expressionValues);
            return new ArrayOperationInputData(listUnwrapDataByEvaluation, mappingOperationOrNull, arrayOperation.getOperationDefault(mappingOperationOrNull, expressionValues));
        }

        public static Object getOperationDefault(ArrayOperation arrayOperation, java.util.Map<String, ? extends Object> map, List<? extends Object> expressionValues) {
            Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
            if (map == null) {
                return ListUtils3.secondOrNull(expressionValues);
            }
            return null;
        }
    }
}
