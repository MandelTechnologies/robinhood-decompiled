package operations.logic.unwrap;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import utils.AnyUtils;
import utils.BooleanUtils;

/* compiled from: EqualsUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¨\u0006\u0007"}, m3636d2 = {"Loperations/logic/unwrap/EqualsUnwrapStrategy;", "", "unwrapValue", "wrappedValue", "unwrapList", "", "unwrapNotBooleanSingleElement", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface EqualsUnwrapStrategy {
    Object unwrapValue(Object wrappedValue);

    /* compiled from: EqualsUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Object unwrapValue(EqualsUnwrapStrategy equalsUnwrapStrategy, Object obj) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                Double doubleOrNull = StringsKt.toDoubleOrNull((String) obj);
                if (doubleOrNull != null) {
                    return doubleOrNull;
                }
            } else if (obj instanceof List) {
                Object objUnwrapList = unwrapList(equalsUnwrapStrategy, (List) obj);
                if (objUnwrapList != null) {
                    return objUnwrapList;
                }
            } else if (obj instanceof Boolean) {
                return Double.valueOf(BooleanUtils.asNumber(((Boolean) obj).booleanValue()));
            }
            return obj;
        }

        private static Object unwrapList(EqualsUnwrapStrategy equalsUnwrapStrategy, List<?> list) {
            return AnyUtils.isSingleNullList(list) ? Double.valueOf(0.0d) : list.isEmpty() ? "" : unwrapNotBooleanSingleElement(equalsUnwrapStrategy, list);
        }

        private static Object unwrapNotBooleanSingleElement(EqualsUnwrapStrategy equalsUnwrapStrategy, List<?> list) {
            if (((list.size() != 1 || (CollectionsKt.firstOrNull((List) list) instanceof Boolean)) ? null : list) != null) {
                return equalsUnwrapStrategy.unwrapValue(CollectionsKt.firstOrNull((List) list));
            }
            return null;
        }
    }
}
