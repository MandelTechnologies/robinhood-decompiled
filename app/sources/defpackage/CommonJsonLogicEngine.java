package defpackage;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import defpackage.JsonLogicResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonJsonLogicEngine.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J(\u0010\f\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"LCommonJsonLogicEngine;", "LJsonLogicEngine;", "evaluator", "LLogicEvaluator;", "(LLogicEvaluator;)V", "evaluate", "LJsonLogicResult;", "expression", "", "", "", WebsocketGatewayConstants.DATA_KEY, "safeEvaluate", "toJsonLogicResult", "evaluatedValue", "toNormalizedResult", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CommonJsonLogicEngine implements JsonLogicEngine {
    private final LogicEvaluator evaluator;

    public CommonJsonLogicEngine(LogicEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        this.evaluator = evaluator;
    }

    @Override // defpackage.JsonLogicEngine
    public JsonLogicResult evaluate(Map<String, ? extends Object> expression, Object data) {
        JsonLogicResult jsonLogicResultSafeEvaluate;
        Intrinsics.checkNotNullParameter(expression, "expression");
        return ((!expression.isEmpty() ? expression : null) == null || (jsonLogicResultSafeEvaluate = safeEvaluate(expression, data)) == null) ? JsonLogicResult.Failure.EmptyExpression.INSTANCE : jsonLogicResultSafeEvaluate;
    }

    private final JsonLogicResult safeEvaluate(Map<String, ? extends Object> expression, Object data) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(this.evaluator.evaluateLogic(expression, data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return toJsonLogicResult(objM28550constructorimpl);
        }
        return JsonLogicResult.Failure.MissingOperation.INSTANCE;
    }

    private final JsonLogicResult toJsonLogicResult(Object evaluatedValue) {
        if (evaluatedValue != null) {
            return new JsonLogicResult.Success(toNormalizedResult(evaluatedValue));
        }
        return JsonLogicResult.Failure.NullResult.INSTANCE;
    }

    private final Object toNormalizedResult(Object obj) {
        if (!(obj instanceof Double)) {
            return obj;
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue() % 1.0d;
        if (dDoubleValue != 0.0d && Math.signum(dDoubleValue) != Math.signum(1.0d)) {
            dDoubleValue += 1.0d;
        }
        return dDoubleValue == 0.0d ? Long.valueOf((long) number.doubleValue()) : obj;
    }
}
