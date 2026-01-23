package operations.numeric;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import utils.AnyUtils;

/* compiled from: DoubleTypeSensitiveOperation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Loperations/numeric/DoubleTypeSensitiveOperation;", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface DoubleTypeSensitiveOperation {

    /* compiled from: DoubleTypeSensitiveOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Double doubleResultOrNull(DoubleTypeSensitiveOperation doubleTypeSensitiveOperation, Object obj, Function1<? super List<Double>, Double> operation2) {
            List listFilterNotNull;
            Intrinsics.checkNotNullParameter(operation2, "operation");
            List<Double> asDoubleList = obj != null ? AnyUtils.getAsDoubleList(obj) : null;
            List listFilterNotNull2 = asDoubleList != null ? CollectionsKt.filterNotNull(asDoubleList) : null;
            if (!Intrinsics.areEqual(listFilterNotNull2 != null ? Integer.valueOf(listFilterNotNull2.size()) : null, asDoubleList != null ? Integer.valueOf(asDoubleList.size()) : null) || asDoubleList == null || (listFilterNotNull = CollectionsKt.filterNotNull(asDoubleList)) == null) {
                return null;
            }
            return operation2.invoke(listFilterNotNull);
        }
    }
}
