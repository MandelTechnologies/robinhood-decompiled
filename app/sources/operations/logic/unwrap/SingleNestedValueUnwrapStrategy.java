package operations.logic.unwrap;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SingleNestedValueUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, m3636d2 = {"Loperations/logic/unwrap/SingleNestedValueUnwrapStrategy;", "", "normalizeNumberString", "value", "unwrapSingleNestedValueOrDefault", "unwrapSingleNestedValue", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface SingleNestedValueUnwrapStrategy {
    Object unwrapSingleNestedValueOrDefault(Object value);

    /* compiled from: SingleNestedValueUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Object unwrapSingleNestedValueOrDefault(SingleNestedValueUnwrapStrategy singleNestedValueUnwrapStrategy, Object obj) {
            Object objUnwrapSingleNestedValue = unwrapSingleNestedValue(singleNestedValueUnwrapStrategy, obj);
            if (!Intrinsics.areEqual(objUnwrapSingleNestedValue, obj)) {
                return new SingleNestedValue(normalizeNumberString(singleNestedValueUnwrapStrategy, objUnwrapSingleNestedValue));
            }
            return normalizeNumberString(singleNestedValueUnwrapStrategy, obj);
        }

        private static Object unwrapSingleNestedValue(SingleNestedValueUnwrapStrategy singleNestedValueUnwrapStrategy, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() == 1) {
                    return unwrapSingleNestedValue(singleNestedValueUnwrapStrategy, CollectionsKt.firstOrNull(list));
                }
            }
            return obj;
        }

        private static Object normalizeNumberString(SingleNestedValueUnwrapStrategy singleNestedValueUnwrapStrategy, Object obj) {
            String string2;
            Object intOrNull;
            Object doubleOrNull = null;
            String str = obj instanceof String ? (String) obj : null;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                doubleOrNull = intOrNull;
            } else if (str != null) {
                doubleOrNull = StringsKt.toDoubleOrNull(str);
            }
            return (doubleOrNull == null || (string2 = doubleOrNull.toString()) == null) ? obj : string2;
        }
    }
}
