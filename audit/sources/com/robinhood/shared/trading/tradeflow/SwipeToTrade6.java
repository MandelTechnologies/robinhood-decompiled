package com.robinhood.shared.trading.tradeflow;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeToTrade.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeUpIndicator$1$1", m3645f = "SwipeToTrade.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeUpIndicator$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class SwipeToTrade6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $containerPadding;
    final /* synthetic */ BentoIcon4.Size16 $icon;
    final /* synthetic */ float $navigationBarHeight;
    final /* synthetic */ SwipeToTrade2 $reviewingState;
    final /* synthetic */ SnapshotState<C2002Dp> $targetHeight$delegate;
    final /* synthetic */ float $textHeight;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeToTrade6(SwipeToTrade2 swipeToTrade2, float f, float f2, float f3, BentoIcon4.Size16 size16, SnapshotState<C2002Dp> snapshotState, Continuation<? super SwipeToTrade6> continuation) {
        super(2, continuation);
        this.$reviewingState = swipeToTrade2;
        this.$containerPadding = f;
        this.$navigationBarHeight = f2;
        this.$textHeight = f3;
        this.$icon = size16;
        this.$targetHeight$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeToTrade6(this.$reviewingState, this.$containerPadding, this.$navigationBarHeight, this.$textHeight, this.$icon, this.$targetHeight$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeToTrade6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SwipeToTrade4.SwipeUpIndicator_3IgeMak$lambda$25(this.$targetHeight$delegate, this.$reviewingState == SwipeToTrade2.REVIEWING ? C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(this.$containerPadding * 2) + this.$navigationBarHeight) + this.$textHeight) + this.$icon.mo20645getSizeD9Ej5fM()) : C2002Dp.m7995constructorimpl(0));
        return Unit.INSTANCE;
    }
}
