package androidx.collection;

import androidx.collection.ScatterSet3;
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
/* compiled from: ScatterSet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", m3645f = "ScatterSet.kt", m3646l = {1188}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.collection.MutableSetWrapper$iterator$1$iterator$1, reason: use source file name */
/* loaded from: classes4.dex */
final class ScatterSet4<E> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super E>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ScatterSet3<E> this$0;
    final /* synthetic */ ScatterSet3.C09261 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScatterSet4(ScatterSet3<E> scatterSet3, ScatterSet3.C09261 c09261, Continuation<? super ScatterSet4> continuation) {
        super(2, continuation);
        this.this$0 = scatterSet3;
        this.this$1 = c09261;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScatterSet4 scatterSet4 = new ScatterSet4(this.this$0, this.this$1, continuation);
        scatterSet4.L$0 = obj;
        return scatterSet4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceBuilder2<? super E> sequenceBuilder2, Continuation<? super Unit> continuation) {
        return ((ScatterSet4) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceBuilder2 sequenceBuilder2;
        ScatterSet3.C09261 c09261;
        ScatterSet3<E> scatterSet3;
        long[] jArr;
        int length;
        int i;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceBuilder2 = (SequenceBuilder2) this.L$0;
            ScatterSet2 scatterSet2 = ((ScatterSet3) this.this$0).parent;
            c09261 = this.this$1;
            scatterSet3 = this.this$0;
            jArr = scatterSet2.metadata;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.I$3;
        int i4 = this.I$2;
        long j2 = this.J$0;
        int i5 = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = (long[]) this.L$3;
        ScatterSet3<E> scatterSet32 = (ScatterSet3) this.L$2;
        ScatterSet3.C09261 c092612 = (ScatterSet3.C09261) this.L$1;
        SequenceBuilder2 sequenceBuilder22 = (SequenceBuilder2) this.L$0;
        ResultKt.throwOnFailure(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                int i7 = i6;
                i = i5;
                length = i7;
                jArr = jArr2;
                scatterSet3 = scatterSet32;
                c09261 = c092612;
                sequenceBuilder2 = sequenceBuilder22;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        int i9 = i;
                        i6 = length;
                        i5 = i9;
                        sequenceBuilder22 = sequenceBuilder2;
                        i3 = 0;
                        jArr2 = jArr;
                        scatterSet32 = scatterSet3;
                        i4 = i8;
                        c092612 = c09261;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i10 = (i5 << 3) + i3;
                                c092612.setCurrent(i10);
                                Object obj2 = ((ScatterSet3) scatterSet32).parent.elements[i10];
                                this.L$0 = sequenceBuilder22;
                                this.L$1 = c092612;
                                this.L$2 = scatterSet32;
                                this.L$3 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i5;
                                this.J$0 = j2;
                                this.I$2 = i4;
                                this.I$3 = i3;
                                this.label = 1;
                                if (sequenceBuilder22.yield(obj2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
