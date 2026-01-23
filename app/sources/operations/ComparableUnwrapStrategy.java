package operations;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import operations.BooleanUnwrapStrategy;

/* compiled from: ComparableUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000f\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0016J2\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0016¨\u0006\b"}, m3636d2 = {"Loperations/ComparableUnwrapStrategy;", "Loperations/BooleanUnwrapStrategy;", "unwrapAsComparable", "", "", "first", "second", "unwrapAsComparableWithTypeSensitivity", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface ComparableUnwrapStrategy extends BooleanUnwrapStrategy {
    List<Comparable<?>> unwrapAsComparable(Comparable<?> first, Comparable<?> second);

    List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(Comparable<?> first, Comparable<?> second);

    /* compiled from: ComparableUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Boolean unwrapValueAsBoolean(ComparableUnwrapStrategy comparableUnwrapStrategy, Object obj) {
            return BooleanUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(comparableUnwrapStrategy, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List<Comparable<?>> unwrapAsComparable(ComparableUnwrapStrategy comparableUnwrapStrategy, Comparable<?> comparable, Comparable<?> comparable2) {
            boolean z = comparable instanceof Number;
            if (z && (comparable2 instanceof Number)) {
                return CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(((Number) comparable).doubleValue()), Double.valueOf(((Number) comparable2).doubleValue())});
            }
            if ((comparable instanceof String) && (comparable2 instanceof Number)) {
                return CollectionsKt.listOf((Object[]) new Double[]{StringsKt.toDoubleOrNull((String) comparable), Double.valueOf(((Number) comparable2).doubleValue())});
            }
            if (z && (comparable2 instanceof String)) {
                return CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(((Number) comparable).doubleValue()), StringsKt.toDoubleOrNull((String) comparable2)});
            }
            if ((comparable instanceof Boolean) || (comparable2 instanceof Boolean)) {
                return CollectionsKt.listOf((Object[]) new Boolean[]{comparableUnwrapStrategy.unwrapValueAsBoolean(comparable), comparableUnwrapStrategy.unwrapValueAsBoolean(comparable2)});
            }
            return comparableUnwrapStrategy.unwrapAsComparableWithTypeSensitivity(comparable, comparable2);
        }

        public static List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(ComparableUnwrapStrategy comparableUnwrapStrategy, Comparable<?> comparable, Comparable<?> comparable2) {
            if (comparable != 0 && comparable2 != 0 && comparable.getClass() == comparable2.getClass()) {
                return CollectionsKt.listOf((Object[]) new Comparable[]{comparable, comparable2});
            }
            if (comparable == 0 && comparable2 == 0) {
                return CollectionsKt.listOf((Object[]) new Void[]{(Void) comparable, (Void) comparable2});
            }
            return null;
        }
    }
}
