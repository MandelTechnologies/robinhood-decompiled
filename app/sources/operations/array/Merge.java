package operations.array;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import utils.AnyUtils;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0002¨\u0006\t"}, m3636d2 = {"Loperations/array/Merge;", "Loperation/StandardLogicOperation;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "mergeOrAdd", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Merge implements StandardLogicOperation {
    public static final Merge INSTANCE = new Merge();

    private Merge() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        return mergeOrAdd(AnyUtils.getAsList(expression));
    }

    private final List<Object> mergeOrAdd(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CollectionsKt.addAll(arrayList, obj instanceof List ? (List) obj : CollectionsKt.listOf(obj));
        }
        return arrayList;
    }
}
