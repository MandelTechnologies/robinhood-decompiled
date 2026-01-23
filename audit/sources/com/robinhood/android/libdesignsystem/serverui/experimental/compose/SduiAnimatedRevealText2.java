package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.runtime.SnapshotIntState2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SduiAnimatedRevealText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt$SduiAnimatedRevealText$1$1", m3645f = "SduiAnimatedRevealText.kt", m3646l = {44, 47}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt$SduiAnimatedRevealText$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiAnimatedRevealText2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $currentWordIndex$delegate;
    final /* synthetic */ long $initialDelay;
    final /* synthetic */ long $interval;
    final /* synthetic */ List<String> $words;
    long J$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiAnimatedRevealText2(long j, List<String> list, long j2, SnapshotIntState2 snapshotIntState2, Continuation<? super SduiAnimatedRevealText2> continuation) {
        super(2, continuation);
        this.$initialDelay = j;
        this.$words = list;
        this.$interval = j2;
        this.$currentWordIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiAnimatedRevealText2(this.$initialDelay, this.$words, this.$interval, this.$currentWordIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiAnimatedRevealText2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        SnapshotIntState2 snapshotIntState2;
        Iterator<Integer> it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j2 = this.$initialDelay;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                it = (Iterator) this.L$1;
                snapshotIntState2 = (SnapshotIntState2) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    snapshotIntState2.setIntValue(((PrimitiveIterators6) it).nextInt());
                    this.L$0 = snapshotIntState2;
                    this.L$1 = it;
                    this.J$0 = j;
                    this.label = 2;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        PrimitiveRanges2 indices = CollectionsKt.getIndices(this.$words);
        j = this.$interval;
        snapshotIntState2 = this.$currentWordIndex$delegate;
        it = indices.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
