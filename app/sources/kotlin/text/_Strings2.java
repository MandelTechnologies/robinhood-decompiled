package kotlin.text;

import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.jvm.functions.Function1;

/* compiled from: _Strings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010(\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"kotlin/text/StringsKt___StringsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "", "sourceIterator", "()Ljava/util/Iterator;", "element", "keyOf", "(C)Ljava/lang/Object;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: kotlin.text.StringsKt___StringsKt$groupingBy$1, reason: use source file name */
/* loaded from: classes14.dex */
public final class _Strings2 implements Grouping<Character, Object> {
    final /* synthetic */ Function1<Character, Object> $keySelector;
    final /* synthetic */ CharSequence $this_groupingBy;

    @Override // kotlin.collections.Grouping
    public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
        return keyOf(ch.charValue());
    }

    @Override // kotlin.collections.Grouping
    public Iterator<Character> sourceIterator() {
        return StringsKt__StringsKt.iterator(this.$this_groupingBy);
    }

    public Object keyOf(char element) {
        return this.$keySelector.invoke(Character.valueOf(element));
    }
}
