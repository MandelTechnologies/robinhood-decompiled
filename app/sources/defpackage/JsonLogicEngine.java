package defpackage;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import evaluation.CommonLogicEvaluator;
import evaluation.LogicOperations;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.FunctionalLogicOperation;
import operation.StandardLogicOperation;
import operations.C47372In;
import operations.Log;
import operations.array.Filter;
import operations.array.Merge;
import operations.array.Reduce;
import operations.array.occurence.All;
import operations.array.occurence.None;
import operations.array.occurence.Some;
import operations.data.Missing;
import operations.data.MissingSome;
import operations.data.Var;
import operations.logic.And;
import operations.logic.C47376If;
import operations.logic.C47377Or;
import operations.logic.DoubleNegation;
import operations.logic.Negation;
import operations.logic.equals.Equals;
import operations.logic.equals.NotEquals;
import operations.logic.equals.strict.NotStrictEquals;
import operations.logic.equals.strict.StrictEquals;
import operations.numeric.Addition;
import operations.numeric.Division;
import operations.numeric.Max;
import operations.numeric.Min;
import operations.numeric.Modulo;
import operations.numeric.Multiplication;
import operations.numeric.Subtraction;
import operations.numeric.compare.GreaterThan;
import operations.numeric.compare.GreaterThanOrEqualTo;
import operations.numeric.compare.LessThan;
import operations.numeric.compare.LessThanOrEqualTo;
import operations.string.Cat;
import operations.string.Substr;

/* compiled from: JsonLogicEngine.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ(\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&¨\u0006\t"}, m3636d2 = {"LJsonLogicEngine;", "", "evaluate", "LJsonLogicResult;", "expression", "", "", WebsocketGatewayConstants.DATA_KEY, "Builder", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface JsonLogicEngine {
    JsonLogicResult evaluate(Map<String, ? extends Object> expression, Object data);

    /* compiled from: JsonLogicEngine.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, m3636d2 = {"LJsonLogicEngine$Builder;", "", "<init>", "()V", "", "operationName", "", "isNotOperationDuplicate", "(Ljava/lang/String;)Z", "Loperation/StandardLogicOperation;", "operation", "addStandardOperation", "(Ljava/lang/String;Loperation/StandardLogicOperation;)LJsonLogicEngine$Builder;", "", "operations", "addStandardOperations", "(Ljava/util/Map;)LJsonLogicEngine$Builder;", "Loperation/FunctionalLogicOperation;", "addFunctionalOperation", "(Ljava/lang/String;Loperation/FunctionalLogicOperation;)LJsonLogicEngine$Builder;", "addFunctionalOperations", "LJsonLogicEngine;", "build", "()LJsonLogicEngine;", "Lkotlin/Function1;", "", "logger", "Lkotlin/jvm/functions/Function1;", "", "standardOperations", "Ljava/util/Map;", "functionalOperations", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Builder {
        private Function1<Object, Unit> logger;
        private final Map<String, StandardLogicOperation> standardOperations = MapsKt.mutableMapOf(Tuples4.m3642to("var", Var.INSTANCE), Tuples4.m3642to("missing_some", MissingSome.INSTANCE), Tuples4.m3642to("missing", Missing.INSTANCE), Tuples4.m3642to(">", GreaterThan.INSTANCE), Tuples4.m3642to(">=", GreaterThanOrEqualTo.INSTANCE), Tuples4.m3642to("<", LessThan.INSTANCE), Tuples4.m3642to("<=", LessThanOrEqualTo.INSTANCE), Tuples4.m3642to("min", Min.INSTANCE), Tuples4.m3642to(AnalyticsStrings.MAX_WELCOME_TAG, Max.INSTANCE), Tuples4.m3642to("+", Addition.INSTANCE), Tuples4.m3642to("-", Subtraction.INSTANCE), Tuples4.m3642to("*", Multiplication.INSTANCE), Tuples4.m3642to("/", Division.INSTANCE), Tuples4.m3642to("%", Modulo.INSTANCE), Tuples4.m3642to("==", Equals.INSTANCE), Tuples4.m3642to("!=", NotEquals.INSTANCE), Tuples4.m3642to("===", StrictEquals.INSTANCE), Tuples4.m3642to("!==", NotStrictEquals.INSTANCE), Tuples4.m3642to("!", Negation.INSTANCE), Tuples4.m3642to("!!", DoubleNegation.INSTANCE), Tuples4.m3642to("and", And.INSTANCE), Tuples4.m3642to("or", C47377Or.INSTANCE), Tuples4.m3642to("if", C47376If.INSTANCE), Tuples4.m3642to("cat", Cat.INSTANCE), Tuples4.m3642to("substr", Substr.INSTANCE), Tuples4.m3642to("merge", Merge.INSTANCE), Tuples4.m3642to("in", C47372In.INSTANCE));
        private final Map<String, FunctionalLogicOperation> functionalOperations = MapsKt.mutableMapOf(Tuples4.m3642to("map", operations.array.Map.INSTANCE), Tuples4.m3642to("filter", Filter.INSTANCE), Tuples4.m3642to("reduce", Reduce.INSTANCE), Tuples4.m3642to(ApiRenderablePlatforms.VERSIONS_ALL, All.INSTANCE), Tuples4.m3642to(ApiRenderablePlatforms.VERSIONS_NONE, None.INSTANCE), Tuples4.m3642to("some", Some.INSTANCE));

        public final Builder addStandardOperation(String operationName, StandardLogicOperation operation2) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation2, "operation");
            if (isNotOperationDuplicate(operationName)) {
                this.standardOperations.put(operationName, operation2);
            }
            return this;
        }

        public final Builder addFunctionalOperation(String operationName, FunctionalLogicOperation operation2) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation2, "operation");
            if (isNotOperationDuplicate(operationName)) {
                this.functionalOperations.put(operationName, operation2);
            }
            return this;
        }

        private final boolean isNotOperationDuplicate(String operationName) {
            return (this.functionalOperations.containsKey(operationName) || this.standardOperations.containsKey(operationName)) ? false : true;
        }

        public final JsonLogicEngine build() {
            this.standardOperations.put("log", new Log(this.logger));
            return new CommonJsonLogicEngine(new CommonLogicEvaluator(new LogicOperations(this.standardOperations, this.functionalOperations)));
        }

        public final Builder addStandardOperations(Map<String, ? extends StandardLogicOperation> operations2) {
            Intrinsics.checkNotNullParameter(operations2, "operations");
            for (Map.Entry<String, ? extends StandardLogicOperation> entry : operations2.entrySet()) {
                addStandardOperation(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final Builder addFunctionalOperations(Map<String, ? extends FunctionalLogicOperation> operations2) {
            Intrinsics.checkNotNullParameter(operations2, "operations");
            for (Map.Entry<String, ? extends FunctionalLogicOperation> entry : operations2.entrySet()) {
                addFunctionalOperation(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }
}
