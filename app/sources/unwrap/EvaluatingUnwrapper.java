package unwrap;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.LogicEvaluator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import utils.AnyUtils;

/* compiled from: EvaluatingUnwrapper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, m3636d2 = {"Lunwrap/EvaluatingUnwrapper;", "", "unwrapDataByEvaluation", "", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluator", "LLogicEvaluator;", "unwrapOperationData", "operations-api"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public interface EvaluatingUnwrapper {
    List<Object> unwrapDataByEvaluation(List<? extends Object> expression, Object data, LogicEvaluator evaluator);

    /* compiled from: EvaluatingUnwrapper.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static List<Object> unwrapDataByEvaluation(EvaluatingUnwrapper evaluatingUnwrapper, List<? extends Object> expression, Object obj, LogicEvaluator evaluator) {
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            Object objUnwrapOperationData = unwrapOperationData(evaluatingUnwrapper, CollectionsKt.firstOrNull((List) expression), obj, evaluator);
            if (objUnwrapOperationData instanceof List) {
                return (List) objUnwrapOperationData;
            }
            return null;
        }

        private static Object unwrapOperationData(EvaluatingUnwrapper evaluatingUnwrapper, Object obj, Object obj2, LogicEvaluator logicEvaluator) {
            if (!(obj instanceof List)) {
                if (!AnyUtils.isExpression(obj)) {
                    return obj;
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return logicEvaluator.evaluateLogic((Map) obj, obj2);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(unwrapOperationData(evaluatingUnwrapper, it.next(), obj2, logicEvaluator));
            }
            return arrayList;
        }
    }
}
