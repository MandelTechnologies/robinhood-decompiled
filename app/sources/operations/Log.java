package operations;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: Log.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loperations/Log;", "Loperation/StandardLogicOperation;", "logger", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "evaluateLogic", "expression", WebsocketGatewayConstants.DATA_KEY, "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Log implements StandardLogicOperation {
    private final Function1<Object, Unit> logger;

    public Log(Function1<Object, Unit> function1) {
        this.logger = function1;
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) AnyUtils.getAsList(expression));
        Function1<Object, Unit> function1 = this.logger;
        if (function1 != null) {
            function1.invoke(objFirstOrNull);
        }
        return objFirstOrNull;
    }
}
