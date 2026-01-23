package operations.logic;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import operation.StandardLogicOperation;
import operations.logic.unwrap.TruthyUnwrapStrategy;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: If.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u0002¨\u0006\n"}, m3636d2 = {"Loperations/logic/If;", "Loperation/StandardLogicOperation;", "Loperations/logic/unwrap/TruthyUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "recursiveIf", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: operations.logic.If */
/* loaded from: classes25.dex */
public final class C47376If implements StandardLogicOperation, TruthyUnwrapStrategy {
    public static final C47376If INSTANCE = new C47376If();

    private C47376If() {
    }

    public boolean unwrapValueAsBoolean(Object obj) {
        return TruthyUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        return recursiveIf(AnyUtils.getAsList(expression));
    }

    private final Object recursiveIf(List<? extends Object> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return CollectionsKt.firstOrNull((List) list);
        }
        if (size != 2) {
            return size != 3 ? unwrapValueAsBoolean(CollectionsKt.firstOrNull((List) list)) ? ListUtils3.secondOrNull(list) : recursiveIf(list.subList(2, list.size())) : unwrapValueAsBoolean(CollectionsKt.firstOrNull((List) list)) ? ListUtils3.secondOrNull(list) : ListUtils3.thirdOrNull(list);
        }
        if (unwrapValueAsBoolean(CollectionsKt.firstOrNull((List) list))) {
            return ListUtils3.secondOrNull(list);
        }
        return null;
    }
}
