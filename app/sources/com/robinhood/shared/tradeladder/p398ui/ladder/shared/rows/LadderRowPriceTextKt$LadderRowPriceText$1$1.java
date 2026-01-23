package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderRowPriceText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$LadderRowPriceText$1$1", m3645f = "LadderRowPriceText.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LadderRowPriceTextKt$LadderRowPriceText$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<String> $displayText$delegate;
    final /* synthetic */ SnapshotState<String> $pendingText$delegate;
    final /* synthetic */ String $priceText;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderRowPriceTextKt$LadderRowPriceText$1$1(String str, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, Continuation<? super LadderRowPriceTextKt$LadderRowPriceText$1$1> continuation) {
        super(2, continuation);
        this.$priceText = str;
        this.$displayText$delegate = snapshotState;
        this.$pendingText$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderRowPriceTextKt$LadderRowPriceText$1$1(this.$priceText, this.$displayText$delegate, this.$pendingText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderRowPriceTextKt$LadderRowPriceText$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$2(this.$displayText$delegate), this.$priceText)) {
                this.$pendingText$delegate.setValue(this.$priceText);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
