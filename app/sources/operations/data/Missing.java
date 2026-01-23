package operations.data;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: Missing.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u0005H\u0002¨\u0006\n"}, m3636d2 = {"Loperations/data/Missing;", "Loperation/StandardLogicOperation;", "()V", "evaluateLogic", "", "", "expression", WebsocketGatewayConstants.DATA_KEY, "isNullOrEmptyString", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Missing implements StandardLogicOperation {
    public static final Missing INSTANCE = new Missing();

    private Missing() {
    }

    @Override // operation.StandardLogicOperation
    public List<Object> evaluateLogic(Object expression, Object data) {
        List<Object> asList = AnyUtils.getAsList(expression);
        ArrayList arrayList = new ArrayList();
        for (Object obj : asList) {
            if (!INSTANCE.isNullOrEmptyString(Var.INSTANCE.evaluateLogic(obj, data))) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean isNullOrEmptyString(Object obj) {
        if (obj != null) {
            return (obj instanceof String) && ((CharSequence) obj).length() == 0;
        }
        return true;
    }
}
