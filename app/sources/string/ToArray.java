package string;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: ToArray.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0007"}, m3636d2 = {"Lstring/ToArray;", "Loperation/StandardLogicOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class ToArray implements StandardLogicOperation {
    public static final ToArray INSTANCE = new ToArray();

    private ToArray() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        List listSplit$default;
        List listDrop;
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) AnyUtils.getAsList(expression));
        String str = objFirstOrNull instanceof String ? (String) objFirstOrNull : null;
        if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{""}, false, 0, 6, (Object) null)) == null || (listDrop = CollectionsKt.drop(listSplit$default, 1)) == null) {
            return null;
        }
        return CollectionsKt.dropLast(listDrop, 1);
    }
}
