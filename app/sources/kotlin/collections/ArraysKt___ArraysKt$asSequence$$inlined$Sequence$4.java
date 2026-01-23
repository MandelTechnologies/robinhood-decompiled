package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIterators7;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* compiled from: Sequences.kt */
@Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, m3636d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4 implements Sequence<Integer> {
    final /* synthetic */ int[] $this_asSequence$inlined;

    @Override // kotlin.sequences.Sequence
    /* renamed from: iterator */
    public Iterator<Integer> iterator2() {
        return ArrayIterators7.iterator(this.$this_asSequence$inlined);
    }
}
