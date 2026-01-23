package operations.numeric.unwrap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import utils.AnyUtils;
import utils.BooleanUtils;

/* compiled from: LenientUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m3636d2 = {"Loperations/numeric/unwrap/LenientUnwrapStrategy;", "", "value", "", "unwrap", "(Ljava/lang/Object;)D", "", "(Ljava/util/List;)D", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface LenientUnwrapStrategy {

    /* compiled from: LenientUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static List<Double> unwrapValueAsDouble(LenientUnwrapStrategy lenientUnwrapStrategy, Object obj) {
            List<Object> asList = AnyUtils.getAsList(obj);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
            Iterator<T> it = asList.iterator();
            while (it.hasNext()) {
                arrayList.add(unwrap(lenientUnwrapStrategy, it.next()));
            }
            return arrayList;
        }

        private static Double unwrap(LenientUnwrapStrategy lenientUnwrapStrategy, Object obj) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                return StringsKt.toDoubleOrNull((String) obj);
            }
            if (obj instanceof List) {
                return unwrap(lenientUnwrapStrategy, (List<?>) obj);
            }
            if (obj instanceof Boolean) {
                return Double.valueOf(BooleanUtils.asNumber(((Boolean) obj).booleanValue()));
            }
            if (obj == null) {
                return Double.valueOf(0.0d);
            }
            return null;
        }

        private static Double unwrap(LenientUnwrapStrategy lenientUnwrapStrategy, List<?> list) {
            int size = list.size();
            if (size == 0) {
                return Double.valueOf(0.0d);
            }
            if (size != 1) {
                return null;
            }
            return unwrap(lenientUnwrapStrategy, CollectionsKt.first((List) list));
        }
    }
}
