package operations.numeric.unwrap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import utils.AnyUtils;

/* compiled from: StrictUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0082\u0010¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Loperations/numeric/unwrap/StrictUnwrapStrategy;", "", "value", "unwrap", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface StrictUnwrapStrategy {

    /* compiled from: StrictUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static List<Object> unwrapValue(StrictUnwrapStrategy strictUnwrapStrategy, Object obj) {
            List<Object> asList = AnyUtils.getAsList(obj);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
            Iterator<T> it = asList.iterator();
            while (it.hasNext()) {
                arrayList.add(unwrap(strictUnwrapStrategy, it.next()));
            }
            return arrayList;
        }

        private static Object unwrap(StrictUnwrapStrategy strictUnwrapStrategy, Object obj) {
            while (!(obj instanceof Number)) {
                if (obj instanceof String) {
                    return StringsKt.toDoubleOrNull((String) obj);
                }
                if (!(obj instanceof List)) {
                    return null;
                }
                obj = CollectionsKt.firstOrNull((List<? extends Object>) obj);
            }
            return Double.valueOf(((Number) obj).doubleValue());
        }
    }
}
