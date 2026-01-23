package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: _Sequences.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$1", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SequencesKt___SequencesKt$minus$1 implements Sequence<Object> {
    final /* synthetic */ Object $element;
    final /* synthetic */ Sequence<Object> $this_minus;

    @Override // kotlin.sequences.Sequence
    /* renamed from: iterator */
    public Iterator<Object> iterator2() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Sequence<Object> sequence = this.$this_minus;
        final Object obj = this.$element;
        return SequencesKt___SequencesKt.filter(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$1.iterator$lambda$0(booleanRef, obj, obj2));
            }
        }).iterator2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean iterator$lambda$0(Ref.BooleanRef booleanRef, Object obj, Object obj2) {
        if (booleanRef.element || !Intrinsics.areEqual(obj2, obj)) {
            return true;
        }
        booleanRef.element = true;
        return false;
    }
}
