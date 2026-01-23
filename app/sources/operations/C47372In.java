package operations;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: In.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Loperations/In;", "Loperation/StandardLogicOperation;", "()V", "evaluateLogic", "", "expression", "", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: operations.In */
/* loaded from: classes25.dex */
public final class C47372In implements StandardLogicOperation {
    public static final C47372In INSTANCE = new C47372In();

    private C47372In() {
    }

    @Override // operation.StandardLogicOperation
    public Boolean evaluateLogic(Object expression, Object data) {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) AnyUtils.getAsList(expression));
        Object objSecondOrNull = ListUtils3.secondOrNull(AnyUtils.getAsList(expression));
        return objSecondOrNull instanceof String ? Boolean.valueOf(StringsKt.contains$default((CharSequence) objSecondOrNull, (CharSequence) String.valueOf(objFirstOrNull), false, 2, (Object) null)) : objSecondOrNull instanceof List ? Boolean.valueOf(((List) objSecondOrNull).contains(objFirstOrNull)) : Boolean.FALSE;
    }
}
