package operations.data;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import operations.data.unwrap.ValueFetchingUnwrapStrategy;
import utils.AnyUtils;
import utils.ListUtils3;
import utils.StringUtils2;

/* compiled from: Var.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J(\u0010\r\u001a\u0004\u0018\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000bH\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J(\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0012"}, m3636d2 = {"Loperations/data/Var;", "Loperation/StandardLogicOperation;", "Loperations/data/unwrap/ValueFetchingUnwrapStrategy;", "()V", "evaluateLogic", "", "expression", WebsocketGatewayConstants.DATA_KEY, "getIndexedValue", "value", "indexParts", "", "", "getRecursive", "indexes", "shouldUseDefaultValue", "", "fetchValueOrDefault", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class Var implements StandardLogicOperation, ValueFetchingUnwrapStrategy {
    public static final Var INSTANCE = new Var();

    private Var() {
    }

    public List<String> unwrapDataKeys(Object obj) {
        return ValueFetchingUnwrapStrategy.DefaultImpls.unwrapDataKeys(this, obj);
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        List<String> listUnwrapDataKeys = unwrapDataKeys(AnyUtils.getAsList(expression));
        if (listUnwrapDataKeys != null) {
            return fetchValueOrDefault(listUnwrapDataKeys, expression, data);
        }
        return null;
    }

    private final Object fetchValueOrDefault(List<String> list, Object obj, Object obj2) {
        if (!list.isEmpty()) {
            obj2 = getIndexedValue(obj2, list);
        }
        if (shouldUseDefaultValue(obj2, obj)) {
            obj2 = null;
            List list2 = obj instanceof List ? (List) obj : null;
            if (list2 != null) {
                return ListUtils3.secondOrNull(list2);
            }
        }
        return obj2;
    }

    private final Object getIndexedValue(Object value, List<String> indexParts) {
        if (value instanceof List) {
            if (indexParts.size() == 1) {
                return ((List) value).get(StringUtils2.getIntOrZero((String) CollectionsKt.first((List) indexParts)));
            }
            return getRecursive(indexParts, (List) value);
        }
        if (value instanceof Map) {
            value = ((Map) value).get(CollectionsKt.first((List) indexParts));
            for (String str : CollectionsKt.drop(indexParts, 1)) {
                Map map = value instanceof Map ? (Map) value : null;
                value = map != null ? map.get(str) : null;
            }
        }
        return value;
    }

    private final boolean shouldUseDefaultValue(Object value, Object expression) {
        return (Intrinsics.areEqual(value, expression) || value == null) && (expression instanceof List) && ((List) expression).size() > 1;
    }

    private final Object getRecursive(List<String> indexes, List<? extends Object> data) {
        String str = (String) CollectionsKt.firstOrNull((List) indexes);
        if (str == null) {
            return null;
        }
        Object orNull = CollectionsKt.getOrNull(data, StringUtils2.getIntOrZero(str));
        if (orNull instanceof List) {
            return INSTANCE.getRecursive(indexes.subList(1, indexes.size()), (List) orNull);
        }
        return CollectionsKt.getOrNull(data, StringUtils2.getIntOrZero(str));
    }
}
