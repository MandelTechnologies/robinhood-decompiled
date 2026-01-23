package operations.numeric.compare;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import operations.ComparingOperation;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: RangeComparingOperation.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\b\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Loperations/numeric/compare/RangeComparingOperation;", "Loperations/ComparingOperation;", "", "", "Lkotlin/Function2;", "", "", "operator", "between", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Z", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface RangeComparingOperation extends ComparingOperation {

    /* compiled from: RangeComparingOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean compareListOfTwo(RangeComparingOperation rangeComparingOperation, List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> operator) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            return ComparingOperation.DefaultImpls.compareListOfTwo(rangeComparingOperation, list, operator);
        }

        public static List<Comparable<?>> unwrapAsComparable(RangeComparingOperation rangeComparingOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return ComparingOperation.DefaultImpls.unwrapAsComparable(rangeComparingOperation, comparable, comparable2);
        }

        public static List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(RangeComparingOperation rangeComparingOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return ComparingOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(rangeComparingOperation, comparable, comparable2);
        }

        public static Boolean unwrapValueAsBoolean(RangeComparingOperation rangeComparingOperation, Object obj) {
            return ComparingOperation.DefaultImpls.unwrapValueAsBoolean(rangeComparingOperation, obj);
        }

        public static boolean compareOrBetween(RangeComparingOperation rangeComparingOperation, List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> operator) {
            List<Comparable<?>> comparableList;
            Intrinsics.checkNotNullParameter(operator, "operator");
            if (list != null && (comparableList = AnyUtils.getComparableList(list)) != null) {
                if (comparableList.size() == 2) {
                    return rangeComparingOperation.compareListOfTwo(comparableList, operator);
                }
                if (comparableList.size() > 2) {
                    return between(rangeComparingOperation, comparableList, operator);
                }
            }
            return false;
        }

        private static boolean between(RangeComparingOperation rangeComparingOperation, List<? extends Comparable<?>> list, Function2<? super Integer, ? super Integer, Boolean> function2) {
            return rangeComparingOperation.compareListOfTwo(CollectionsKt.listOf((Object[]) new Comparable[]{(Comparable) CollectionsKt.firstOrNull((List) list), (Comparable) ListUtils3.secondOrNull(list)}), function2) && rangeComparingOperation.compareListOfTwo(CollectionsKt.listOf((Object[]) new Comparable[]{(Comparable) ListUtils3.secondOrNull(list), (Comparable) ListUtils3.thirdOrNull(list)}), function2);
        }
    }
}
