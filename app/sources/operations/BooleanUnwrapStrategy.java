package operations;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BooleanUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Loperations/BooleanUnwrapStrategy;", "", "unwrapValueAsBoolean", "", "wrappedValue", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface BooleanUnwrapStrategy {
    Boolean unwrapValueAsBoolean(Object wrappedValue);

    /* compiled from: BooleanUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Boolean unwrapValueAsBoolean(BooleanUnwrapStrategy booleanUnwrapStrategy, Object obj) {
            Double doubleOrNull;
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return Boolean.valueOf(((Number) obj).longValue() > 0);
            }
            if (!(obj instanceof String) || (doubleOrNull = StringsKt.toDoubleOrNull((String) obj)) == null) {
                return null;
            }
            return Boolean.valueOf(((long) doubleOrNull.doubleValue()) > 0);
        }
    }
}
