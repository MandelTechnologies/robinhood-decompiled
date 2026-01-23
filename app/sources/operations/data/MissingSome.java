package operations.data;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import utils.ListUtils3;
import utils.StringUtils2;

/* compiled from: MissingSome.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0007"}, m3636d2 = {"Loperations/data/MissingSome;", "Loperation/StandardLogicOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class MissingSome implements StandardLogicOperation {
    public static final MissingSome INSTANCE = new MissingSome();

    private MissingSome() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        Object objFirstOrNull;
        String string2;
        boolean z = expression instanceof List;
        List list = z ? (List) expression : null;
        long longOrZero = (list == null || (objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list)) == null || (string2 = objFirstOrNull.toString()) == null) ? 0L : StringUtils2.getLongOrZero(string2);
        List list2 = z ? (List) expression : null;
        Object objSecondOrNull = list2 != null ? ListUtils3.secondOrNull(list2) : null;
        List listEmptyList = objSecondOrNull instanceof List ? (List) objSecondOrNull : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<Object> listEvaluateLogic = Missing.INSTANCE.evaluateLogic((Object) listEmptyList, data);
        List<Object> list3 = ((long) (listEmptyList.size() - listEvaluateLogic.size())) < longOrZero ? listEvaluateLogic : null;
        return list3 == null ? CollectionsKt.emptyList() : list3;
    }
}
