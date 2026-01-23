package kotlin.comparisons;

import com.plaid.internal.EnumC7081g;
import com.singular.sdk.internal.Constants;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a[\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a/\u0010\f\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\r\u001a[\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001aV\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u000fH\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"T", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "", "Lkotlin/Function1;", "", "selectors", "", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "compareValuesByImpl", "compareValues", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "compareBy", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "comparator", "then", "(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;", "naturalOrder", "()Ljava/util/Comparator;", "reverseOrder", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes21.dex */
public class ComparisonsKt__ComparisonsKt {
    public static <T> int compareValuesBy(T t, T t2, Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, selectors);
    }

    private static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iCompareValues = compareValues(function1.invoke(t), function1.invoke(t2));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    public static <T extends Comparable<?>> int compareValues(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> Comparator<T> compareBy(final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt(selectors, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int compareBy$lambda$0$ComparisonsKt__ComparisonsKt(Function1[] function1Arr, Object obj, Object obj2) {
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(obj, obj2, function1Arr);
    }

    /* compiled from: Comparisons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2 */
    /* loaded from: classes14.dex */
    public final class C458302<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> $selector;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1<T, Comparable<?>> function1 = this.$selector;
            return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$3 */
    /* loaded from: classes14.dex */
    public final class C458313<T> implements Comparator {
        final /* synthetic */ Comparator<Object> $comparator;
        final /* synthetic */ Function1<T, Object> $selector;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<Object> comparator = this.$comparator;
            Function1<T, Object> function1 = this.$selector;
            return comparator.compare(function1.invoke(t), function1.invoke(t2));
        }
    }

    public static <T> Comparator<T> then(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int then$lambda$1$ComparisonsKt__ComparisonsKt(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return naturalOrderComparator;
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return reverseOrderComparator;
    }
}
