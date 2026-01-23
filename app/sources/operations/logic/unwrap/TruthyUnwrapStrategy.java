package operations.logic.unwrap;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TruthyUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Loperations/logic/unwrap/TruthyUnwrapStrategy;", "", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface TruthyUnwrapStrategy {

    /* compiled from: TruthyUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean unwrapValueAsBoolean(TruthyUnwrapStrategy truthyUnwrapStrategy, Object obj) {
            if (obj == null) {
                return false;
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof Number ? ((Number) obj).doubleValue() != 0.0d : obj instanceof String ? (((CharSequence) obj).length() <= 0 || Intrinsics.areEqual(obj, "[]") || Intrinsics.areEqual(obj, "null")) ? false : true : obj instanceof Collection ? !((Collection) obj).isEmpty() : ((obj instanceof Object[]) && ((Object[]) obj).length == 0) ? false : true;
        }
    }
}
