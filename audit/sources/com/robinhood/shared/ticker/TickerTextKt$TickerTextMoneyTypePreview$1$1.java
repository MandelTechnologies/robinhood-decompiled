package com.robinhood.shared.ticker;

import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TickerText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.ticker.TickerTextKt$TickerTextMoneyTypePreview$1$1", m3645f = "TickerText.kt", m3646l = {345}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class TickerTextKt$TickerTextMoneyTypePreview$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $valueIndex$delegate;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TickerTextKt$TickerTextMoneyTypePreview$1$1(SnapshotIntState2 snapshotIntState2, Continuation<? super TickerTextKt$TickerTextMoneyTypePreview$1$1> continuation) {
        super(2, continuation);
        this.$valueIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TickerTextKt$TickerTextMoneyTypePreview$1$1(this.$valueIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TickerTextKt$TickerTextMoneyTypePreview$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:14:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int lastIndex = CollectionsKt.getLastIndex(TickerTextKt.PREVIEW_CRYPTO_VALUES);
            if (lastIndex >= 0) {
                i = 0;
                i2 = lastIndex;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                }
                this.$valueIndex$delegate.setIntValue(i);
                if (i != i2) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = this.I$1;
        i = this.I$0;
        ResultKt.throwOnFailure(obj);
        this.$valueIndex$delegate.setIntValue(i);
        if (i != i2) {
            i++;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.$valueIndex$delegate.setIntValue(i);
            if (i != i2) {
            }
        }
        return Unit.INSTANCE;
    }
}
