package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* compiled from: _Sequences.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$2", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SequencesKt___SequencesKt$minus$2 implements Sequence<Object> {
    final /* synthetic */ Object[] $elements;
    final /* synthetic */ Sequence<Object> $this_minus;

    @Override // kotlin.sequences.Sequence
    /* renamed from: iterator */
    public Iterator<Object> iterator2() {
        Sequence<Object> sequence = this.$this_minus;
        final Object[] objArr = this.$elements;
        return SequencesKt___SequencesKt.filterNot(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ArraysKt.contains(objArr, obj));
            }
        }).iterator2();
    }
}
