package kotlin.comparisons;

import com.plaid.internal.EnumC7081g;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Comparisons.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* loaded from: classes14.dex */
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {
    final /* synthetic */ Function2<T, T, Integer> $comparison;
    final /* synthetic */ Comparator<T> $this_thenComparator;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.$this_thenComparator.compare(t, t2);
        return iCompare != 0 ? iCompare : this.$comparison.invoke(t, t2).intValue();
    }
}
