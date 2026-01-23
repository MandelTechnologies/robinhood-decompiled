package kotlin.collections;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: Collections.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* loaded from: classes14.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 implements Function1<Object, Integer> {
    final /* synthetic */ Comparable<Object> $key;
    final /* synthetic */ Function1<Object, Comparable<Object>> $selector;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Object obj) {
        return Integer.valueOf(ComparisonsKt.compareValues(this.$selector.invoke(obj), this.$key));
    }
}
