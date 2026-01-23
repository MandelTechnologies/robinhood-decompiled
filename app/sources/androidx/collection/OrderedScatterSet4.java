package androidx.collection;

import androidx.collection.OrderedScatterSet3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceBuilder2;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: OrderedScatterSet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", m3645f = "OrderedScatterSet.kt", m3646l = {1489}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1, reason: use source file name */
/* loaded from: classes4.dex */
final class OrderedScatterSet4<E> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super E>, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OrderedScatterSet3<E> this$0;
    final /* synthetic */ OrderedScatterSet3.C09251 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderedScatterSet4(OrderedScatterSet3<E> orderedScatterSet3, OrderedScatterSet3.C09251 c09251, Continuation<? super OrderedScatterSet4> continuation) {
        super(2, continuation);
        this.this$0 = orderedScatterSet3;
        this.this$1 = c09251;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderedScatterSet4 orderedScatterSet4 = new OrderedScatterSet4(this.this$0, this.this$1, continuation);
        orderedScatterSet4.L$0 = obj;
        return orderedScatterSet4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceBuilder2<? super E> sequenceBuilder2, Continuation<? super Unit> continuation) {
        return ((OrderedScatterSet4) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        OrderedScatterSet3<E> orderedScatterSet3;
        int i;
        OrderedScatterSet3.C09251 c09251;
        long[] jArr;
        SequenceBuilder2 sequenceBuilder2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceBuilder2 sequenceBuilder22 = (SequenceBuilder2) this.L$0;
            OrderedScatterSet2 orderedScatterSet2 = ((OrderedScatterSet3) this.this$0).parent;
            OrderedScatterSet3.C09251 c092512 = this.this$1;
            orderedScatterSet3 = this.this$0;
            long[] jArr2 = orderedScatterSet2.nodes;
            i = orderedScatterSet2.tail;
            c09251 = c092512;
            jArr = jArr2;
            sequenceBuilder2 = sequenceBuilder22;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            jArr = (long[]) this.L$3;
            orderedScatterSet3 = (OrderedScatterSet3) this.L$2;
            c09251 = (OrderedScatterSet3.C09251) this.L$1;
            sequenceBuilder2 = (SequenceBuilder2) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            c09251.setCurrent(i);
            Object obj2 = ((OrderedScatterSet3) orderedScatterSet3).parent.elements[i];
            this.L$0 = sequenceBuilder2;
            this.L$1 = c09251;
            this.L$2 = orderedScatterSet3;
            this.L$3 = jArr;
            this.I$0 = i3;
            this.label = 1;
            if (sequenceBuilder2.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i3;
        }
        return Unit.INSTANCE;
    }
}
