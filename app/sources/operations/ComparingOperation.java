package operations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operations.ComparableUnwrapStrategy;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: ComparingOperation.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0002J4\u0010\n\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0002¨\u0006\u000f"}, m3636d2 = {"Loperations/ComparingOperation;", "Loperations/ComparableUnwrapStrategy;", "compare", "", "values", "", "", "operator", "Lkotlin/Function2;", "", "compareListOfTwo", "", "compareOrNull", "first", "second", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface ComparingOperation extends ComparableUnwrapStrategy {
    boolean compareListOfTwo(List<? extends Object> values, Function2<? super Integer, ? super Integer, Boolean> operator);

    /* compiled from: ComparingOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static List<Comparable<?>> unwrapAsComparable(ComparingOperation comparingOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return ComparableUnwrapStrategy.DefaultImpls.unwrapAsComparable(comparingOperation, comparable, comparable2);
        }

        public static List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(ComparingOperation comparingOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return ComparableUnwrapStrategy.DefaultImpls.unwrapAsComparableWithTypeSensitivity(comparingOperation, comparable, comparable2);
        }

        public static Boolean unwrapValueAsBoolean(ComparingOperation comparingOperation, Object obj) {
            return ComparableUnwrapStrategy.DefaultImpls.unwrapValueAsBoolean(comparingOperation, obj);
        }

        public static boolean compareListOfTwo(ComparingOperation comparingOperation, List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> operator) {
            List<Comparable<?>> comparableList;
            Intrinsics.checkNotNullParameter(operator, "operator");
            if (list == null || (comparableList = AnyUtils.getComparableList(list)) == null) {
                return false;
            }
            return compare(comparingOperation, comparableList, operator);
        }

        private static boolean compare(ComparingOperation comparingOperation, List<? extends Comparable<?>> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
            Integer numCompareOrNull = compareOrNull(comparingOperation, (Comparable) CollectionsKt.firstOrNull((List) list), (Comparable) ListUtils3.secondOrNull(list));
            if (numCompareOrNull != null) {
                return function2.invoke(Integer.valueOf(numCompareOrNull.intValue()), 0).booleanValue();
            }
            return false;
        }

        private static Integer compareOrNull(ComparingOperation comparingOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            List<Comparable<?>> listUnwrapAsComparable = comparingOperation.unwrapAsComparable(comparable, comparable2);
            if (listUnwrapAsComparable == null) {
                return null;
            }
            List<Comparable<?>> list = listUnwrapAsComparable;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Comparable) it.next()) != null) {
                        if (!z || !list.isEmpty()) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((Comparable) it2.next()) == null) {
                                    return null;
                                }
                            }
                        }
                        return Integer.valueOf(ComparisonsKt.compareValues((Comparable) CollectionsKt.firstOrNull((List) listUnwrapAsComparable), (Comparable) ListUtils3.secondOrNull(listUnwrapAsComparable)));
                    }
                }
            }
            return Integer.valueOf(ComparisonsKt.compareValues((Comparable) CollectionsKt.firstOrNull((List) listUnwrapAsComparable), (Comparable) ListUtils3.secondOrNull(listUnwrapAsComparable)));
        }
    }
}
