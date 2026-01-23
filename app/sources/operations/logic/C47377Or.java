package operations.logic;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import operations.logic.unwrap.TruthyUnwrapStrategy;
import utils.AnyUtils;

/* compiled from: Or.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Loperations/logic/Or;", "Loperation/StandardLogicOperation;", "Loperations/logic/unwrap/TruthyUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: operations.logic.Or */
/* loaded from: classes25.dex */
public final class C47377Or implements StandardLogicOperation, TruthyUnwrapStrategy {
    public static final C47377Or INSTANCE = new C47377Or();

    private C47377Or() {
    }

    public boolean unwrapValueAsBoolean(Object obj) {
        return TruthyUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        List<Object> asList = AnyUtils.getAsList(expression);
        List<Object> list = asList;
        Object obj = null;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Boolean)) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (INSTANCE.unwrapValueAsBoolean(next)) {
                            obj = next;
                            break;
                        }
                    }
                    return obj == null ? CollectionsKt.last((List) asList) : obj;
                }
            }
        }
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (INSTANCE.unwrapValueAsBoolean(next2)) {
                obj = next2;
                break;
            }
        }
        return Boolean.valueOf(obj != null);
    }
}
