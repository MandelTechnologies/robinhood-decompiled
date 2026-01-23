package operations.array.occurence;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import operations.array.ArrayOperationInputData;
import operations.array.NoInitialValueOperation;
import operations.array.occurence.OccurrenceCheckOperation;
import operations.logic.unwrap.TruthyUnwrapStrategy;

/* compiled from: OccurrenceCheckOperation.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Loperations/array/occurence/OccurrenceCheckOperation;", "Loperations/array/NoInitialValueOperation;", "Loperations/logic/unwrap/TruthyUnwrapStrategy;", "Loperations/array/occurence/OccurrenceCheckInputData;", WebsocketGatewayConstants.DATA_KEY, "LLogicEvaluator;", "evaluator", "", "check", "(Loperations/array/occurence/OccurrenceCheckInputData;LLogicEvaluator;)Ljava/lang/Object;", "Loperations/array/ArrayOperationInputData;", "operationInput", "Lkotlin/Function2;", "arrayOperation", "evaluateOrDefault", "(Loperations/array/ArrayOperationInputData;LLogicEvaluator;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toOccurrenceCheckInput", "(Loperations/array/ArrayOperationInputData;)Loperations/array/occurence/OccurrenceCheckInputData;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface OccurrenceCheckOperation extends NoInitialValueOperation, TruthyUnwrapStrategy {
    Object check(OccurrenceCheckInputData data, LogicEvaluator evaluator);

    /* compiled from: OccurrenceCheckOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static ArrayOperationInputData createOperationInput(OccurrenceCheckOperation occurrenceCheckOperation, List<? extends Object> expressionValues, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return NoInitialValueOperation.DefaultImpls.createOperationInput(occurrenceCheckOperation, expressionValues, obj, evaluator);
        }

        public static Object invokeArrayOperation(OccurrenceCheckOperation occurrenceCheckOperation, Object obj, Object obj2, LogicEvaluator evaluator, Function2<? super ArrayOperationInputData, ? super LogicEvaluator, ? extends Object> arrayOperation) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            Intrinsics.checkNotNullParameter(arrayOperation, "arrayOperation");
            return NoInitialValueOperation.DefaultImpls.invokeArrayOperation(occurrenceCheckOperation, obj, obj2, evaluator, arrayOperation);
        }

        public static List<Object> unwrapDataByEvaluation(OccurrenceCheckOperation occurrenceCheckOperation, List<? extends Object> expression, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return NoInitialValueOperation.DefaultImpls.unwrapDataByEvaluation(occurrenceCheckOperation, expression, obj, evaluator);
        }

        public static boolean unwrapValueAsBoolean(OccurrenceCheckOperation occurrenceCheckOperation, Object obj) {
            return TruthyUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(occurrenceCheckOperation, obj);
        }

        public static Object checkOccurrence(final OccurrenceCheckOperation occurrenceCheckOperation, Object obj, Object obj2, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return occurrenceCheckOperation.invokeArrayOperation(obj, obj2, evaluator, new Function2<ArrayOperationInputData, LogicEvaluator, Object>() { // from class: operations.array.occurence.OccurrenceCheckOperation$checkOccurrence$1
                {
                    super(2);
                }

                /* compiled from: OccurrenceCheckOperation.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                /* renamed from: operations.array.occurence.OccurrenceCheckOperation$checkOccurrence$1$1 */
                /* synthetic */ class C473751 extends FunctionReferenceImpl implements Function2<OccurrenceCheckInputData, LogicEvaluator, Object> {
                    C473751(Object obj) {
                        super(2, obj, OccurrenceCheckOperation.class, "check", "check(Loperations/array/occurence/OccurrenceCheckInputData;LLogicEvaluator;)Ljava/lang/Object;", 0);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OccurrenceCheckInputData p0, LogicEvaluator p1) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        return ((OccurrenceCheckOperation) this.receiver).check(p0, p1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ArrayOperationInputData input, LogicEvaluator logicEvaluator) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(logicEvaluator, "logicEvaluator");
                    return OccurrenceCheckOperation.DefaultImpls.evaluateOrDefault(occurrenceCheckOperation, input, logicEvaluator, new C473751(occurrenceCheckOperation));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object evaluateOrDefault(OccurrenceCheckOperation occurrenceCheckOperation, ArrayOperationInputData arrayOperationInputData, LogicEvaluator logicEvaluator, Function2<? super OccurrenceCheckInputData, ? super LogicEvaluator, ? extends Object> function2) {
            Object objInvoke;
            OccurrenceCheckInputData occurrenceCheckInput = toOccurrenceCheckInput(occurrenceCheckOperation, arrayOperationInputData);
            return (occurrenceCheckInput == null || (objInvoke = function2.invoke(occurrenceCheckInput, logicEvaluator)) == null) ? arrayOperationInputData.getOperationDefault() : objInvoke;
        }

        public static Boolean getOperationDefault(OccurrenceCheckOperation occurrenceCheckOperation, Map<String, ? extends Object> map, List<? extends Object> expressionValues) {
            Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
            return Boolean.FALSE;
        }

        private static OccurrenceCheckInputData toOccurrenceCheckInput(OccurrenceCheckOperation occurrenceCheckOperation, ArrayOperationInputData arrayOperationInputData) {
            if (arrayOperationInputData.getMappingOperation() == null || arrayOperationInputData.getOperationData() == null || arrayOperationInputData.getOperationData().isEmpty()) {
                return null;
            }
            return new OccurrenceCheckInputData(arrayOperationInputData.getOperationData(), arrayOperationInputData.getMappingOperation(), arrayOperationInputData.getOperationDefault());
        }
    }
}
