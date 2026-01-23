package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import string.ReplaceMode;
import utils.AnyUtils;

/* compiled from: Replace.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lstring/Replace;", "Loperation/StandardLogicOperation;", "Lstring/StringUnwrapStrategy;", "<init>", "()V", "", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class Replace implements StandardLogicOperation, StringUnwrapStrategy {
    public static final Replace INSTANCE = new Replace();

    private Replace() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        Object objM28550constructorimpl;
        List<Object> asList = AnyUtils.getAsList(expression);
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = asList.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = asList.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = asList.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            ReplaceData replaceData = new ReplaceData((String) obj, (String) obj2, (String) obj3);
            ReplaceMode.Companion companion2 = ReplaceMode.INSTANCE;
            Object obj4 = asList.get(3);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            objM28550constructorimpl = Result.m28550constructorimpl(companion2.from((String) obj4, replaceData).invoke());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            return objM28550constructorimpl;
        }
        return null;
    }
}
