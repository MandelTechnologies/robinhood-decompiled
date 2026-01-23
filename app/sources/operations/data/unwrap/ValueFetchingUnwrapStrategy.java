package operations.data.unwrap;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: ValueFetchingUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m3636d2 = {"Loperations/data/unwrap/ValueFetchingUnwrapStrategy;", "", "", "isFetchWholeDataValue", "(Ljava/lang/Object;)Z", "", "unwrapNested", "(Ljava/util/List;)Ljava/lang/Object;", "unwrapNestedValue", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface ValueFetchingUnwrapStrategy {

    /* compiled from: ValueFetchingUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static List<String> unwrapDataKeys(ValueFetchingUnwrapStrategy valueFetchingUnwrapStrategy, Object obj) {
            String string2;
            if (obj instanceof List) {
                obj = unwrapNestedValue(valueFetchingUnwrapStrategy, (List) obj);
            }
            List<String> listSplit$default = null;
            if (obj instanceof List) {
                return null;
            }
            if (obj != null && (string2 = obj.toString()) != null) {
                listSplit$default = StringsKt.split$default((CharSequence) string2, new String[]{"."}, false, 0, 6, (Object) null);
            }
            return listSplit$default == null ? CollectionsKt.emptyList() : listSplit$default;
        }

        private static Object unwrapNestedValue(ValueFetchingUnwrapStrategy valueFetchingUnwrapStrategy, List<?> list) {
            Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
            if (objFirstOrNull instanceof List) {
                return unwrapNested(valueFetchingUnwrapStrategy, (List) objFirstOrNull);
            }
            if (isFetchWholeDataValue(valueFetchingUnwrapStrategy, objFirstOrNull)) {
                return null;
            }
            return objFirstOrNull;
        }

        private static boolean isFetchWholeDataValue(ValueFetchingUnwrapStrategy valueFetchingUnwrapStrategy, Object obj) {
            return CollectionsKt.listOf(null, "", CollectionsKt.emptyList()).contains(obj);
        }

        private static Object unwrapNested(ValueFetchingUnwrapStrategy valueFetchingUnwrapStrategy, List<?> list) {
            Object objUnwrapNestedValue;
            return (list.size() <= 1 && (objUnwrapNestedValue = unwrapNestedValue(valueFetchingUnwrapStrategy, list)) != null) ? objUnwrapNestedValue : list;
        }
    }
}
